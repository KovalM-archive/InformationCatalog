package kmv.menu.edit;

import kmv.controler.ServerController;
import kmv.view.TablePanel;

import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class CloseSearchDialogListener implements WindowListener {
    private TablePanel tablePanel;
    private ServerController serverController;

    public CloseSearchDialogListener(TablePanel tablePanel, ServerController serverController){
        this.tablePanel = tablePanel;
        this.serverController = serverController;
    }

    @Override
    public void windowClosed(WindowEvent e) {
    }

    @Override
    public void windowOpened(WindowEvent e) {

    }

    @Override
    public void windowClosing(WindowEvent e) {
        serverController.getServerManager().updateStudent(null);
        tablePanel.getTableView().goToPage(1);
        tablePanel.getChangeTablePanel().getAllRecord().setText(
                    String.valueOf(tablePanel.getTableView().getCountRecord()));
        tablePanel.getChangeTablePanel().getAllPage().setText(
                    String.valueOf(tablePanel.getTableView().getNumberPage()));
    }

    @Override
    public void windowIconified(WindowEvent e) {

    }

    @Override
    public void windowDeiconified(WindowEvent e) {

    }

    @Override
    public void windowActivated(WindowEvent e) {

    }

    @Override
    public void windowDeactivated(WindowEvent e) {

    }
}
