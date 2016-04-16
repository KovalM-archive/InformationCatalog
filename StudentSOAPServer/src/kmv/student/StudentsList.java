package kmv.student;

import kmv.soap.ServerConfiguration;
import kmv.xml.XMLFileService;

import javax.xml.parsers.ParserConfigurationException;
import javax.xml.transform.TransformerException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class StudentsList implements ServerConfiguration {
    private List<StudentModel> studentList;
    private List<StudentModel> studentListBackup;
    private XMLFileService xmlFileService;

    public StudentsList(){
        studentList = new ArrayList<>();
        xmlFileService = new XMLFileService(this);
        xmlFileService.readFile(DATA_FILE);
        studentListBackup = studentList.subList(0, studentList.size());
    }

    public void obtainBackup(){
        studentList = studentListBackup;
    }

    public void saveChanges(){
        try {
            xmlFileService.writeFile(DATA_FILE);
        } catch (IOException e) {
            e.printStackTrace();
        } catch (TransformerException e) {
            e.printStackTrace();
        } catch (ParserConfigurationException e) {
            e.printStackTrace();
        }
    }
    public int getCountRecord(){
        return studentList.size();
    }

    public void addStudent(StudentModel currentStudent){
        studentList.add(currentStudent);
    }

    public StudentModel getStudentAtIndex(int x){
        if (x>=0 && x < studentList.size()){
            return studentList.get(x);
        } else{
            return null;
        }
    }

    public void removeStudent(StudentModel oldStudent){
        studentList.remove(oldStudent);
    }

    public List<StudentModel> getStudentList(){
        return studentList;
    }

    public void setStudentList(List<StudentModel> newStudentList){
        studentList = newStudentList;
    }

    public void findStudents(SearchStudentTerms searchStudentTerms){
        studentList = new ArrayList<>();

        StudentModel student;
        int number = studentListBackup.size();
        for (int i = 0; i < number; i++) {
            student = studentListBackup.get(i);
            if (foundAgreement(student, searchStudentTerms)){
                studentList.add(student.clone());
            }
        }
    }

    public void findRemoveStudents(SearchStudentTerms searchStudentTerms){
        studentList = new ArrayList<>();

        StudentModel student;
        int number = studentListBackup.size();
        for (int i = 0; i < number; i++) {
            student = studentListBackup.get(i);
            if (foundAgreement(student, searchStudentTerms)){
                studentList.add(student);
                studentListBackup.remove(i);
                i--;
                number--;
            }
        }
    }

    private boolean foundAgreement(StudentModel student, SearchStudentTerms currentStudent){
        boolean flag = false;
        if (currentStudent.isFirstNameFlag()){
            flag = flag | currentStudent.getFirstName().equals(student.getFirstName());
        }
        if (currentStudent.isSecondNameFlag()){
            flag = flag | currentStudent.getSecondName().equals(student.getSecondName());
        }
        if (currentStudent.isThirdNameFlag()){
            flag = flag | currentStudent.getThirdName().equals(student.getThirdName());
        }
        if (currentStudent.isDateBirthFlag()) {
            flag = flag | currentStudent.getDateBirth().equals(student.getDateBirth());
        }
        if (currentStudent.isFootballTeamNameFlag()){
            flag = flag | currentStudent.getFootballTeamName().equals(student.getFootballTeamName());
        }
        if (currentStudent.isFacultyNameFlag()){
            flag = flag | currentStudent.getFacultyName().equals(student.getFacultyName());
        }
        if (currentStudent.isSquadFlag()){
            flag = flag | (currentStudent.getSquad() == student.getSquad());
        }
        if (currentStudent.isPositionFlag()){
            flag = flag | (currentStudent.getPosition() == student.getPosition());
        }
        return flag;
    }
}
