package dsw.rudok.gui.swing.controller;

import dsw.rudok.gui.swing.tree.model.RuTreeItem;
import dsw.rudok.gui.swing.view.MainFrame;
import dsw.rudok.repository.Document;
import dsw.rudok.repository.Project;
import dsw.rudok.repository.node.RuNode;

import javax.swing.*;
import javax.swing.tree.DefaultMutableTreeNode;
import javax.swing.tree.TreePath;
import java.awt.event.ActionEvent;
import java.awt.event.KeyEvent;
import java.util.Random;

public class NewDocumentAction extends AbstractRudokAction{
    public NewDocumentAction(){
        putValue(ACCELERATOR_KEY, KeyStroke.getKeyStroke(KeyEvent.VK_N, ActionEvent.CTRL_MASK));
        putValue(SMALL_ICON, loadIcon("DSW2020-tim_aleksapaunovic_reljajovanovic/res/icons/24x24/AddNewDocument.png"));
        putValue(NAME, "New Document");
        putValue(SHORT_DESCRIPTION, "New Document");
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        int label = new Random().nextInt(100);
        RuNode selectedNode = MainFrame.getInstance().getTree().getSelectedNode();
        Document doc = new Document("Document " + label, selectedNode);
        MainFrame.getInstance().getTree().addDocument(doc);

    }
}
