package dsw.rudok.gui.swing.tree.view;

import dsw.rudok.gui.swing.tree.controller.RuTreeCellEditor;
import dsw.rudok.gui.swing.tree.controller.RuTreeSelectionListener;
import javax.swing.*;
import javax.swing.tree.DefaultTreeModel;

public class RuTreeView extends JTree {

    RuTreeSelectionListener listener;

    public RuTreeView(DefaultTreeModel defaultTreeModel){
        setModel(defaultTreeModel);
        RuTreeCellRenderer ruTreeCellRenderer = new RuTreeCellRenderer();
        listener = new RuTreeSelectionListener();
        addTreeSelectionListener(listener);
        setCellEditor(new RuTreeCellEditor(this,ruTreeCellRenderer));
        setCellRenderer(ruTreeCellRenderer);
        setEditable(true);
    }
}
