package dsw.rudok.repository;

import dsw.rudok.observer.Subscriber;
import dsw.rudok.repository.node.RuNode;
import dsw.rudok.repository.node.RuNodeComposite;

public class Project extends RuNodeComposite {

    public Project(String name, RuNode parent) {
        super(name, parent);
    }

    @Override
    public void addChild(RuNode child) {
        if(child != null && child instanceof Document){
            Document doc = (Document)child;
            if(!this.getChildren().contains(doc)){
                this.getChildren().add(doc);
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
