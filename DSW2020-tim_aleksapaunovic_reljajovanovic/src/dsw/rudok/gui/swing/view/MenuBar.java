package dsw.rudok.gui.swing.view;

import dsw.rudok.app.AppCore;
import dsw.rudok.gui.swing.controller.AboutAction;
import dsw.rudok.gui.swing.controller.ActionManager;

import javax.swing.*;

public class MenuBar extends JMenuBar {

    public MenuBar(){
        ActionManager actionManager = MainFrame.getInstance().getActionManager();

        JMenu file = new JMenu("File");
        JMenu _new = new JMenu("New");
        _new.setIcon(new ImageIcon("icons/16x16/New.png"));
        _new.add(actionManager.getNewProjectAction());
        _new.add(actionManager.getNewDocumentAction());
        _new.add(actionManager.getNewPageAction());
        _new.add(actionManager.getNewSlotAction());
        file.add(_new);

        file.add(actionManager.getOpenAction());

        JMenu openRecent = new JMenu("Open Recent");
        file.add(openRecent);
        file.addSeparator();

        file.add(actionManager.getSaveAction());
        file.addSeparator();

        file.add(actionManager.getSettingsAction());
        file.add(actionManager.getCloseAction());
        file.add(actionManager.getCloseAllAction());
        file.addSeparator();

        file.add(actionManager.getExitAction());

        JMenu edit = new JMenu("Edit");

        edit.add(actionManager.getUndoAction());
        edit.add(actionManager.getRedoAction());
        edit.addSeparator();

        edit.add(actionManager.getCutAction());
        edit.add(actionManager.getCopyAction());
        edit.add(actionManager.getPasteAction());
        edit.add(actionManager.getDeleteAction());

        JMenu help = new JMenu("Help");
        help.add(actionManager.getAboutAction());

        add(file);
        add(edit);
        add(help);
    }
}
