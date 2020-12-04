package dsw.rudok.app;


import dsw.rudok.errorHandler.ErrorHandlerImpl;
import dsw.rudok.errorHandler.ErrorType;
import dsw.rudok.gui.swing.SwingGui;
import dsw.rudok.gui.swing.controller.ActionManager;
import dsw.rudok.gui.swing.view.MainFrame;
import dsw.rudok.observer.Subscriber;
import dsw.rudok.repository.RepositoryImpl;

public class AppCore extends ApplicationFramework{

    private static AppCore instance;
    private static ErrorHandlerImpl error;


    private AppCore(){

    }

    public static AppCore getInstance(){
        if(instance == null){
            instance = new AppCore();
        }
        return instance;
    }

    public static void initErrorHandler(){
        error = new ErrorHandlerImpl();
    }

    @Override
    public void run() {
        this.gui.start();
    }

    public static void main(String[] args){
        Repository repository = new RepositoryImpl();
        Gui gui = new SwingGui(repository);
        initErrorHandler();
        ApplicationFramework appCore = getInstance();
        appCore.initialise(gui, repository,error);
        appCore.run();
    }


    @Override
    public void generateError(ErrorType errorType) {

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

    public  ErrorHandlerImpl getErrorHandler() {
        return error;
    }
}
