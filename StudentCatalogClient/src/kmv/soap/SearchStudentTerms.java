
package kmv.soap;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for searchStudentTerms complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="searchStudentTerms">
 *   &lt;complexContent>
 *     &lt;extension base="{http://soap.kmv/}studentModel">
 *       &lt;sequence>
 *         &lt;element name="dateBirthFlag" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="facultyNameFlag" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="firstNameFlag" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="footballTeamNameFlag" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="positionFlag" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="secondNameFlag" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="squadFlag" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="thirdNameFlag" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "searchStudentTerms", propOrder = {
    "dateBirthFlag",
    "facultyNameFlag",
    "firstNameFlag",
    "footballTeamNameFlag",
    "positionFlag",
    "secondNameFlag",
    "squadFlag",
    "thirdNameFlag"
})
public class SearchStudentTerms
    extends StudentModel
{

    protected boolean dateBirthFlag;
    protected boolean facultyNameFlag;
    protected boolean firstNameFlag;
    protected boolean footballTeamNameFlag;
    protected boolean positionFlag;
    protected boolean secondNameFlag;
    protected boolean squadFlag;
    protected boolean thirdNameFlag;

    /**
     * Gets the value of the dateBirthFlag property.
     * 
     */
    public boolean isDateBirthFlag() {
        return dateBirthFlag;
    }

    /**
     * Sets the value of the dateBirthFlag property.
     * 
     */
    public void setDateBirthFlag(boolean value) {
        this.dateBirthFlag = value;
    }

    /**
     * Gets the value of the facultyNameFlag property.
     * 
     */
    public boolean isFacultyNameFlag() {
        return facultyNameFlag;
    }

    /**
     * Sets the value of the facultyNameFlag property.
     * 
     */
    public void setFacultyNameFlag(boolean value) {
        this.facultyNameFlag = value;
    }

    /**
     * Gets the value of the firstNameFlag property.
     * 
     */
    public boolean isFirstNameFlag() {
        return firstNameFlag;
    }

    /**
     * Sets the value of the firstNameFlag property.
     * 
     */
    public void setFirstNameFlag(boolean value) {
        this.firstNameFlag = value;
    }

    /**
     * Gets the value of the footballTeamNameFlag property.
     * 
     */
    public boolean isFootballTeamNameFlag() {
        return footballTeamNameFlag;
    }

    /**
     * Sets the value of the footballTeamNameFlag property.
     * 
     */
    public void setFootballTeamNameFlag(boolean value) {
        this.footballTeamNameFlag = value;
    }

    /**
     * Gets the value of the positionFlag property.
     * 
     */
    public boolean isPositionFlag() {
        return positionFlag;
    }

    /**
     * Sets the value of the positionFlag property.
     * 
     */
    public void setPositionFlag(boolean value) {
        this.positionFlag = value;
    }

    /**
     * Gets the value of the secondNameFlag property.
     * 
     */
    public boolean isSecondNameFlag() {
        return secondNameFlag;
    }

    /**
     * Sets the value of the secondNameFlag property.
     * 
     */
    public void setSecondNameFlag(boolean value) {
        this.secondNameFlag = value;
    }

    /**
     * Gets the value of the squadFlag property.
     * 
     */
    public boolean isSquadFlag() {
        return squadFlag;
    }

    /**
     * Sets the value of the squadFlag property.
     * 
     */
    public void setSquadFlag(boolean value) {
        this.squadFlag = value;
    }

    /**
     * Gets the value of the thirdNameFlag property.
     * 
     */
    public boolean isThirdNameFlag() {
        return thirdNameFlag;
    }

    /**
     * Sets the value of the thirdNameFlag property.
     * 
     */
    public void setThirdNameFlag(boolean value) {
        this.thirdNameFlag = value;
    }

}
