package kmv.server;

import kmv.soap.SearchStudentTerms;
import kmv.soap.StudentModel;

import java.util.List;

public class RPCManager implements ServerManager {
    private String hostName;

    public RPCManager(String hostName){
        setHostName(hostName);
    }

    @Override
    public List<StudentModel> getAllStudents() {
        return null;
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

    @Override
    public void saveChanges() {

    }

    public String getHostName() {
        return hostName;
    }

    public void setHostName(String hostName) {
        this.hostName = hostName;
    }
}
