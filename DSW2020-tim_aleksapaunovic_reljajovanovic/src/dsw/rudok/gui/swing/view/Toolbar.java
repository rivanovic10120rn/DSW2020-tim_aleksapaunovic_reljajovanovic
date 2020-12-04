package dsw.rudok.gui.swing.view;

import dsw.rudok.app.AppCore;
import dsw.rudok.gui.swing.controller.ActionManager;

import javax.swing.*;

public class Toolbar extends JToolBar {

    public Toolbar(){
        super(SwingConstants.HORIZONTAL);
        ActionManager actionManager = MainFrame.getInstance().getActionManager();

        add(actionManager.getNewProjectAction());
        add(actionManager.getNewDocumentAction());
        add(actionManager.getNewPageAction());
        add(actionManager.getNewSlotAction());
        addSeparator();
        add(actionManager.getDeleteAction());

        JButton newBtn = new JButton();
        newBtn.setToolTipText("New");
        newBtn.setIcon(new ImageIcon("res/icons/24x24/New.png"));
        add(newBtn);
        addSeparator();

        add(actionManager.getOpenAction());
        addSeparator();

        add(actionManager.getSaveAction());
        addSeparator();

        setFloatable(true);
    }
}
