package kmv.server;

import kmv.student.SearchStudentTerms;
import kmv.student.StudentModel;

import java.util.List;

public interface ServiceManager {
    void addStudent(StudentModel studentModel);

    void removeStudent(StudentModel studentModel);

    boolean updateStudent(SearchStudentTerms studentTerms);

    List<StudentModel> findStudents(SearchStudentTerms studentTerms);

    void findRemoveStudents(SearchStudentTerms studentTerms);

    int getStudentCount();

    StudentModel getStudentAtIndex(int index);
}
