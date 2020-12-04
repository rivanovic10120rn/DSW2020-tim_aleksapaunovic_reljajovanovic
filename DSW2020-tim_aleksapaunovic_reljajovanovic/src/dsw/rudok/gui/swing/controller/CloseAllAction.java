package dsw.rudok.gui.swing.controller;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.KeyEvent;

public class CloseAllAction extends AbstractRudokAction{

    public CloseAllAction(){
        putValue(ACCELERATOR_KEY, KeyStroke.getKeyStroke(KeyEvent.VK_F4, ActionEvent.ALT_MASK));

        putValue(NAME, "Close All");
        putValue(SHORT_DESCRIPTION, "Close All");

    }

    @Override
    public void actionPerformed(ActionEvent e) {

    }
}
