package dsw.rudok.gui.swing.tree;

import dsw.rudok.repository.*;
import dsw.rudok.repository.node.RuNode;

import javax.swing.*;
import javax.swing.tree.DefaultMutableTreeNode;

public interface RuTree {
    JTree generateTree(Workspace workspace);
    void addProject(Project project);
    void addDocument(Document document);
    void addPage(Page page);
    void addSlot(Slot slot);
    void removeNode(RuNode node);

    RuNode getSelectedNode();
}
