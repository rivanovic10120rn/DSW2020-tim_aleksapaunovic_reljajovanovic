package dsw.rudok.gui.swing.controller;

import dsw.rudok.gui.swing.tree.model.RuTreeItem;
import dsw.rudok.gui.swing.view.MainFrame;
import dsw.rudok.repository.Project;
import dsw.rudok.repository.Slot;
import dsw.rudok.repository.node.RuNode;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.KeyEvent;
import java.util.Random;

public class NewSlotAction extends AbstractRudokAction{

    public NewSlotAction(){
        putValue(ACCELERATOR_KEY, KeyStroke.getKeyStroke(KeyEvent.VK_S, ActionEvent.CTRL_MASK));
        putValue(SMALL_ICON, loadIcon("DSW2020-tim_aleksapaunovic_reljajovanovic/res/icons/24x24/AddNewSlot.png"));
        putValue(NAME, "New Slot");
        putValue(SHORT_DESCRIPTION, "New Slot");
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        int label = new Random().nextInt(100);
        Slot s = new Slot("Slot " + label, (RuNode) ((RuTreeItem) MainFrame.getInstance().getWorkspaceTree().getModel().getRoot()).getNodeModel());
        MainFrame.getInstance().getTree().addSlot(s);
    }
}
