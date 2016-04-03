package kmv.view;

import kmv.controler.ServerController;
import kmv.student.StudentModel;

import javax.swing.JTable;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class StudentTableView extends JTable {
    private StudentTableModel tableModel;
    private ServerController serverController;
    private int numberPage;

    public StudentTableView(StudentTableModel tableModel, ServerController serverController){
        super(tableModel);
        this.tableModel = tableModel;
        this.serverController = serverController;
        tableModel.setNumberRecordsOnPage(1);
        tableModel.setIndexPage(1);
        calculateNumberPage();
        goToPage(1);
    }

    public int getNumberPage() {
        calculateNumberPage();
        return numberPage;
    }

    public void setNumberPage(int numberPage) {
        this.numberPage = numberPage;
    }

    public void setNumberRecordsOnPage(int newNumber){
        tableModel.setNumberRecordsOnPage(newNumber);
    }

    public int getIndexPage() {
        return tableModel.getIndexPage();
    }

    public void goToPage(int newPageIndex){
        if (newPageIndex <= numberPage){
            List<StudentModel> studentListBuffer = new ArrayList<StudentModel>();
            int l = tableModel.getNumberRecordsOnPage()*(newPageIndex-1);
            int r = l + tableModel.getNumberRecordsOnPage();
            int countRecods = getCountRecord();
            for (int i = l+1; i <=r; i++) {
                if (i > countRecods){
                    break;
                }
                studentListBuffer.add(getStudentAtIndex(i-1));
            }
            StudentTableModel newTableModel = new StudentTableModel(studentListBuffer);
            newTableModel.setIndexPage(newPageIndex);
            newTableModel.setNumberRecordsOnPage(tableModel.getNumberRecordsOnPage());
            tableModel = newTableModel;
            this.setModel(newTableModel);
        }
    }

    public int getCountRecord(){
        return serverController.getServiceManager().getStudentCount();
    }

    public void calculateNumberPage(){
        int x = 0;
        int numberRecordsOnPage = tableModel.getNumberRecordsOnPage();
        int countRecord = getCountRecord();
        while (x*numberRecordsOnPage < countRecord) {
            x++;
        }
        numberPage = x;
    }

    public void addStudent(StudentModel currentStudent){
        serverController.getServiceManager().addStudent(currentStudent);
        calculateNumberPage();
        goToPage(tableModel.getIndexPage());
    }

    public StudentModel getStudentAtIndex(int index){
        return serverController.getServiceManager().getStudentAtIndex(index);
    }

    public void removeStudent(StudentModel oldStudent){
        serverController.getServiceManager().removeStudent(oldStudent);
        calculateNumberPage();
        goToPage(1);
    }

    public List<StudentModel> getStudentList(){
        return null;
    }
}
