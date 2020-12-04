package dsw.rudok.app;

import lombok.NoArgsConstructor;
import lombok.Setter;

@Setter
@NoArgsConstructor
public abstract class ApplicationFramework implements ErrorHandler {
    protected  Gui gui;
    protected Repository repository;
    protected ErrorHandler errorHandler;

    public abstract void run();
    public void initialise(Gui gui, Repository repository, ErrorHandler errorHandler){
        this.gui = gui;
        this.repository = repository;
        this.errorHandler = errorHandler;
    }
}
