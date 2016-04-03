package kmv.menu.file;

import javax.swing.JFrame;
import javax.swing.JOptionPane;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class SaveMenuListener implements ActionListener {
    private ObjectOutputStream outputStream;
    private JFrame mainWindow;

    public SaveMenuListener(JFrame mainWindow, ObjectOutputStream outputStream) {
        this.mainWindow = mainWindow;
        this.outputStream = outputStream;

    }

    @Override
    public void actionPerformed(ActionEvent e) {
        try {
            outputStream.writeObject("Save");
            String  nameFile = JOptionPane.showInputDialog("Enter name of kmv.menu.file");
            outputStream.writeObject(nameFile);
        } catch (IOException e1) {
            e1.printStackTrace();
        }
    }
}
