package dsw.rudok.gui.swing.controller;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.KeyEvent;

public class CloseAction extends AbstractRudokAction{

    public CloseAction(){
        //putValue(ACCELERATOR_KEY, KeyStroke.getKeyStroke(KeyEvent.VK_F4, ActionEvent.ALT_MASK));
        putValue(NAME, "Close");
        putValue(SHORT_DESCRIPTION, "Close");

    }

    @Override
    public void actionPerformed(ActionEvent e) {

    }
}
