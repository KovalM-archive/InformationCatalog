package kmv.menu.file;

import kmv.controler.ServerController;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class SaveMenuListener implements ActionListener {
    private ServerController serverController;

    public SaveMenuListener(ServerController serverController) {
        this.serverController = serverController;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        serverController.getServerManager().saveChanges();
        JOptionPane.showMessageDialog(serverController.getTabbedTab(), "Data saved!");
    }
}
