package dsw.rudok.gui.swing.view.repoView;

import dsw.rudok.observer.Subscriber;
import dsw.rudok.repository.Project;

import javax.swing.*;
import java.util.List;

public class ProjectView extends JPanel implements Subscriber {

    private Project project;
    private JTabbedPane tabbedPane;
    private JLabel title;
    private List<DocumentView> documentViewList;

    public ProjectView(Project project){
        this.project = project;
        this.project.addSubscriber(this);
    }

    @Override
    public void update(Object notification) {
        //  if(notification == )
        // this.tabbedPane.addTab();

    }
}
