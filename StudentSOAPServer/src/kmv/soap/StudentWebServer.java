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
    public void addStudent(StudentModel studentModel) {
        studentsList.addStudent(studentModel);
    }

    @Override
    public void removeStudent(StudentModel studentModel) {

    }

    @Override
    public boolean updateStudent(SearchStudentTerms studentTerms) {
        return false;
    }

    @Override
    public List<StudentModel> findStudents(SearchStudentTerms studentTerms) {
        return studentsList.findStudents(studentTerms);
    }

    @Override
    public void findRemoveStudents(SearchStudentTerms studentTerms) {
        studentsList.findRemoveStudents(studentTerms);
    }

    @Override
    public int getStudentCount() {
        return 0;
    }

    @Override
    public StudentModel getStudentAtIndex(int index) {
        return null;
    }
}
