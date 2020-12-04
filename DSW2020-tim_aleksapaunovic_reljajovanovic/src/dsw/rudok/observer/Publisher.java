package dsw.rudok.observer;

public interface Publisher {
    void addSubscriber(Subscriber sub);
    void removeSubscriber(Subscriber sub);
    void notifySubscriber(Object notification);
}
