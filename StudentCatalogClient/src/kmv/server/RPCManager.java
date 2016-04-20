package kmv.server;

import kmv.soap.SearchStudentTerms;
import kmv.soap.StudentModel;
import kmv.thrift.StudentUtils;
import kmv.thrift.ThriftWebServer;
import org.apache.thrift.TException;
import org.apache.thrift.meta_data.StructMetaData;
import org.apache.thrift.protocol.TBinaryProtocol;
import org.apache.thrift.protocol.TProtocol;
import org.apache.thrift.transport.TSocket;
import org.apache.thrift.transport.TTransport;
import org.apache.thrift.transport.TTransportException;

import java.util.List;

public class RPCManager implements ServerManager {
    private ThriftWebServer.Client thriftClient;

    public RPCManager(){
        try {
            TTransport transport;
            transport = new TSocket("localhost", 7003);
            transport.open();
            TProtocol protocol = new TBinaryProtocol(transport);
            thriftClient = new ThriftWebServer.Client(protocol);
        } catch (TTransportException e) {
            e.printStackTrace();
        }
    }
    @Override
    public void addStudent(StudentModel studentModel){
        try {
            thriftClient.addStudent(StudentUtils.getFieldList(studentModel));
        } catch (TException e) {
            e.printStackTrace();
        }
    }

    @Override
    public void removeStudent(StudentModel studentModel) {
        try {
            thriftClient.removeStudent(StudentUtils.getFieldList(studentModel));
        } catch (TException e) {
            e.printStackTrace();
        }
    }

    @Override
    public boolean updateStudent(SearchStudentTerms studentTerms) {
        try {
            return thriftClient.updateStudent(StudentUtils.getFieldList(studentTerms),
                    StudentUtils.getFieldFlagList(studentTerms));
        } catch (TException e) {
            e.printStackTrace();
            return false;
        }
    }

    @Override
    public List<StudentModel> findStudents(SearchStudentTerms studentTerms) {
        try {
            thriftClient.findStudents(StudentUtils.getFieldList(studentTerms),
                    StudentUtils.getFieldFlagList(studentTerms));
        } catch (TException e) {
            e.printStackTrace();
        }
        return null;
    }

    @Override
    public void findRemoveStudents(SearchStudentTerms studentTerms) {
        try {
            thriftClient.findRemoveStudents(StudentUtils.getFieldList(studentTerms),
                    StudentUtils.getFieldFlagList(studentTerms));
        } catch (TException e) {
            e.printStackTrace();
        }
    }

    @Override
    public int getStudentCount() {
        try {
            return thriftClient.getStudentCount();
        } catch (TException e) {
            e.printStackTrace();
            return 0;
        }
    }

    @Override
    public StudentModel getStudentAtIndex(int index) {
        try {
            return StudentUtils.createStudentModel(thriftClient.getStudentAtIndex(index));
        } catch (TException e) {
            e.printStackTrace();
            return null;
        }
    }

    @Override
    public void saveChanges() {
        try {
            thriftClient.saveChanges();
        } catch (TException e) {
            e.printStackTrace();
        }
    }
}
