package com.eco.bio7.rbridge.debug;

import org.eclipse.jface.action.IMenuManager;
import org.eclipse.jface.action.IToolBarManager;
import org.eclipse.swt.SWT;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.ui.part.ViewPart;
import org.eclipse.swt.custom.StyledText;
import org.eclipse.swt.layout.FillLayout;

public class DebugTextView extends ViewPart {

	public static final String ID = "com.eco.bio7.rbridge.debug.DebugTextView"; //$NON-NLS-1$
	private  static StyledText styledText;
	private Composite container;

	

	public DebugTextView() {
	}

	/**
	 * Create contents of the view part.
	 * @param parent
	 */
	@Override
	public void createPartControl(Composite parent) {
		container = new Composite(parent, SWT.BORDER);
		container.setLayout(new FillLayout(SWT.HORIZONTAL));
		
		styledText = new StyledText(container, SWT.BORDER | SWT.V_SCROLL|SWT.H_SCROLL);
		styledText.setEditable(false);

		createActions();
		initializeToolBar();
		initializeMenu();
	}

	/**
	 * Create the actions.
	 */
	private void createActions() {
		// Create the actions
	}

	/**
	 * Initialize the toolbar.
	 */
	private void initializeToolBar() {
		IToolBarManager toolbarManager = getViewSite().getActionBars().getToolBarManager();
	}

	/**
	 * Initialize the menu.
	 */
	private void initializeMenu() {
		IMenuManager menuManager = getViewSite().getActionBars().getMenuManager();
	}

	@Override
	public void setFocus() {
		// Set the focus
	}
	public  static StyledText getStyledText() {
		return styledText;
	}
}