package kmv.thrift;

import kmv.soap.SearchStudentTerms;
import kmv.soap.StudentModel;

import java.util.ArrayList;
import java.util.List;

public class StudentUtils {

    public static StudentModel createStudentModel(List<String> fieldList){
        StudentModel studentModel = new StudentModel();
        for (int i = 0; i < fieldList.size(); i++) {
            setFieldByIndex(studentModel, i, fieldList.get(i));
        }
        return studentModel;
    }

    public static SearchStudentTerms createSearchStudentTerms(List<String> fieldList,
                                                              List<Boolean> fieldFlagList){
        SearchStudentTerms searchStudentTerms = null;
        for (int i = 0; i < fieldList.size(); i++) {
            setFieldByIndex(searchStudentTerms, i, fieldList.get(i));
        }

        for (int i = 0; i < fieldFlagList.size(); i++) {
            setFieldFlagByIndex(searchStudentTerms, i, fieldFlagList.get(i).booleanValue());
        }

        return searchStudentTerms;
    }

    public static List<String> getFieldList(StudentModel studentModel){
        List<String> fieldList = new ArrayList<>();

        for (int i = 0; i < 8; i++) {
            fieldList.add(getFieldByIndex(studentModel, i));
        }
        return fieldList;
    }

    public static List<Boolean> getFieldFlagList(SearchStudentTerms studentTerms){
        List<Boolean> fieldList = new ArrayList<>();

        for (int i = 0; i < 8; i++) {
            fieldList.add(getFieldFlagByIndex(studentTerms, i));
        }
        return fieldList;
    }

    public static String getFieldByIndex(StudentModel studentModel, int index){
        switch (index){
            case 0:
                return studentModel.getFirstName();
            case 1:
                return studentModel.getSecondName();
            case 2:
                return studentModel.getThirdName();
            case 3:
                return null;
            case 4:
                return studentModel.getFootballTeamName();
            case 5:
                return studentModel.getFacultyName();
            case 6:
                return Integer.toString(studentModel.getSquad());
            case 7:
                return Integer.toString(studentModel.getPosition());
            default:
                return null;
        }
    }

    public static Boolean getFieldFlagByIndex(SearchStudentTerms studentTerms, int index){
        switch (index){
            case 0:
                return studentTerms.isFirstNameFlag();
            case 1:
                return studentTerms.isSecondNameFlag();
            case 2:
                return studentTerms.isThirdNameFlag();
            case 3:
                return null;
            case 4:
                return studentTerms.isFootballTeamNameFlag();
            case 5:
                return studentTerms.isFacultyNameFlag();
            case 6:
                return studentTerms.isSquadFlag();
            case 7:
                return studentTerms.isPositionFlag();
            default:
                return null;
        }
    }

    public static void setFieldByIndex(StudentModel studentModel, int index, String value) {
        switch (index){
            case 0:
                studentModel.setFirstName(value);
                break;
            case 1:
                studentModel.setSecondName(value);
                break;
            case 2:
                studentModel.setThirdName(value);
                break;
            case 3:
                studentModel.setDateBirth(null);
                break;
            case 4:
                studentModel.setFootballTeamName(value);
                break;
            case 5:
                studentModel.setFacultyName(value);
                break;
            case 6:
                studentModel.setSquad(Integer.parseInt(value));
                break;
            case 7:
                studentModel.setPosition(Integer.parseInt(value));
                break;
            default:
                break;
        }
    }

    public static void setFieldFlagByIndex(SearchStudentTerms searchStudentTerms, int index, boolean value) {
        switch (index){
            case 0:
                searchStudentTerms.setFirstNameFlag(value);;
                break;
            case 1:
                searchStudentTerms.setSecondNameFlag(value);
                break;
            case 2:
                searchStudentTerms.setThirdNameFlag(value);
                break;
            case 3:
                searchStudentTerms.setDateBirthFlag(false);
                break;
            case 4:
                searchStudentTerms.setFootballTeamNameFlag(value);
                break;
            case 5:
                searchStudentTerms.setFacultyNameFlag(value);
                break;
            case 6:
                searchStudentTerms.setSquadFlag(value);
                break;
            case 7:
                searchStudentTerms.setPositionFlag(value);
                break;
            default:
                break;
        }
    }
}
