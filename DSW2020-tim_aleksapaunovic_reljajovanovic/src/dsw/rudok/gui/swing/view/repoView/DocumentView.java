package dsw.rudok.gui.swing.view.repoView;

import dsw.rudok.observer.Subscriber;
import dsw.rudok.repository.Document;

import javax.swing.*;
import java.util.List;

public class DocumentView extends JPanel implements Subscriber {

    private Document document;
    private JTabbedPane tabbedPane;
    private JLabel title;
    private List<DocumentView> documentViewList;

    public DocumentView(Document document){
        this.document = document;
        this.document.notifySubscriber(this);
    }


    @Override
    public void update(Object notification) {

    }
}
