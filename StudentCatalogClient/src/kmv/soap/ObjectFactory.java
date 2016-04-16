
package kmv.soap;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the kmv.soap package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _UpdateStudentResponse_QNAME = new QName("http://soap.kmv/", "updateStudentResponse");
    private final static QName _AddStudent_QNAME = new QName("http://soap.kmv/", "addStudent");
    private final static QName _FindRemoveStudents_QNAME = new QName("http://soap.kmv/", "findRemoveStudents");
    private final static QName _GetAllStudentsResponse_QNAME = new QName("http://soap.kmv/", "getAllStudentsResponse");
    private final static QName _UpdateStudent_QNAME = new QName("http://soap.kmv/", "updateStudent");
    private final static QName _GetStudentAtIndexResponse_QNAME = new QName("http://soap.kmv/", "getStudentAtIndexResponse");
    private final static QName _RemoveStudentResponse_QNAME = new QName("http://soap.kmv/", "removeStudentResponse");
    private final static QName _FindStudents_QNAME = new QName("http://soap.kmv/", "findStudents");
    private final static QName _FindRemoveStudentsResponse_QNAME = new QName("http://soap.kmv/", "findRemoveStudentsResponse");
    private final static QName _GetStudentCount_QNAME = new QName("http://soap.kmv/", "getStudentCount");
    private final static QName _GetAllStudents_QNAME = new QName("http://soap.kmv/", "getAllStudents");
    private final static QName _AddStudentResponse_QNAME = new QName("http://soap.kmv/", "addStudentResponse");
    private final static QName _GetStudentAtIndex_QNAME = new QName("http://soap.kmv/", "getStudentAtIndex");
    private final static QName _SaveChanges_QNAME = new QName("http://soap.kmv/", "saveChanges");
    private final static QName _FindStudentsResponse_QNAME = new QName("http://soap.kmv/", "findStudentsResponse");
    private final static QName _GetStudentCountResponse_QNAME = new QName("http://soap.kmv/", "getStudentCountResponse");
    private final static QName _RemoveStudent_QNAME = new QName("http://soap.kmv/", "removeStudent");
    private final static QName _SaveChangesResponse_QNAME = new QName("http://soap.kmv/", "saveChangesResponse");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: kmv.soap
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link AddStudent }
     * 
     */
    public AddStudent createAddStudent() {
        return new AddStudent();
    }

    /**
     * Create an instance of {@link UpdateStudentResponse }
     * 
     */
    public UpdateStudentResponse createUpdateStudentResponse() {
        return new UpdateStudentResponse();
    }

    /**
     * Create an instance of {@link FindRemoveStudents }
     * 
     */
    public FindRemoveStudents createFindRemoveStudents() {
        return new FindRemoveStudents();
    }

    /**
     * Create an instance of {@link GetAllStudentsResponse }
     * 
     */
    public GetAllStudentsResponse createGetAllStudentsResponse() {
        return new GetAllStudentsResponse();
    }

    /**
     * Create an instance of {@link GetStudentAtIndexResponse }
     * 
     */
    public GetStudentAtIndexResponse createGetStudentAtIndexResponse() {
        return new GetStudentAtIndexResponse();
    }

    /**
     * Create an instance of {@link UpdateStudent }
     * 
     */
    public UpdateStudent createUpdateStudent() {
        return new UpdateStudent();
    }

    /**
     * Create an instance of {@link FindStudents }
     * 
     */
    public FindStudents createFindStudents() {
        return new FindStudents();
    }

    /**
     * Create an instance of {@link RemoveStudentResponse }
     * 
     */
    public RemoveStudentResponse createRemoveStudentResponse() {
        return new RemoveStudentResponse();
    }

    /**
     * Create an instance of {@link FindRemoveStudentsResponse }
     * 
     */
    public FindRemoveStudentsResponse createFindRemoveStudentsResponse() {
        return new FindRemoveStudentsResponse();
    }

    /**
     * Create an instance of {@link GetStudentCount }
     * 
     */
    public GetStudentCount createGetStudentCount() {
        return new GetStudentCount();
    }

    /**
     * Create an instance of {@link GetAllStudents }
     * 
     */
    public GetAllStudents createGetAllStudents() {
        return new GetAllStudents();
    }

    /**
     * Create an instance of {@link GetStudentAtIndex }
     * 
     */
    public GetStudentAtIndex createGetStudentAtIndex() {
        return new GetStudentAtIndex();
    }

    /**
     * Create an instance of {@link AddStudentResponse }
     * 
     */
    public AddStudentResponse createAddStudentResponse() {
        return new AddStudentResponse();
    }

    /**
     * Create an instance of {@link FindStudentsResponse }
     * 
     */
    public FindStudentsResponse createFindStudentsResponse() {
        return new FindStudentsResponse();
    }

    /**
     * Create an instance of {@link SaveChanges }
     * 
     */
    public SaveChanges createSaveChanges() {
        return new SaveChanges();
    }

    /**
     * Create an instance of {@link RemoveStudent }
     * 
     */
    public RemoveStudent createRemoveStudent() {
        return new RemoveStudent();
    }

    /**
     * Create an instance of {@link GetStudentCountResponse }
     * 
     */
    public GetStudentCountResponse createGetStudentCountResponse() {
        return new GetStudentCountResponse();
    }

    /**
     * Create an instance of {@link SaveChangesResponse }
     * 
     */
    public SaveChangesResponse createSaveChangesResponse() {
        return new SaveChangesResponse();
    }

    /**
     * Create an instance of {@link StudentModel }
     * 
     */
    public StudentModel createStudentModel() {
        return new StudentModel();
    }

    /**
     * Create an instance of {@link SearchStudentTerms }
     * 
     */
    public SearchStudentTerms createSearchStudentTerms() {
        return new SearchStudentTerms();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link UpdateStudentResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://soap.kmv/", name = "updateStudentResponse")
    public JAXBElement<UpdateStudentResponse> createUpdateStudentResponse(UpdateStudentResponse value) {
        return new JAXBElement<UpdateStudentResponse>(_UpdateStudentResponse_QNAME, UpdateStudentResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AddStudent }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://soap.kmv/", name = "addStudent")
    public JAXBElement<AddStudent> createAddStudent(AddStudent value) {
        return new JAXBElement<AddStudent>(_AddStudent_QNAME, AddStudent.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FindRemoveStudents }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://soap.kmv/", name = "findRemoveStudents")
    public JAXBElement<FindRemoveStudents> createFindRemoveStudents(FindRemoveStudents value) {
        return new JAXBElement<FindRemoveStudents>(_FindRemoveStudents_QNAME, FindRemoveStudents.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetAllStudentsResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://soap.kmv/", name = "getAllStudentsResponse")
    public JAXBElement<GetAllStudentsResponse> createGetAllStudentsResponse(GetAllStudentsResponse value) {
        return new JAXBElement<GetAllStudentsResponse>(_GetAllStudentsResponse_QNAME, GetAllStudentsResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link UpdateStudent }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://soap.kmv/", name = "updateStudent")
    public JAXBElement<UpdateStudent> createUpdateStudent(UpdateStudent value) {
        return new JAXBElement<UpdateStudent>(_UpdateStudent_QNAME, UpdateStudent.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetStudentAtIndexResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://soap.kmv/", name = "getStudentAtIndexResponse")
    public JAXBElement<GetStudentAtIndexResponse> createGetStudentAtIndexResponse(GetStudentAtIndexResponse value) {
        return new JAXBElement<GetStudentAtIndexResponse>(_GetStudentAtIndexResponse_QNAME, GetStudentAtIndexResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RemoveStudentResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://soap.kmv/", name = "removeStudentResponse")
    public JAXBElement<RemoveStudentResponse> createRemoveStudentResponse(RemoveStudentResponse value) {
        return new JAXBElement<RemoveStudentResponse>(_RemoveStudentResponse_QNAME, RemoveStudentResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FindStudents }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://soap.kmv/", name = "findStudents")
    public JAXBElement<FindStudents> createFindStudents(FindStudents value) {
        return new JAXBElement<FindStudents>(_FindStudents_QNAME, FindStudents.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FindRemoveStudentsResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://soap.kmv/", name = "findRemoveStudentsResponse")
    public JAXBElement<FindRemoveStudentsResponse> createFindRemoveStudentsResponse(FindRemoveStudentsResponse value) {
        return new JAXBElement<FindRemoveStudentsResponse>(_FindRemoveStudentsResponse_QNAME, FindRemoveStudentsResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetStudentCount }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://soap.kmv/", name = "getStudentCount")
    public JAXBElement<GetStudentCount> createGetStudentCount(GetStudentCount value) {
        return new JAXBElement<GetStudentCount>(_GetStudentCount_QNAME, GetStudentCount.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetAllStudents }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://soap.kmv/", name = "getAllStudents")
    public JAXBElement<GetAllStudents> createGetAllStudents(GetAllStudents value) {
        return new JAXBElement<GetAllStudents>(_GetAllStudents_QNAME, GetAllStudents.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AddStudentResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://soap.kmv/", name = "addStudentResponse")
    public JAXBElement<AddStudentResponse> createAddStudentResponse(AddStudentResponse value) {
        return new JAXBElement<AddStudentResponse>(_AddStudentResponse_QNAME, AddStudentResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetStudentAtIndex }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://soap.kmv/", name = "getStudentAtIndex")
    public JAXBElement<GetStudentAtIndex> createGetStudentAtIndex(GetStudentAtIndex value) {
        return new JAXBElement<GetStudentAtIndex>(_GetStudentAtIndex_QNAME, GetStudentAtIndex.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SaveChanges }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://soap.kmv/", name = "saveChanges")
    public JAXBElement<SaveChanges> createSaveChanges(SaveChanges value) {
        return new JAXBElement<SaveChanges>(_SaveChanges_QNAME, SaveChanges.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FindStudentsResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://soap.kmv/", name = "findStudentsResponse")
    public JAXBElement<FindStudentsResponse> createFindStudentsResponse(FindStudentsResponse value) {
        return new JAXBElement<FindStudentsResponse>(_FindStudentsResponse_QNAME, FindStudentsResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetStudentCountResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://soap.kmv/", name = "getStudentCountResponse")
    public JAXBElement<GetStudentCountResponse> createGetStudentCountResponse(GetStudentCountResponse value) {
        return new JAXBElement<GetStudentCountResponse>(_GetStudentCountResponse_QNAME, GetStudentCountResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RemoveStudent }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://soap.kmv/", name = "removeStudent")
    public JAXBElement<RemoveStudent> createRemoveStudent(RemoveStudent value) {
        return new JAXBElement<RemoveStudent>(_RemoveStudent_QNAME, RemoveStudent.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SaveChangesResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://soap.kmv/", name = "saveChangesResponse")
    public JAXBElement<SaveChangesResponse> createSaveChangesResponse(SaveChangesResponse value) {
        return new JAXBElement<SaveChangesResponse>(_SaveChangesResponse_QNAME, SaveChangesResponse.class, null, value);
    }

}
