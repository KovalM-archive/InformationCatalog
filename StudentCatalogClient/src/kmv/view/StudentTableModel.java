package kmv.view;


import kmv.soap.StudentModel;

import javax.swing.table.AbstractTableModel;
import java.util.GregorianCalendar;
import java.util.List;

public class StudentTableModel extends AbstractTableModel {
    private List<StudentModel> studentListBuffer;
    private int numberRecordsOnPage;
    private int indexPage;

    public StudentTableModel(List<StudentModel> studentListBuffer){
        setStudentListBuffer(studentListBuffer);
    }

    @Override
    public int getRowCount() {
        return studentListBuffer.size();
    }

    @Override
    public int getColumnCount() {
        return 7;
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        if (columnIndex != 0){
            return getField(studentListBuffer.get(rowIndex), columnIndex);
        } else {
            return numberRecordsOnPage*(indexPage-1)+rowIndex+1;
        }
    }

    @Override
    public String getColumnName(int column) {
        String columnName[] ={
            "№",
            "ФИО студента",
            "Дата рождения",
            "Футбольная команда",
            "Факультет",
            "Состав",
            "Позиция"
        };
        return columnName[column];
    }

    public void setStudentListBuffer(List<StudentModel> studentListBuffer){
        this.studentListBuffer = studentListBuffer;
    }
    public List<StudentModel> getStudentListBuffer(){
        return studentListBuffer;
    }

    public int getNumberRecordsOnPage() {
        return numberRecordsOnPage;
    }

    public void setNumberRecordsOnPage(int numberRecordsOnPage) {
        this.numberRecordsOnPage = numberRecordsOnPage;
    }

    public int getIndexPage() {
        return indexPage;
    }

    public void setIndexPage(int indexPage) {
        this.indexPage = indexPage;
    }

    private Object getField(StudentModel studentModel, int columnIndex){
        if (columnIndex == 1){
            return studentModel.getSecondName() + " " +
                    studentModel.getFirstName() + " " +
                    studentModel.getThirdName();
        } else if (columnIndex == 2){
            return studentModel.getDateBirth().getDay() + "." +
                    studentModel.getDateBirth().getMonth() + "." +
                    studentModel.getDateBirth().getYear();
        } else if (columnIndex == 3){
            return studentModel.getFootballTeamName();
        } else if (columnIndex == 4){
            return studentModel.getFacultyName();
        } else if (columnIndex == 5){
            return studentModel.getSquad();
        } else if (columnIndex == 6){
            return studentModel.getPosition();
        } else{
            return null;
        }
    }
}
