package dsw.rudok.repository;

import dsw.rudok.observer.Subscriber;
import dsw.rudok.repository.node.RuNode;
import dsw.rudok.repository.node.RuNodeComposite;

public class Document extends RuNodeComposite {
    public Document(String name, RuNode parent) {
        super(name, parent);
    }

    @Override
    public void addChild(RuNode child) {
        if(child != null && child instanceof Page){
            Page page = (Page)child;
            if(!this.getChildren().contains(page)){
                this.getChildren().add(page);
            }
        }
    }

    @Override
    public void addSubscriber(Subscriber sub) {

    }

    @Override
    public void removeSubscriber(Subscriber sub) {

    }

    @Override
    public void notifySubscriber(Object notification) {

    }
}
