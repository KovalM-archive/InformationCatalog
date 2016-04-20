package kmv.view;

import kmv.controler.ServerController;
import kmv.menu.edit.AdditionListener;
import kmv.menu.edit.SearchDeleteListener;
import kmv.menu.file.ExitMenuListener;
import kmv.menu.file.NewTableListener;
import kmv.menu.file.SaveMenuListener;
import kmv.server.RPCManager;
import kmv.server.SOAPManager;
import kmv.server.ServerConstants;

import javax.swing.*;
import javax.swing.plaf.nimbus.NimbusLookAndFeel;
import java.awt.*;
import java.awt.event.InputEvent;
import java.awt.event.KeyEvent;

public class MainWindow implements ViewConstants, ServerConstants{
    private JFrame mainFrame;
    private ServerController serverController;

    public MainWindow(){
        configureMainFrame();
        configureServerController();
        chooserServerType();
        createMenuBar();
        createToolBar();
    }
    
    private void configureMainFrame(){
        mainFrame = new JFrame(APPLICATION_NAME);
        try {
            UIManager.setLookAndFeel(new NimbusLookAndFeel());
        } catch (UnsupportedLookAndFeelException e) {
            e.printStackTrace();
        }

        mainFrame.setLayout(new BorderLayout());
        mainFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        mainFrame.setSize(FRAME_WIDTH, FRAME_HEIGHT);
        mainFrame.setLocationRelativeTo(null);
        mainFrame.setVisible(true);
    }

    private void createMenuBar(){
        JMenuBar mainMenuBar = new JMenuBar();
        JMenu fileMenu = new JMenu(FILE);
        fileMenu.setMnemonic(KeyEvent.VK_F);

        JMenuItem createItem = new JMenuItem(NEW, KeyEvent.VK_N);
        createItem.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_N, InputEvent.CTRL_MASK));
        JMenuItem saveItem = new JMenuItem(SAVE, KeyEvent.VK_S);
        JMenuItem exitItem = new JMenuItem(EXIT, KeyEvent.VK_Q);
        exitItem.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_Q, InputEvent.CTRL_MASK));

        fileMenu.add(createItem);
        fileMenu.add(saveItem);
        fileMenu.add(exitItem);
        mainMenuBar.add(fileMenu);

        JMenu editMenu = new JMenu(EDIT);
        fileMenu.setMnemonic(KeyEvent.VK_E);

        JMenuItem searchItem = new JMenuItem(FIND, KeyEvent.VK_R);
        searchItem.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_R, InputEvent.CTRL_MASK));
        searchItem.setActionCommand(FIND);
        JMenuItem additionItem = new JMenuItem(ADD, KeyEvent.VK_A);
        additionItem.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_A, InputEvent.CTRL_MASK));
        JMenuItem deleteItem = new JMenuItem(FIND_REMOVE, KeyEvent.VK_D);
        deleteItem.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_D, InputEvent.CTRL_MASK));
        deleteItem.setActionCommand(FIND_REMOVE);

        editMenu.add(searchItem);
        editMenu.add(additionItem);
        editMenu.add(deleteItem);
        mainMenuBar.add(editMenu);
        mainFrame.setJMenuBar(mainMenuBar);

        createItem.addActionListener(new NewTableListener(serverController));
        saveItem.addActionListener(new SaveMenuListener(serverController));
        exitItem.addActionListener(new ExitMenuListener());

        additionItem.addActionListener(new AdditionListener(serverController, mainFrame));
        searchItem.addActionListener(new SearchDeleteListener(serverController, mainFrame));
        deleteItem.addActionListener(new SearchDeleteListener(serverController, mainFrame));
    }

    private void createToolBar(){
        JToolBar studentToolBar = new JToolBar(null, JToolBar.VERTICAL);

        JButton searchButton = new JButton(new ImageIcon(SEARCH_TOOLBAR_EDIT));
        searchButton.setActionCommand(FIND);
        JButton additionButton = new JButton(new ImageIcon(ADDITION_TOOLBAR_EDIT));
        JButton deleteButton = new JButton(new ImageIcon(DELETE_TOOLBAR_EDIT));
        deleteButton.setActionCommand(FIND_REMOVE);

        studentToolBar.add(searchButton);
        studentToolBar.add(additionButton);
        studentToolBar.add(deleteButton);

        studentToolBar.setFloatable(false);
        studentToolBar.setVisible(true);
        mainFrame.add(studentToolBar, BorderLayout.WEST);

        JToolBar fileToolBar = new JToolBar(null, JToolBar.HORIZONTAL);
        JButton newButton = new JButton(new ImageIcon(NEW_TOOLBAR_FILE));
        JButton saveButton = new JButton(new ImageIcon(SAVE_TOOLBAR_FILE));

        fileToolBar.add(newButton);
        fileToolBar.add(saveButton);
        fileToolBar.setFloatable(false);
        fileToolBar.setVisible(true);
        mainFrame.add(fileToolBar, BorderLayout.NORTH);

        newButton.addActionListener(new NewTableListener(serverController));
        saveButton.addActionListener(new SaveMenuListener(serverController));

        additionButton.addActionListener(new AdditionListener(serverController, mainFrame));
        searchButton.addActionListener(new SearchDeleteListener(serverController, mainFrame));
        deleteButton.addActionListener(new SearchDeleteListener(serverController, mainFrame));
    }

    private void configureServerController(){
        serverController = new ServerController();
        serverController.setTabbedTab(new JTabbedPane(JTabbedPane.TOP, JTabbedPane.WRAP_TAB_LAYOUT));
        mainFrame.add(serverController.getTabbedTab(), BorderLayout.CENTER);
    }

    private void chooserServerType(){
        Object[] possibilities = {RPC_TYPE, SOAP_TYPE};
        String choose = (String)JOptionPane.showInputDialog(null, "Choose server type", "Server Chooser",
                JOptionPane.PLAIN_MESSAGE, null, possibilities, SOAP_TYPE);
        if (RPC_TYPE.equals(choose)){
            serverController.setServerManager(new RPCManager());
        } else if (SOAP_TYPE.equals(choose)){
            serverController.setServerManager(new SOAPManager());
        } else {
            System.exit(0);
        }
    }

    private String enterHost(){
        String nameHost = JOptionPane.showInputDialog("Enter name of host");
        if (nameHost.equals("")){
            nameHost = "localhost";
        }
        return nameHost;
    }

    public ServerController getServerController() {
        return serverController;
    }

    public void setServerController(ServerController serverController) {
        this.serverController = serverController;
    }
}
