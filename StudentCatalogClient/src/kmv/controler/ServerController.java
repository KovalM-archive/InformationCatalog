package kmv.controler;

import kmv.server.ServiceManager;

import javax.swing.*;

public class ServerController {
    private ServiceManager serviceManager;
    private JTabbedPane tabbedTab;

    public ServiceManager getServiceManager() {
        return serviceManager;
    }

    public void setServiceManager(ServiceManager serviceManager) {
        this.serviceManager = serviceManager;
    }

    public JTabbedPane getTabbedTab() {
        return tabbedTab;
    }

    public void setTabbedTab(JTabbedPane tabbedTab) {
        this.tabbedTab = tabbedTab;
    }
}
