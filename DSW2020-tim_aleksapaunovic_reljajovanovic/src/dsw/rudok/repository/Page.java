package dsw.rudok.repository;

import dsw.rudok.observer.Subscriber;
import dsw.rudok.repository.node.RuNode;
import dsw.rudok.repository.node.RuNodeComposite;

public class Page extends RuNodeComposite {

    public Page(String name, RuNode parent) {
        super(name, parent);
    }

    @Override
    public void addChild(RuNode child) {
        if(child != null && child instanceof Slot){
            Slot s = (Slot)child;
            if(!this.getChildren().contains(s)){
                this.getChildren().add(s);
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
