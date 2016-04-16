package kmv.menu.edit;

import kmv.controler.ServerController;
import kmv.view.MainWindow;
import kmv.view.TablePanel;

import javax.swing.JDialog;
import javax.swing.JFrame;
import javax.swing.JTabbedPane;
import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class AdditionListener implements ActionListener {
	private ServerController serverController;
	private JFrame mainWindow;

	public AdditionListener(ServerController serverController, JFrame mainWindow){
		this.serverController = serverController;
		this.mainWindow = mainWindow;
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		TablePanel tablePanel = (TablePanel)serverController.getTabbedTab().getSelectedComponent();
		JDialog additionStudentFrame = new JDialog(mainWindow, "Addition of student", false);
        additionStudentFrame.setSize(400, 500);
		additionStudentFrame.setLocationRelativeTo(tablePanel);
		additionStudentFrame.setVisible(true);
		additionStudentFrame.setLayout(new BorderLayout());

		AdditionDialogPanel additionDialogPanel = new AdditionDialogPanel(tablePanel);
		additionStudentFrame.add(additionDialogPanel, BorderLayout.NORTH);
	}
}
