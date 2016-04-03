package kmv.server;

import kmv.student.SearchStudentTerms;
import kmv.student.StudentModel;

import java.util.List;

public class SOAPManager implements ServiceManager {
    private String hostName;

    public SOAPManager(String hostName){
        setHostName(hostName);
    }

    @Override
    public void addStudent(StudentModel studentModel) {

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
        return null;
    }

    @Override
    public void findRemoveStudents(SearchStudentTerms studentTerms) {

    }

    @Override
    public int getStudentCount() {
        return 0;
    }

    @Override
    public StudentModel getStudentAtIndex(int index) {
        return null;
    }

    public String getHostName() {
        return hostName;
    }

    public void setHostName(String hostName) {
        this.hostName = hostName;
    }
}
