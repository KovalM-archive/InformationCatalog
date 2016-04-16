package kmv.server;

import kmv.soap.SOAPWebServer;
import kmv.soap.StudentWebServerService;
import kmv.soap.SearchStudentTerms;
import kmv.soap.StudentModel;

import java.util.List;

public class SOAPManager implements ServerManager {
    private SOAPWebServer soapWebServer;

    public SOAPManager(){
        StudentWebServerService webServerService = new StudentWebServerService();
        soapWebServer = webServerService.getStudentWebServerPort();
    }

    @Override
    public List<StudentModel> getAllStudents() {
        return soapWebServer.getAllStudents();
    }

    @Override
    public void addStudent(StudentModel studentModel) {
        soapWebServer.addStudent(studentModel);
    }

    @Override
    public void removeStudent(StudentModel studentModel) {
        soapWebServer.removeStudent(studentModel);
    }

    @Override
    public boolean updateStudent(SearchStudentTerms studentTerms) {
        return soapWebServer.updateStudent(studentTerms);
    }

    @Override
    public List<StudentModel> findStudents(SearchStudentTerms studentTerms) {
        return soapWebServer.findStudents(studentTerms);
    }

    @Override
    public void findRemoveStudents(SearchStudentTerms studentTerms) {
        soapWebServer.findRemoveStudents(studentTerms);
    }

    @Override
    public int getStudentCount() {
        return soapWebServer.getStudentCount();
    }

    @Override
    public StudentModel getStudentAtIndex(int index) {
        return soapWebServer.getStudentAtIndex(index);
    }

    @Override
    public void saveChanges() {
        soapWebServer.saveChanges();
    }
}
