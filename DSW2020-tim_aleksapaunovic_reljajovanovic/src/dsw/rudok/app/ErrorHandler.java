package dsw.rudok.app;

import dsw.rudok.errorHandler.ErrorType;
import dsw.rudok.observer.Publisher;

public interface ErrorHandler extends Publisher {
    public void generateError(ErrorType errorType);

}
