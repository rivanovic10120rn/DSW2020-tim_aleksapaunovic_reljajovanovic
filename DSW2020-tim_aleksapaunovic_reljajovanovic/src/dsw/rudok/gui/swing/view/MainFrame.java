package dsw.rudok.gui.swing.view;

import dsw.rudok.app.Repository;
import dsw.rudok.errorHandler.MyError;
import dsw.rudok.gui.swing.controller.ActionManager;
import dsw.rudok.gui.swing.tree.RuTree;
import dsw.rudok.gui.swing.tree.view.RuTreeImplementation;

import javax.swing.*;
import java.awt.*;


public class MainFrame extends JFrame {

    private static MainFrame instance;
    private ActionManager actionManager;
    private Repository documentRepository;
    private RuTree tree;
    private MenuBar menuBar;
    private Toolbar toolbar;
    private TabbedPane tabbedPane;
    private JTree workspaceTree;


    public MainFrame() {
    }

    public void initialise(){
        actionManager = new ActionManager();
    }

    public ActionManager getActionManager(){
        return actionManager;
    }

    public void initialiseWorkspaceTree(){

        tree = new RuTreeImplementation();
        workspaceTree = tree.generateTree(documentRepository.getWorkspace());
    }

    public void initialiseGui(){

        try {
            UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
        } catch (Exception e) {
            e.printStackTrace();
        }

        Toolkit kit = Toolkit.getDefaultToolkit();
        Dimension screenSize = kit.getScreenSize();

        int screenHeight = screenSize.height;
        int screenWidth = screenSize.width;

        setSize(screenWidth/2, screenHeight/2);
        setTitle("RuDok");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);

        menuBar = new MenuBar();
        this.setJMenuBar(menuBar);

        toolbar = new Toolbar();
        add(toolbar, BorderLayout.NORTH);

        JPanel desktop = new JPanel();
        tabbedPane = new TabbedPane();

        JScrollPane scroll=new JScrollPane(workspaceTree);
        scroll.setMinimumSize(new Dimension(200,150));

        JSplitPane split = new JSplitPane(JSplitPane.HORIZONTAL_SPLIT, scroll, tabbedPane);
        split.setDividerLocation(250);
        split.setOneTouchExpandable(true);
        getContentPane().add(split, BorderLayout.CENTER);

    }

    public static MainFrame getInstance(){
        if(instance == null){
            instance = new MainFrame();
            instance.initialise();
        }
        return instance;
    }

    public void setDocumentRepository(Repository documentRepository){
        this.documentRepository = documentRepository;
    }
    public JTree getWorkspaceTree() {
        return workspaceTree;
    }
    public void setWorkspaceTree(JTree workspaceTree) {
        this.workspaceTree = workspaceTree;
    }
    public RuTree getTree() {
        return tree;
    }

    public void showError(MyError e){
        JOptionPane.showMessageDialog(null, e.getMessage(), e.getTitle(), JOptionPane.INFORMATION_MESSAGE);
    }
}
