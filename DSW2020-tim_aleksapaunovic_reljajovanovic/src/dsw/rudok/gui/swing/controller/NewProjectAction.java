package dsw.rudok.gui.swing.controller;

import dsw.rudok.app.AppCore;
import dsw.rudok.errorHandler.ErrorType;
import dsw.rudok.gui.swing.tree.model.RuTreeItem;
import dsw.rudok.gui.swing.view.MainFrame;
import dsw.rudok.gui.swing.view.repoView.ProjectView;
import dsw.rudok.repository.Project;
import dsw.rudok.repository.node.RuNode;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.KeyEvent;
import java.util.Random;

public class NewProjectAction extends AbstractRudokAction{

    public NewProjectAction(){
        putValue(ACCELERATOR_KEY, KeyStroke.getKeyStroke(KeyEvent.VK_R, ActionEvent.CTRL_MASK));
        putValue(SMALL_ICON, loadIcon("DSW2020-tim_aleksapaunovic_reljajovanovic/res/icons/24x24/AddNewProject.png"));
        putValue(NAME, "New Project");
        putValue(SHORT_DESCRIPTION, "New Project");
    }

    @Override
    public void actionPerformed(ActionEvent e) {

        RuNode ws = MainFrame.getInstance().getTree().getSelectedNode();
        if(ws == null){
            AppCore.getInstance().getErrorHandler().generateError(ErrorType.NOTHING_SELECTED);
            return;
        }

        int label = new Random().nextInt(100);
        Project p = new Project("Project " + label, (RuNode) ((RuTreeItem) MainFrame.getInstance().getWorkspaceTree().getModel().getRoot()).getNodeModel());
        MainFrame.getInstance().getTree().addProject(p);

        ProjectView  projectView = new ProjectView(p);
        // to do dodati u mainframe

    }
}
