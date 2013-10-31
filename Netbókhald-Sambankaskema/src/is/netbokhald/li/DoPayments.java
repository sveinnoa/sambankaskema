
package is.netbokhald.li;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="payments" type="{http://IcelandicOnlineBanking/2005/12/01/PaymentTypes}Payments"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "payments"
})
@XmlRootElement(name = "DoPayments", namespace = "http://IcelandicOnlineBanking/2005/12/01/Payments")
public class DoPayments {

    @XmlElement(namespace = "http://IcelandicOnlineBanking/2005/12/01/Payments", required = true)
    protected Payments payments;

    /**
     * Gets the value of the payments property.
     * 
     * @return
     *     possible object is
     *     {@link Payments }
     *     
     */
    public Payments getPayments() {
        return payments;
    }

    /**
     * Sets the value of the payments property.
     * 
     * @param value
     *     allowed object is
     *     {@link Payments }
     *     
     */
    public void setPayments(Payments value) {
        this.payments = value;
    }

}
