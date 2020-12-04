package dsw.rudok.gui.swing.controller;

import lombok.Getter;

@Getter
public class ActionManager{

    private ExitAction exitAction;
    private AboutAction aboutAction;
    private CloseAction closeAction;
    private CloseAllAction closeAllAction;
    private OpenAction openAction;
    private SaveAction saveAction;
    private SettingsAction settingsAction;
    private UndoAction undoAction;
    private RedoAction redoAction;
    private CutAction cutAction;
    private CopyAction copyAction;
    private PasteAction pasteAction;
    private DeleteAction deleteAction;
    private NewProjectAction newProjectAction;
    private NewDocumentAction newDocumentAction;
    private NewPageAction newPageAction;
    private NewSlotAction newSlotAction;

    public ActionManager(){
        initialiseActions();
    }

    private void initialiseActions(){
        exitAction = new ExitAction();
        aboutAction = new AboutAction();
        closeAction = new CloseAction();
        closeAllAction = new CloseAllAction();
        openAction = new OpenAction();
        saveAction = new SaveAction();
        settingsAction = new SettingsAction();
        undoAction = new UndoAction();
        redoAction = new RedoAction();
        cutAction = new CutAction();
        copyAction = new CopyAction();
        pasteAction = new PasteAction();
        deleteAction = new DeleteAction();
        newProjectAction = new NewProjectAction();
        newDocumentAction = new NewDocumentAction();
        newPageAction = new NewPageAction();
        newSlotAction = new NewSlotAction();
    }


}
