package dsw.rudok.gui.swing.controller;

import java.awt.event.ActionEvent;

public class RedoAction extends AbstractRudokAction{

    public RedoAction(){
        //putValue(ACCELERATOR_KEY, KeyStroke.getKeyStroke(KeyEvent.VK_F3, ActionEvent.ALT_MASK));
        putValue(SMALL_ICON, loadIcon("DSW2020-tim_aleksapaunovic_reljajovanovic/res/icons/16x16/Redo.png"));
        putValue(NAME, "Redo");
        putValue(SHORT_DESCRIPTION, "Redo");
    }

    @Override
    public void actionPerformed(ActionEvent e) {

    }
}
