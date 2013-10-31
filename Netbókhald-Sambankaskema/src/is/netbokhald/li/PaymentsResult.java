
package is.netbokhald.li;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * S?nir ni?urstš?ur afgrei?slu ‡ grei?slubunka
 * 
 * <p>Java class for PaymentsResult complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PaymentsResult">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ID" type="{http://IcelandicOnlineBanking/2005/12/01/CommonTypes}OperationID"/>
 *         &lt;element name="Status" type="{http://IcelandicOnlineBanking/2005/12/01/PaymentTypes}BatchStatus"/>
 *         &lt;element name="Success" type="{http://IcelandicOnlineBanking/2005/12/01/PaymentTypes}PaymentResultDetails" maxOccurs="500" minOccurs="0"/>
 *         &lt;element name="Errors" type="{http://IcelandicOnlineBanking/2005/12/01/PaymentTypes}PaymentError" maxOccurs="500" minOccurs="0"/>
 *         &lt;element name="DateOfPayment" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PaymentsResult", namespace = "http://IcelandicOnlineBanking/2005/12/01/PaymentTypes", propOrder = {
    "id",
    "status",
    "success",
    "errors",
    "dateOfPayment"
})
public class PaymentsResult {

    @XmlElement(name = "ID", required = true)
    protected String id;
    @XmlElement(name = "Status", required = true)
    protected BatchStatus status;
    @XmlElement(name = "Success")
    protected List<PaymentResultDetails> success;
    @XmlElement(name = "Errors")
    protected List<PaymentError> errors;
    @XmlElement(name = "DateOfPayment")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar dateOfPayment;

    /**
     * Gets the value of the id property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getID() {
        return id;
    }

    /**
     * Sets the value of the id property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setID(String value) {
        this.id = value;
    }

    /**
     * Gets the value of the status property.
     * 
     * @return
     *     possible object is
     *     {@link BatchStatus }
     *     
     */
    public BatchStatus getStatus() {
        return status;
    }

    /**
     * Sets the value of the status property.
     * 
     * @param value
     *     allowed object is
     *     {@link BatchStatus }
     *     
     */
    public void setStatus(BatchStatus value) {
        this.status = value;
    }

    /**
     * Gets the value of the success property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the success property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSuccess().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PaymentResultDetails }
     * 
     * 
     */
    public List<PaymentResultDetails> getSuccess() {
        if (success == null) {
            success = new ArrayList<PaymentResultDetails>();
        }
        return this.success;
    }

    /**
     * Gets the value of the errors property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the errors property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getErrors().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PaymentError }
     * 
     * 
     */
    public List<PaymentError> getErrors() {
        if (errors == null) {
            errors = new ArrayList<PaymentError>();
        }
        return this.errors;
    }

    /**
     * Gets the value of the dateOfPayment property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDateOfPayment() {
        return dateOfPayment;
    }

    /**
     * Sets the value of the dateOfPayment property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDateOfPayment(XMLGregorianCalendar value) {
        this.dateOfPayment = value;
    }

}
