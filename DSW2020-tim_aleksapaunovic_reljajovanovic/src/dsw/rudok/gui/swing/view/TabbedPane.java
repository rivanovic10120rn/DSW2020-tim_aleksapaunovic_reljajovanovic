package dsw.rudok.gui.swing.view;

import javax.swing.*;
import java.awt.*;
import java.awt.event.KeyEvent;

public class TabbedPane extends JTabbedPane {

    public TabbedPane(){
        ImageIcon icon = new ImageIcon("res/treeIcons/Project.png");

        JComponent panel1 = makeTextPanel("Panel 1");
        this.addTab("test 1", icon, panel1, "TEST");

        JComponent panel2 = makeTextPanel("Panel 2");
        this.addTab("test 2", icon, panel1, "TEST #2");

    }

    private JComponent makeTextPanel(String text){
        JPanel panel = new JPanel(false);
        JLabel filler = new JLabel(text);
        filler.setHorizontalAlignment(JLabel.CENTER);
        panel.setLayout(new GridLayout(1,1));
        panel.add(filler);
        return panel;
    }

}
