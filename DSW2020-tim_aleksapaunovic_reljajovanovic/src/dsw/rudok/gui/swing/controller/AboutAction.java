package dsw.rudok.gui.swing.controller;

import dsw.rudok.gui.swing.view.AboutDialog;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.KeyEvent;
import java.io.IOException;

public class AboutAction extends AbstractRudokAction {

    public AboutAction(){
        //putValue(ACCELERATOR_KEY, KeyStroke.getKeyStroke(KeyEvent.VK_F3, ActionEvent.ALT_MASK));
        putValue(SMALL_ICON, loadIcon("DSW2020-tim_aleksapaunovic_reljajovanovic/res/icons/16x16/About.png"));
        putValue(NAME, "About");
        putValue(SHORT_DESCRIPTION, "About");
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        AboutDialog aboutFrame = null;
        try {
            aboutFrame = new AboutDialog();
        } catch (IOException ioException) {
            ioException.printStackTrace();
        }
        aboutFrame.setVisible(true);
    }
}
