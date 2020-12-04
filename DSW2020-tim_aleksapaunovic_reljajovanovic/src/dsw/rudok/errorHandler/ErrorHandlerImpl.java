package dsw.rudok.errorHandler;

import dsw.rudok.app.ErrorHandler;
import dsw.rudok.observer.Subscriber;

public class ErrorHandlerImpl implements ErrorHandler {

    @Override
    public void generateError(ErrorType errorType) {
        if(errorType == ErrorType.WS_CANNOT_BE_DELETED)
            notifySubscriber(new MyError(1, "Error with deleting", "Cannot delete Workspace"));
        else if(errorType == ErrorType.NOTHING_SELECTED)
            notifySubscriber(new MyError(1, "Error with deleting", "Nothing selected"));
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