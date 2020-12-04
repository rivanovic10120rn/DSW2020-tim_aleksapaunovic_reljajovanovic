package dsw.rudok.gui.swing.controller;

import javax.swing.*;

public abstract class AbstractRudokAction extends AbstractAction {

    public Icon loadIcon(String path){
        Icon icon = new ImageIcon(path);
        return icon;
    }
}
