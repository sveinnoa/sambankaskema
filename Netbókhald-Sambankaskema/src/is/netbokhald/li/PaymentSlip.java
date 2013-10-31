
package is.netbokhald.li;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * PaymentSlip er nota? til ?ess a? grei?a grei?sluse?la, s.s. innheimtukröfur (höfu?bók 62 og 66), skuldabréf (höfu?bók 74), víxla (höfu?bók 60 og 70)
 * 
 * <p>Java class for PaymentSlip complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PaymentSlip">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Account" type="{http://IcelandicOnlineBanking/2005/12/01/CommonTypes}AccountID"/>
 *         &lt;element name="PersonID" type="{http://IcelandicOnlineBanking/2005/12/01/CommonTypes}PersonID"/>
 *         &lt;element name="DueDate" type="{http://www.w3.org/2001/XMLSchema}date"/>
 *         &lt;element name="IsDeposit" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PaymentSlip", namespace = "http://IcelandicOnlineBanking/2005/12/01/PaymentTypes", propOrder = {
    "account",
    "personID",
    "dueDate",
    "isDeposit"
})
@XmlSeeAlso({
    PaymentSlipInfo.class
})
public class PaymentSlip {

    @XmlElement(name = "Account", required = true)
    protected String account;
    @XmlElement(name = "PersonID", required = true)
    protected String personID;
    @XmlElement(name = "DueDate", required = true)
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar dueDate;
    @XmlElement(name = "IsDeposit")
    protected boolean isDeposit;

    /**
     * Gets the value of the account property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAccount() {
        return account;
    }

    /**
     * Sets the value of the account property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAccount(String value) {
        this.account = value;
    }

    /**
     * Gets the value of the personID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPersonID() {
        return personID;
    }

    /**
     * Sets the value of the personID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPersonID(String value) {
        this.personID = value;
    }

    /**
     * Gets the value of the dueDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDueDate() {
        return dueDate;
    }

    /**
     * Sets the value of the dueDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDueDate(XMLGregorianCalendar value) {
        this.dueDate = value;
    }

    /**
     * Gets the value of the isDeposit property.
     * 
     */
    public boolean isIsDeposit() {
        return isDeposit;
    }

    /**
     * Sets the value of the isDeposit property.
     * 
     */
    public void setIsDeposit(boolean value) {
        this.isDeposit = value;
    }

}
