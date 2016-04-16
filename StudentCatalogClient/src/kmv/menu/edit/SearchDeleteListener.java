package kmv.menu.edit;

import kmv.controler.ServerController;
import kmv.soap.StudentModel;
import kmv.view.*;

import javax.swing.*;
import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

public class SearchDeleteListener implements ActionListener, ViewConstants{
	private ServerController serverController;
	private JFrame mainWindow;

	public SearchDeleteListener(ServerController serverController, JFrame mainWindow){
		this.serverController = serverController;
		this.mainWindow = mainWindow;
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		JDialog searchStudentFrame = new JDialog(mainWindow, e.getActionCommand(), false);
		searchStudentFrame.setSize(500, 500);
		searchStudentFrame.setLocationRelativeTo(mainWindow);
		searchStudentFrame.setVisible(true);
		searchStudentFrame.setLayout(new BorderLayout());
		JLabel searchText;

		if (e.getActionCommand() == FIND){
			searchText = new JLabel("Найдено:");
		}else{
            searchText = new JLabel("Найдено и удалено:");
        }

		StudentTableModel tableModel = new StudentTableModel(new ArrayList<StudentModel>());
		StudentTableView tableView = new StudentTableView(tableModel, serverController);

		ChangeTablePanel changeTablePanel = new ChangeTablePanel(tableView);
		TablePanel mainPage = new TablePanel(tableView, changeTablePanel);
		TablePanel tablePanel = (TablePanel)serverController.getTabbedTab().getSelectedComponent();
		mainPage.setLayout(new BorderLayout());
		JScrollPane scrollpane = new JScrollPane(tableView);
		mainPage.add(scrollpane, BorderLayout.CENTER);
		mainPage.add(changeTablePanel, BorderLayout.SOUTH);

		SearchTermsPanel searchTermsPanel = new SearchTermsPanel(mainPage, serverController, e.getActionCommand());

		searchStudentFrame.add(searchTermsPanel,BorderLayout.SOUTH);
		searchStudentFrame.add(searchText,BorderLayout.NORTH);
		searchStudentFrame.add(mainPage,BorderLayout.CENTER);
		searchStudentFrame.addWindowListener(new CloseSearchDialogListener(tablePanel, serverController));
	}
}
