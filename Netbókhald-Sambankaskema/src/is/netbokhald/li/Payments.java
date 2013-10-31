
package is.netbokhald.li;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * Represents one or more payments to be processed.
 * 
 * <p>Java class for Payments complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Payments">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Out" type="{http://IcelandicOnlineBanking/2005/12/01/PaymentTypes}PaymentOut"/>
 *         &lt;element name="In" type="{http://IcelandicOnlineBanking/2005/12/01/PaymentTypes}PaymentIn" maxOccurs="500"/>
 *         &lt;element name="DateOfForwardPayment" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
 *         &lt;element name="NameOfBatch" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="50"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *       &lt;/sequence>
 *       &lt;attribute name="RollbackOnError" use="required" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *       &lt;attribute name="IsOneToMany" use="required" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Payments", namespace = "http://IcelandicOnlineBanking/2005/12/01/PaymentTypes", propOrder = {
    "out",
    "in",
    "dateOfForwardPayment",
    "nameOfBatch"
})
public class Payments {

    @XmlElement(name = "Out", required = true)
    protected PaymentOut out;
    @XmlElement(name = "In", required = true)
    protected List<PaymentIn> in;
    @XmlElement(name = "DateOfForwardPayment")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar dateOfForwardPayment;
    @XmlElement(name = "NameOfBatch")
    protected String nameOfBatch;
    @XmlAttribute(name = "RollbackOnError", required = true)
    protected boolean rollbackOnError;
    @XmlAttribute(name = "IsOneToMany", required = true)
    protected boolean isOneToMany;

    /**
     * Gets the value of the out property.
     * 
     * @return
     *     possible object is
     *     {@link PaymentOut }
     *     
     */
    public PaymentOut getOut() {
        return out;
    }

    /**
     * Sets the value of the out property.
     * 
     * @param value
     *     allowed object is
     *     {@link PaymentOut }
     *     
     */
    public void setOut(PaymentOut value) {
        this.out = value;
    }

    /**
     * Gets the value of the in property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the in property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getIn().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PaymentIn }
     * 
     * 
     */
    public List<PaymentIn> getIn() {
        if (in == null) {
            in = new ArrayList<PaymentIn>();
        }
        return this.in;
    }

    /**
     * Gets the value of the dateOfForwardPayment property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDateOfForwardPayment() {
        return dateOfForwardPayment;
    }

    /**
     * Sets the value of the dateOfForwardPayment property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDateOfForwardPayment(XMLGregorianCalendar value) {
        this.dateOfForwardPayment = value;
    }

    /**
     * Gets the value of the nameOfBatch property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNameOfBatch() {
        return nameOfBatch;
    }

    /**
     * Sets the value of the nameOfBatch property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNameOfBatch(String value) {
        this.nameOfBatch = value;
    }

    /**
     * Gets the value of the rollbackOnError property.
     * 
     */
    public boolean isRollbackOnError() {
        return rollbackOnError;
    }

    /**
     * Sets the value of the rollbackOnError property.
     * 
     */
    public void setRollbackOnError(boolean value) {
        this.rollbackOnError = value;
    }

    /**
     * Gets the value of the isOneToMany property.
     * 
     */
    public boolean isIsOneToMany() {
        return isOneToMany;
    }

    /**
     * Sets the value of the isOneToMany property.
     * 
     */
    public void setIsOneToMany(boolean value) {
        this.isOneToMany = value;
    }

}
