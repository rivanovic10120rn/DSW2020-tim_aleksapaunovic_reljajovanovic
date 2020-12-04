package dsw.rudok.gui.swing.tree.view;

import dsw.rudok.app.AppCore;
import dsw.rudok.errorHandler.ErrorType;
import dsw.rudok.gui.swing.tree.RuTree;
import dsw.rudok.gui.swing.tree.model.RuTreeItem;
import dsw.rudok.repository.*;
import dsw.rudok.repository.node.RuNode;

import javax.swing.*;
import javax.swing.tree.DefaultTreeModel;

public class RuTreeImplementation implements RuTree {

    private RuTreeView treeView;
    private DefaultTreeModel treeModel;

    public RuTreeImplementation() {
    }

    @Override
    public JTree generateTree(Workspace workspace) {
        RuTreeItem root = new RuTreeItem(workspace);
        treeModel = new DefaultTreeModel(root);
        treeView = new RuTreeView(treeModel);
        return treeView;
    }

    @Override
    public void addProject(Project project) {
        RuNode nodeModel = ((RuTreeItem)treeModel.getRoot()).getNodeModel();
        ((RuTreeItem)treeModel.getRoot()).add(new RuTreeItem(project));
        ((Workspace)nodeModel).addChild(project);
        SwingUtilities.updateComponentTreeUI(treeView);
    }

    @Override
    public void addDocument(Document document) {
        RuNode nodeModel = getSelectedNode();
        ((RuTreeItem)treeView.getLastSelectedPathComponent()).add(new RuTreeItem(document));
        ((Project)nodeModel).addChild(document);
        treeView.expandPath(treeView.getSelectionPath());
        SwingUtilities.updateComponentTreeUI(treeView);
    }

    @Override
    public void addPage(Page page) {
        RuNode nodeModel = getSelectedNode();
        ((RuTreeItem)treeView.getLastSelectedPathComponent()).add(new RuTreeItem(page));
        ((Document)nodeModel).addChild(page);
        treeView.expandPath(treeView.getSelectionPath());
        SwingUtilities.updateComponentTreeUI(treeView);
    }

    @Override
    public void addSlot(Slot slot) {
        RuNode nodeModel = getSelectedNode();
        ((RuTreeItem)treeView.getLastSelectedPathComponent()).add(new RuTreeItem(slot));
        ((Page)nodeModel).addChild(slot);
        treeView.expandPath(treeView.getSelectionPath());
        SwingUtilities.updateComponentTreeUI(treeView);
    }

    @Override
    public void removeNode(RuNode node) {
        RuNode selected = getSelectedNode();
        RuNode parent = selected.getParent();

    }

    @Override
    public RuNode getSelectedNode() {

        RuNode node = ((RuTreeItem) treeView.getLastSelectedPathComponent()).getNodeModel();
        if (node == null) {
            AppCore.getInstance().getErrorHandler().generateError(ErrorType.NOTHING_SELECTED);
            return null;
        }

        return ((RuTreeItem)treeView.getLastSelectedPathComponent()).getNodeModel();
    }


}
