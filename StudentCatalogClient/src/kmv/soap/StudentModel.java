
package kmv.soap;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for studentModel complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="studentModel">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="dateBirth" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="facultyName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="firstName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="footballTeamName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="position" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="secondName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="squad" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="thirdName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "studentModel", propOrder = {
    "dateBirth",
    "facultyName",
    "firstName",
    "footballTeamName",
    "position",
    "secondName",
    "squad",
    "thirdName"
})
@XmlSeeAlso({
    SearchStudentTerms.class
})
public class StudentModel {

    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar dateBirth;
    protected String facultyName;
    protected String firstName;
    protected String footballTeamName;
    protected int position;
    protected String secondName;
    protected int squad;
    protected String thirdName;

    /**
     * Gets the value of the dateBirth property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDateBirth() {
        return dateBirth;
    }

    /**
     * Sets the value of the dateBirth property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDateBirth(XMLGregorianCalendar value) {
        this.dateBirth = value;
    }

    /**
     * Gets the value of the facultyName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFacultyName() {
        return facultyName;
    }

    /**
     * Sets the value of the facultyName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFacultyName(String value) {
        this.facultyName = value;
    }

    /**
     * Gets the value of the firstName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFirstName() {
        return firstName;
    }

    /**
     * Sets the value of the firstName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFirstName(String value) {
        this.firstName = value;
    }

    /**
     * Gets the value of the footballTeamName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFootballTeamName() {
        return footballTeamName;
    }

    /**
     * Sets the value of the footballTeamName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFootballTeamName(String value) {
        this.footballTeamName = value;
    }

    /**
     * Gets the value of the position property.
     * 
     */
    public int getPosition() {
        return position;
    }

    /**
     * Sets the value of the position property.
     * 
     */
    public void setPosition(int value) {
        this.position = value;
    }

    /**
     * Gets the value of the secondName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSecondName() {
        return secondName;
    }

    /**
     * Sets the value of the secondName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSecondName(String value) {
        this.secondName = value;
    }

    /**
     * Gets the value of the squad property.
     * 
     */
    public int getSquad() {
        return squad;
    }

    /**
     * Sets the value of the squad property.
     * 
     */
    public void setSquad(int value) {
        this.squad = value;
    }

    /**
     * Gets the value of the thirdName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getThirdName() {
        return thirdName;
    }

    /**
     * Sets the value of the thirdName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setThirdName(String value) {
        this.thirdName = value;
    }

}
