/*
 * Copyright (c) 2004-2013 Eike Stepper (Berlin, Germany) and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * 
 * Contributors:
 *    Eike Stepper - initial API and implementation
 */
package org.eclipse.emf.cdo.releng.preferences.util;

import org.eclipse.emf.cdo.releng.preferences.PreferenceNode;
import org.eclipse.emf.cdo.releng.preferences.PreferencesFactory;
import org.eclipse.emf.cdo.releng.preferences.Property;

import org.eclipse.emf.common.notify.Notifier;
import org.eclipse.emf.common.notify.impl.AdapterImpl;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;

import org.eclipse.core.runtime.IPath;
import org.eclipse.core.runtime.Platform;
import org.eclipse.core.runtime.preferences.IEclipsePreferences;
import org.eclipse.core.runtime.preferences.IEclipsePreferences.NodeChangeEvent;
import org.eclipse.core.runtime.preferences.IEclipsePreferences.PreferenceChangeEvent;

import org.osgi.service.prefs.BackingStoreException;
import org.osgi.service.prefs.Preferences;

import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/**
 * @author Eike Stepper
 */
public final class PreferencesUtil
{
  /**
   * A resource load option to load an instance using {@link #getRootPreferenceNode(boolean) PreferencesUtil.getRootPreferenceNode(true)}.
   * The resource must be {@link Resource#unload() unloaded}, to avoid dangling listeners.
   */
  public static final String OPTION_SYNCHRONIZED_PREFERENCES = "SYNCHRONIZED_PREFERENCES";

  private static final IEclipsePreferences ROOT = Platform.getPreferencesService().getRootNode();

  public static final URI ROOT_PREFERENCE_NODE_URI = URI.createURI("preference:/");

  private static class PreferencesAdapter extends AdapterImpl implements IEclipsePreferences.INodeChangeListener,
      IEclipsePreferences.IPreferenceChangeListener
  {
    protected IEclipsePreferences preferences;

    public PreferencesAdapter(IEclipsePreferences preferences)
    {
      this.preferences = preferences;

      preferences.addNodeChangeListener(this);
      preferences.addPreferenceChangeListener(this);
    }

    @Override
    public boolean isAdapterForType(Object type)
    {
      return type == PreferencesAdapter.class;
    }

    public void preferenceChange(PreferenceChangeEvent event)
    {
      PreferenceNode preferenceNode = (PreferenceNode)target;
      String name = event.getKey();
      Object value = event.getNewValue();
      EList<Property> properties = preferenceNode.getProperties();
      for (int i = 0, size = properties.size(); i < size; ++i)
      {
        Property property = properties.get(i);
        int comparison = property.getName().compareTo(name);
        if (comparison == 0)
        {
          if (value == null)
          {
            properties.remove(i);
          }
          else
          {
            property.setValue(value.toString());
          }
          return;
        }
        else if (comparison > 0)
        {
          if (value != null)
          {
            property = PreferencesFactory.eINSTANCE.createProperty();
            property.setName(name);
            property.setValue(value.toString());
            properties.add(i, property);
          }
          return;
        }
      }
      Property property = PreferencesFactory.eINSTANCE.createProperty();
      property.setName(name);
      property.setValue(value.toString());
      properties.add(property);
    }

    public void added(NodeChangeEvent event)
    {
      PreferenceNode preferenceNode = (PreferenceNode)target;
      Preferences childNode = event.getChild();
      PreferenceNode childPreferenceNode = PreferencesFactory.eINSTANCE.createPreferenceNode();
      String name = childNode.name();
      childPreferenceNode.setName(name);
      traverse(childPreferenceNode, childNode, true);
      EList<PreferenceNode> children = preferenceNode.getChildren();
      for (int i = 0, size = children.size(); i < size; ++i)
      {
        PreferenceNode otherChildPreferenceNode = children.get(i);
        if (otherChildPreferenceNode.getName().compareTo(name) >= 0)
        {
          children.add(i, childPreferenceNode);
          return;
        }
      }
      children.add(childPreferenceNode);
    }

    public void removed(NodeChangeEvent event)
    {
      PreferenceNode preferenceNode = (PreferenceNode)target;
      Preferences childNode = event.getChild();
      String name = childNode.name();
      EList<PreferenceNode> children = preferenceNode.getChildren();
      for (int i = 0, size = children.size(); i < size; ++i)
      {
        PreferenceNode childPreferenceNode = children.get(i);
        if (childPreferenceNode.getName().equals(name))
        {
          children.remove(i);
          return;
        }
      }
    }

    @Override
    public void unsetTarget(Notifier oldTarget)
    {
      super.unsetTarget(oldTarget);

      preferences.removeNodeChangeListener(this);
      preferences.removePreferenceChangeListener(this);
    }
  }

