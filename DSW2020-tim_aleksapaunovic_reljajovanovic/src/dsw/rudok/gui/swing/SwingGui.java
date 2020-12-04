package dsw.rudok.gui.swing;

import dsw.rudok.app.Gui;
import dsw.rudok.app.Repository;
import dsw.rudok.errorHandler.MyError;
import dsw.rudok.gui.swing.view.MainFrame;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class SwingGui implements Gui {

    private MainFrame instance;
    private Repository documentRepository;

    public SwingGui(Repository documentRepository){
        this.documentRepository = documentRepository;
    }

    @Override
    public void start() {
        instance = MainFrame.getInstance();
        instance.setDocumentRepository(documentRepository);
        instance.initialiseWorkspaceTree();
        instance.initialiseGui();
        instance.setVisible(true);

    }

    public void update(Object notification){
        if(notification instanceof MyError)
            MainFrame.getInstance().showError((MyError) notification);
    }
}
