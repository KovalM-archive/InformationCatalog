package kmv.menu.file;

//import tablemodel.TableModel;
//import tableview.TableView;

import kmv.controler.ServerController;
import kmv.student.StudentModel;
import kmv.view.StudentTableModel;
import kmv.view.TablePanel;
import kmv.view.ChangeTablePanel;
import kmv.view.StudentTableView;

import javax.swing.JScrollPane;
import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

public class NewTableListener implements ActionListener {
    private ServerController serverController;
    public NewTableListener(ServerController serverController){
        this.serverController = serverController;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        StudentTableModel tableModel = new StudentTableModel(new ArrayList<StudentModel>());
        StudentTableView tableView = new StudentTableView(tableModel, serverController);
        ChangeTablePanel changeTablePanel = new ChangeTablePanel(tableView);
        TablePanel mainPage = new TablePanel(tableView, changeTablePanel);

        mainPage.setLayout(new BorderLayout());
        JScrollPane scrollPane = new JScrollPane(tableView);
        mainPage.add(scrollPane, BorderLayout.CENTER);
        mainPage.add(changeTablePanel, BorderLayout.SOUTH);
        serverController.getTabbedTab().add("No name", mainPage);
        serverController.getTabbedTab().setSelectedComponent(mainPage);
    }
}
