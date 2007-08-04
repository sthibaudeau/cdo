package org.eclipse.net4j.ui.views;

import org.eclipse.net4j.ITransportContainer;
import org.eclipse.net4j.internal.ui.SharedIcons;
import org.eclipse.net4j.ui.actions.SafeAction;

import org.eclipse.jface.action.Action;
import org.eclipse.jface.action.IMenuListener;
import org.eclipse.jface.action.IMenuManager;
import org.eclipse.jface.action.IToolBarManager;
import org.eclipse.jface.action.MenuManager;
import org.eclipse.jface.action.Separator;
import org.eclipse.jface.dialogs.MessageDialog;
import org.eclipse.jface.resource.ImageDescriptor;
import org.eclipse.jface.viewers.DoubleClickEvent;
import org.eclipse.jface.viewers.IDoubleClickListener;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.viewers.ISelectionChangedListener;
import org.eclipse.jface.viewers.ITreeSelection;
import org.eclipse.jface.viewers.SelectionChangedEvent;
import org.eclipse.jface.viewers.TreeViewer;
import org.eclipse.swt.SWT;
import org.eclipse.swt.graphics.Image;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Menu;
import org.eclipse.ui.IActionBars;
import org.eclipse.ui.IWorkbenchActionConstants;
import org.eclipse.ui.part.ISetSelectionTarget;
import org.eclipse.ui.part.ViewPart;

public abstract class ContainerView extends ViewPart implements ISetSelectionTarget
{
  private ContainerItemProvider itemProvider;

  private TreeViewer viewer;

  private ISelectionChangedListener selectionListener = new ISelectionChangedListener()
  {
    public void selectionChanged(SelectionChangedEvent event)
    {
      ITreeSelection selection = (ITreeSelection)event.getSelection();
      IActionBars bars = getViewSite().getActionBars();
      ContainerView.this.selectionChanged(bars, selection);
    }
  };

  private Action refreshAction = new RefreshAction();

  public ContainerView()
  {
  }

  @Override
  public void setFocus()
  {
    viewer.getControl().setFocus();
  }

  public void selectReveal(ISelection selection)
  {
    viewer.setSelection(selection, true);
  }

  @Override
  public void createPartControl(Composite parent)
  {
    itemProvider = createContainerItemProvider();
    viewer = new TreeViewer(parent, SWT.MULTI | SWT.H_SCROLL | SWT.V_SCROLL);
    viewer.setContentProvider(itemProvider);
    viewer.setLabelProvider(itemProvider);
    viewer.setSorter(new ContainerNameSorter());
    viewer.setInput(getContainer());
    viewer.addSelectionChangedListener(selectionListener);
    getSite().setSelectionProvider(viewer);

    hookContextMenu();
    hookDoubleClick();
    contributeToActionBars();
  }

  protected ContainerItemProvider createContainerItemProvider()
  {
    return new ContainerItemProvider(getRootElementFilter())
    {
      @Override
      public Image getImage(Object obj)
      {
        Image image = getElementImage(obj);
        if (image == null)
        {
          image = super.getImage(obj);
        }

        return image;
      }

      @Override
      public String getText(Object obj)
      {
        String text = getElementText(obj);
        if (text == null)
        {
          text = super.getText(obj);
        }

        return text;
      }
    };
  }

  protected String getElementText(Object element)
  {
    return null;
  }

  protected Image getElementImage(Object element)
  {
    return null;
  }

  protected IElementFilter getRootElementFilter()
  {
    return null;
  }

  protected abstract ITransportContainer getContainer();

  protected void hookDoubleClick()
  {
    viewer.addDoubleClickListener(new IDoubleClickListener()
    {
      public void doubleClick(DoubleClickEvent event)
      {
        ITreeSelection selection = (ITreeSelection)viewer.getSelection();
        Object object = selection.getFirstElement();
        doubleClicked(object);
      }
    });
  }

  protected void hookContextMenu()
  {
    MenuManager menuMgr = new MenuManager("#PopupMenu");
    menuMgr.setRemoveAllWhenShown(true);
    menuMgr.addMenuListener(new IMenuListener()
    {
      public void menuAboutToShow(IMenuManager manager)
      {
        ITreeSelection selection = (ITreeSelection)viewer.getSelection();
        fillContextMenu(manager, selection);
      }
    });

    Menu menu = menuMgr.createContextMenu(viewer.getControl());
    viewer.getControl().setMenu(menu);
    getSite().registerContextMenu(menuMgr, viewer);
  }

  protected void contributeToActionBars()
  {
    IActionBars bars = getViewSite().getActionBars();
    fillLocalPullDown(bars.getMenuManager());
    fillLocalToolBar(bars.getToolBarManager());
  }

  protected void fillLocalPullDown(IMenuManager manager)
  {
    manager.add(new Separator(IWorkbenchActionConstants.MB_ADDITIONS));
    manager.add(refreshAction);
  }

  protected void fillLocalToolBar(IToolBarManager manager)
  {
    manager.add(new Separator(IWorkbenchActionConstants.MB_ADDITIONS));
  }

  protected void fillContextMenu(IMenuManager manager, ITreeSelection selection)
  {
    itemProvider.fillContextMenu(manager, selection);
    manager.add(new Separator(IWorkbenchActionConstants.MB_ADDITIONS));
  }

  protected void selectionChanged(IActionBars bars, ITreeSelection selection)
  {
  }

  protected void doubleClicked(Object object)
  {
    if (object != null && viewer.isExpandable(object))
    {
      if (viewer.getExpandedState(object))
      {
        viewer.collapseToLevel(object, TreeViewer.ALL_LEVELS);
      }
      else
      {
        viewer.expandToLevel(object, 1);
      }
    }
  }

  protected void showMessage(String message)
  {
    showMessage(MessageType.INFORMATION, message);
  }

  protected boolean showMessage(MessageType type, String message)
  {
    switch (type)
    {
    case INFORMATION:
      MessageDialog.openInformation(viewer.getControl().getShell(), getTitle(), message);
      return true;

    case ERROR:
      MessageDialog.openError(viewer.getControl().getShell(), getTitle(), message);
      return true;

    case WARNING:
      MessageDialog.openWarning(viewer.getControl().getShell(), getTitle(), message);
      return true;

    case CONFIRM:
      return MessageDialog.openConfirm(viewer.getControl().getShell(), getTitle(), message);

    case QUESTION:
      return MessageDialog.openQuestion(viewer.getControl().getShell(), getTitle(), message);

    default:
      return true;
    }
  }

  public static ImageDescriptor getAddImageDescriptor()
  {
    return SharedIcons.getDescriptor(SharedIcons.ETOOL_ADD);
  }

  public static ImageDescriptor getDeleteImageDescriptor()
  {
    return SharedIcons.getDescriptor(SharedIcons.ETOOL_DELETE);
  }

  public static ImageDescriptor getRefreshImageDescriptor()
  {
    return SharedIcons.getDescriptor(SharedIcons.ETOOL_REFRESH);
  }

  protected static enum MessageType
  {
    INFORMATION, ERROR, WARNING, CONFIRM, QUESTION
  }

  /**
   * @author Eike Stepper
   */
  private final class RefreshAction extends SafeAction
  {
    private RefreshAction()
    {
      super("Refresh", "Refresh view", getRefreshImageDescriptor());
    }

    @Override
    protected void doRun() throws Exception
    {
      viewer.refresh(false);
    }
  }
}