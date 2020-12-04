package dsw.rudok.gui.swing.controller;

import dsw.rudok.gui.swing.view.MainFrame;
import dsw.rudok.repository.Slot;
import dsw.rudok.repository.node.RuNode;

import javax.swing.*;
import javax.swing.tree.DefaultMutableTreeNode;
import javax.swing.tree.DefaultTreeModel;
import javax.swing.tree.MutableTreeNode;
import javax.swing.tree.TreePath;
import java.awt.event.ActionEvent;
import java.awt.event.KeyEvent;

public class DeleteAction extends AbstractRudokAction{

    public DeleteAction(){
        putValue(ACCELERATOR_KEY, KeyStroke.getKeyStroke(KeyEvent.VK_F3, ActionEvent.ALT_MASK));
        putValue(SMALL_ICON, loadIcon("DSW2020-tim_aleksapaunovic_reljajovanovic/res/icons/16x16/Delete.png"));
        putValue(NAME, "Delete");
        putValue(SHORT_DESCRIPTION, "Delete");
    }

    @Override
    public void actionPerformed(ActionEvent e) {

        DefaultTreeModel model = (DefaultTreeModel) MainFrame.getInstance().getWorkspaceTree().getModel();
        TreePath[] paths = MainFrame.getInstance().getWorkspaceTree().getSelectionPaths();
        if (paths != null){
            for(TreePath path : paths){
                DefaultMutableTreeNode node = (DefaultMutableTreeNode) path.getLastPathComponent();
                if(node.getParent() != null){
                    model.removeNodeFromParent(node);
                }
            }
        }

    }
}