  public static PreferenceNode getRootPreferenceNode()
  {
    return getRootPreferenceNode(false);
  }

  public static PreferenceNode getRootPreferenceNode(boolean isSynchronized)
  {
    ResourceSet resourceSet = new ResourceSetImpl();
    Resource resource = resourceSet.createResource(ROOT_PREFERENCE_NODE_URI.appendSegment("*.preferences"));
    PreferenceNode root = PreferencesFactory.eINSTANCE.createPreferenceNode();
    traverse(root, ROOT, isSynchronized);
    resource.getContents().add(root);

    return root;
  }

  private static void traverse(PreferenceNode preferenceNode, Preferences node, boolean isSynchronized)
  {
    try
    {
      if (isSynchronized && node instanceof IEclipsePreferences)
      {
        preferenceNode.eAdapters().add(new PreferencesAdapter((IEclipsePreferences)node));
      }

      preferenceNode.setName(node.name());

      EList<PreferenceNode> children = preferenceNode.getChildren();
      String[] childrenNames = node.childrenNames();
      Arrays.sort(childrenNames);
      for (String name : childrenNames)
      {
        Preferences childNode = node.node(name);
        PreferenceNode childPreferenceNode = PreferencesFactory.eINSTANCE.createPreferenceNode();
        traverse(childPreferenceNode, childNode, isSynchronized);
        children.add(childPreferenceNode);
      }
      EList<Property> properties = preferenceNode.getProperties();
      String[] keys = node.keys();
      Arrays.sort(keys);
      for (String name : keys)
      {
        Property property = PreferencesFactory.eINSTANCE.createProperty();
        property.setName(name);
        property.setValue(node.get(name, null));
        properties.add(property);
      }
    }
    catch (BackingStoreException ex)
    {
      // Ignore
    }
  }

  public static Preferences getPreferences(PreferenceNode preferenceNode, boolean demandCreate)
      throws BackingStoreException
  {
    if (preferenceNode == null)
    {
      return ROOT;
    }

    Preferences parentPreferences = getPreferences(preferenceNode.getParent(), demandCreate);
    if (parentPreferences != null)
    {
      String name = preferenceNode.getName();
      if (demandCreate || parentPreferences.nodeExists(name))
      {
        return parentPreferences.node(name);
      }
    }
    return null;
  }

  public static IPath getLocation(Preferences preferences)
  {
    if (preferences == null)
    {
      return null;
    }

    try
    {
      Method getLocationMethod = preferences.getClass().getDeclaredMethod("getLocation");
      getLocationMethod.setAccessible(true);
      IPath location = (IPath)getLocationMethod.invoke(preferences);
      return location;
    }
    catch (Exception ex)
    {
      // Ignore
    }

    return null;
  }

  private static List<PreferenceNode> getPath(PreferenceNode preferenceNode)
  {
    List<PreferenceNode> path = new ArrayList<PreferenceNode>();
    while (preferenceNode != null)
    {
      path.add(preferenceNode);
      preferenceNode = preferenceNode.getParent();
    }
    Collections.reverse(path);
    return path;
  }

  public static PreferenceNode getAncestor(PreferenceNode preferenceNode)
  {
    List<PreferenceNode> path = getPath(preferenceNode);
    int size = path.size();
    if (size > 1)
    {
      PreferenceNode root = path.get(0);
      if ("".equals(root.getName()))
      {
        PreferenceNode base = path.get(1);
        String name = base.getName();
        int start = 2;
        if ("project".equals(name))
        {
          name = "instance";
          PreferenceNode result = root.getNode(name);
          for (int i = ++start; result != null && i < size; ++i)
          {
            result = result.getNode(path.get(i).getName());
          }
          if (result != null)
          {
            return result;
          }
        }

        if ("instance".equals(name))
        {
          name = "default";
          PreferenceNode result = root.getNode(name);
          for (int i = start; result != null && i < size; ++i)
          {
            result = result.getNode(path.get(i).getName());
          }
          if (result != null)
          {
            return result;
          }
        }

        if ("default".equals(name))
        {
          name = "configuration";
          PreferenceNode result = root.getNode(name);
          for (int i = start; result != null && i < size; ++i)
          {
            result = result.getNode(path.get(i).getName());
          }
          if (result != null)
          {
            return result;
          }
        }

        if ("configuration".equals(name))
        {
          name = "bundle_defaults";
          PreferenceNode result = root.getNode(name);
          for (int i = start; result != null && i < size; ++i)
          {
            result = result.getNode(path.get(i).getName());
          }
          if (result != null)
          {
            return result;
          }
        }
      }
    }
    return null;
  }
}
