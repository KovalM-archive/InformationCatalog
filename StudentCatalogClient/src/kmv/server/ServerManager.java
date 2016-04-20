package kmv.server;

import kmv.soap.SearchStudentTerms;
import kmv.soap.StudentModel;
import org.apache.thrift.TException;

import java.util.List;

public interface ServerManager {

    void addStudent(StudentModel studentModel);

    void removeStudent(StudentModel studentModel);

    boolean updateStudent(SearchStudentTerms studentTerms);

    List<StudentModel> findStudents(SearchStudentTerms studentTerms);

    void findRemoveStudents(SearchStudentTerms studentTerms);

    int getStudentCount();

    StudentModel getStudentAtIndex(int index);

    void saveChanges();
}
