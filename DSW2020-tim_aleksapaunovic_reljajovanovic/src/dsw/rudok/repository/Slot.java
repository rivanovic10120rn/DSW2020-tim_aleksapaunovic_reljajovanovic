package dsw.rudok.repository;

import dsw.rudok.observer.Subscriber;
import dsw.rudok.repository.node.RuNode;

public class Slot extends RuNode {
    public Slot(String name, RuNode parent) {
        super(name, parent);
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
