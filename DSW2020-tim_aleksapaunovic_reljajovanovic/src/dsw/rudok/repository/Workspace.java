package dsw.rudok.repository;

import dsw.rudok.observer.Subscriber;
import dsw.rudok.repository.node.RuNode;
import dsw.rudok.repository.node.RuNodeComposite;

public class Workspace extends RuNodeComposite {

    public Workspace(String name){
        super(name, null);
    }

    @Override
    public void addChild(RuNode child) {
        if(child != null && child instanceof Project){
            Project project = (Project)child;
            if(!this.getChildren().contains(project)){
                this.getChildren().add(project);
                notifySubscriber(project);
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
