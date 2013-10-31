
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
 *         &lt;element name="paymentsResult" type="{http://IcelandicOnlineBanking/2005/12/01/PaymentTypes}PaymentsResult"/>
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
    "paymentsResult"
})
@XmlRootElement(name = "GetPaymentsResultResponse", namespace = "http://IcelandicOnlineBanking/2005/12/01/Payments")
public class GetPaymentsResultResponse {

    @XmlElement(namespace = "http://IcelandicOnlineBanking/2005/12/01/Payments", required = true)
    protected PaymentsResult paymentsResult;

    /**
     * Gets the value of the paymentsResult property.
     * 
     * @return
     *     possible object is
     *     {@link PaymentsResult }
     *     
     */
    public PaymentsResult getPaymentsResult() {
        return paymentsResult;
    }

    /**
     * Sets the value of the paymentsResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link PaymentsResult }
     *     
     */
    public void setPaymentsResult(PaymentsResult value) {
        this.paymentsResult = value;
    }

}
