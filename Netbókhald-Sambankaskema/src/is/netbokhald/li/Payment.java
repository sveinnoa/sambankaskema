
package is.netbokhald.li;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * Stšk grei?sla
 * 
 * <p>Java class for Payment complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Payment">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Out" type="{http://IcelandicOnlineBanking/2005/12/01/PaymentTypes}PaymentOut"/>
 *         &lt;element name="In" type="{http://IcelandicOnlineBanking/2005/12/01/PaymentTypes}PaymentIn"/>
 *         &lt;element name="DateOfForwardPayment" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Payment", namespace = "http://IcelandicOnlineBanking/2005/12/01/PaymentTypes", propOrder = {
    "out",
    "in",
    "dateOfForwardPayment"
})
public class Payment {

    @XmlElement(name = "Out", required = true)
    protected PaymentOut out;
    @XmlElement(name = "In", required = true)
    protected PaymentIn in;
    @XmlElement(name = "DateOfForwardPayment")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar dateOfForwardPayment;

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
     * @return
     *     possible object is
     *     {@link PaymentIn }
     *     
     */
    public PaymentIn getIn() {
        return in;
    }

    /**
     * Sets the value of the in property.
     * 
     * @param value
     *     allowed object is
     *     {@link PaymentIn }
     *     
     */
    public void setIn(PaymentIn value) {
        this.in = value;
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

}
