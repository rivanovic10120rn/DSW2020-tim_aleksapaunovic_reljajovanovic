package dsw.rudok.gui.swing.controller;

import java.awt.event.ActionEvent;

public class SettingsAction extends AbstractRudokAction{

    public SettingsAction(){
        //putValue(ACCELERATOR_KEY, KeyStroke.getKeyStroke(KeyEvent.VK_F4, ActionEvent.ALT_MASK));
        putValue(SMALL_ICON, loadIcon("DSW2020-tim_aleksapaunovic_reljajovanovic/res/icons/16x16/Settings.png"));
        putValue(NAME, "Settings");
        putValue(SHORT_DESCRIPTION, "Settings");

    }

    @Override
    public void actionPerformed(ActionEvent e) {

    }
}
