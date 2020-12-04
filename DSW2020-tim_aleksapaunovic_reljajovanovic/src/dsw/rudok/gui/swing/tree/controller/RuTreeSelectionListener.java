package dsw.rudok.gui.swing.tree.controller;

import dsw.rudok.gui.swing.tree.model.RuTreeItem;
import dsw.rudok.repository.node.RuNode;

import javax.swing.event.TreeSelectionEvent;
import javax.swing.event.TreeSelectionListener;
import javax.swing.tree.TreePath;

public class RuTreeSelectionListener implements TreeSelectionListener {


    @Override
    public void valueChanged(TreeSelectionEvent e){
        TreePath path  = e.getPath();
        RuTreeItem treeItemSelected = (RuTreeItem) path.getLastPathComponent();
        System.out.println("Slelected node: " +treeItemSelected.getName());
        System.out.println("getPath: " +e.getPath());
    }


}
