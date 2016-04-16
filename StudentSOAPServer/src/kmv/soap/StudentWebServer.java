package kmv.soap;

import kmv.student.SearchStudentTerms;
import kmv.student.StudentModel;
import kmv.student.StudentsList;

import javax.jws.WebService;
import java.util.List;

@WebService(endpointInterface = "kmv.soap.SOAPWebServer")
public class StudentWebServer implements SOAPWebServer {
    private StudentsList studentsList = new StudentsList();

    @Override
    public List<StudentModel> getAllStudents() {
        return studentsList.getStudentList();
    }

    @Override
    public void addStudent(StudentModel studentModel) {
        studentsList.addStudent(studentModel);
    }

    @Override
    public void removeStudent(StudentModel studentModel) {
        studentsList.removeStudent(studentModel);
    }

    @Override
    public boolean updateStudent(SearchStudentTerms studentTerms) {
        studentsList.obtainBackup();
        return false;
    }

    @Override
    public List<StudentModel> findStudents(SearchStudentTerms studentTerms) {
        studentsList.findStudents(studentTerms);
        return null;
    }

    @Override
    public void findRemoveStudents(SearchStudentTerms studentTerms) {
        studentsList.findRemoveStudents(studentTerms);
    }

    @Override
    public int getStudentCount() {
        return studentsList.getCountRecord();
    }

    @Override
    public StudentModel getStudentAtIndex(int index) {
        return studentsList.getStudentAtIndex(index);
    }

    @Override
    public void saveChanges() {
        studentsList.saveChanges();
    }
}
