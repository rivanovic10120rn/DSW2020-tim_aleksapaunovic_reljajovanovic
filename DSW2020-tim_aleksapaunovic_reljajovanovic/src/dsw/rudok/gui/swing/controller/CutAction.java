package dsw.rudok.gui.swing.controller;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.KeyEvent;

public class CutAction extends AbstractRudokAction{

    public CutAction(){
        //putValue(ACCELERATOR_KEY, KeyStroke.getKeyStroke(KeyEvent.VK_F3, ActionEvent.ALT_MASK));
        putValue(SMALL_ICON, loadIcon("DSW2020-tim_aleksapaunovic_reljajovanovic/res/icons/16x16/Cut.png"));
        putValue(NAME, "Cut");
        putValue(SHORT_DESCRIPTION, "Cut");
    }

    @Override
    public void actionPerformed(ActionEvent e) {

    }
}
