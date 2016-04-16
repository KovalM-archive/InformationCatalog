package kmv.soap;

import kmv.student.SearchStudentTerms;
import kmv.student.StudentModel;

import javax.jws.WebMethod;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;
import java.util.List;

@WebService
@SOAPBinding(style = SOAPBinding.Style.DOCUMENT,
        use = SOAPBinding.Use.LITERAL,
        parameterStyle = SOAPBinding.ParameterStyle.WRAPPED)
public interface SOAPWebServer {
    @WebMethod
    List<StudentModel> getAllStudents();

    @WebMethod
    void addStudent(StudentModel studentModel);

    @WebMethod
    void removeStudent(StudentModel studentModel);

    @WebMethod
    boolean updateStudent(SearchStudentTerms studentTerms);

    @WebMethod
    List<StudentModel> findStudents(SearchStudentTerms studentTerms);

    @WebMethod
    void findRemoveStudents(SearchStudentTerms studentTerms);

    @WebMethod
    int getStudentCount();

    @WebMethod
    StudentModel getStudentAtIndex(int index);

    @WebMethod
    void saveChanges();
}
