package dsw.rudok.gui.swing.tree.view;

import dsw.rudok.gui.swing.tree.model.RuTreeItem;
import dsw.rudok.repository.*;

import javax.swing.*;
import javax.swing.tree.DefaultTreeCellRenderer;
import java.awt.*;

public class RuTreeCellRenderer extends DefaultTreeCellRenderer {

    public RuTreeCellRenderer(){

    }

    public Component getTreeCellRendererComponent(JTree tree, Object value, boolean sel, boolean expanded, boolean leaf, int row, boolean hasFocus){
        super.getTreeCellRendererComponent(tree, value, sel, expanded, leaf, row, hasFocus);

        if(((RuTreeItem)value).getNodeModel() instanceof Workspace){
            Icon icon = new ImageIcon("DSW2020-tim_aleksapaunovic_reljajovanovic/res/treeIcons/Workspace.png");
            setIcon(icon);

        }else if(((RuTreeItem)value).getNodeModel() instanceof Project){
            Icon icon = new ImageIcon("DSW2020-tim_aleksapaunovic_reljajovanovic/res/treeIcons/Project.png");
            setIcon(icon);
        }else if(((RuTreeItem)value).getNodeModel() instanceof Document){
            Icon icon = new ImageIcon("DSW2020-tim_aleksapaunovic_reljajovanovic/res/treeIcons/Document.png");
            setIcon(icon);
        }else if(((RuTreeItem)value).getNodeModel() instanceof Page){
            Icon icon = new ImageIcon("DSW2020-tim_aleksapaunovic_reljajovanovic/res/treeIcons/Page.png");
            setIcon(icon);
        }else if(((RuTreeItem)value).getNodeModel() instanceof Slot){
            Icon icon = new ImageIcon("DSW2020-tim_aleksapaunovic_reljajovanovic/res/treeIcons/Slot.png");
            setIcon(icon);
        }

        return this;
    }
}
