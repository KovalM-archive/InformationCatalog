package kmv.thrift;

import kmv.student.StudentsList;
import org.apache.thrift.TException;

import java.util.List;

public class StudentWebServer implements ThriftWebServer.Iface{
    private StudentsList studentsList = new StudentsList();

    @Override
    public void addStudent(List<String> studentModel) throws TException {
        studentsList.addStudent(StudentUtils.createStudentModel(studentModel));
    }

    @Override
    public void removeStudent(List<String> studentModel) throws TException {
        studentsList.removeStudent(StudentUtils.createStudentModel(studentModel));
    }

    @Override
    public boolean updateStudent(List<String> studentTerms, List<Boolean> studentTermsFlags) throws TException {
        studentsList.obtainBackup();
        return false;
    }

    @Override
    public List<List<String>> findStudents(List<String> studentTerms, List<Boolean> studentTermsFlags) throws TException {
        studentsList.findStudents(StudentUtils.createSearchStudentTerms(studentTerms, studentTermsFlags));
        return null;
    }

    @Override
    public void findRemoveStudents(List<String> studentTerms, List<Boolean> studentTermsFlags) throws TException {
        studentsList.findRemoveStudents(StudentUtils.createSearchStudentTerms(studentTerms, studentTermsFlags));
    }

    @Override
    public int getStudentCount() throws TException {
        return studentsList.getCountRecord();
    }

    @Override
    public List<String> getStudentAtIndex(int index) throws TException {
        return StudentUtils.getFieldList(studentsList.getStudentAtIndex(index));
    }

    @Override
    public void saveChanges() throws TException {
        studentsList.saveChanges();
    }
}
