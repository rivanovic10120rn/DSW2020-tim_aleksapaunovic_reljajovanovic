package dsw.rudok.gui.swing.controller;

import java.awt.event.ActionEvent;

public class SaveAction extends AbstractRudokAction{

    public SaveAction(){
        //putValue(ACCELERATOR_KEY, KeyStroke.getKeyStroke(KeyEvent.VK_F4, ActionEvent.ALT_MASK));
        putValue(SMALL_ICON, loadIcon("DSW2020-tim_aleksapaunovic_reljajovanovic/res/icons/16x16/Save.png"));
        putValue(NAME, "Open");
        putValue(SHORT_DESCRIPTION, "Save");

    }

    @Override
    public void actionPerformed(ActionEvent e) {

    }
}
