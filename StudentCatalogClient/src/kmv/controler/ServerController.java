package kmv.controler;

import kmv.server.ServerManager;

import javax.swing.*;

public class ServerController {
    private ServerManager serverManager;
    private JTabbedPane tabbedTab;

    public ServerManager getServerManager() {
        return serverManager;
    }

    public void setServerManager(ServerManager serverManager) {
        this.serverManager = serverManager;
    }

    public JTabbedPane getTabbedTab() {
        return tabbedTab;
    }

    public void setTabbedTab(JTabbedPane tabbedTab) {
        this.tabbedTab = tabbedTab;
    }
}
