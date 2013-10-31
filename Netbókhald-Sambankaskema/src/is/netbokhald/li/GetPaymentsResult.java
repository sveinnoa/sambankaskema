
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
 *         &lt;element name="paymentID" type="{http://IcelandicOnlineBanking/2005/12/01/CommonTypes}OperationID"/>
 *         &lt;element name="filter" type="{http://IcelandicOnlineBanking/2005/12/01/PaymentTypes}PaymentsStatus"/>
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
    "paymentID",
    "filter"
})
@XmlRootElement(name = "GetPaymentsResult", namespace = "http://IcelandicOnlineBanking/2005/12/01/Payments")
public class GetPaymentsResult {

    @XmlElement(namespace = "http://IcelandicOnlineBanking/2005/12/01/Payments", required = true)
    protected String paymentID;
    @XmlElement(namespace = "http://IcelandicOnlineBanking/2005/12/01/Payments", required = true)
    protected PaymentsStatus filter;

    /**
     * Gets the value of the paymentID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPaymentID() {
        return paymentID;
    }

    /**
     * Sets the value of the paymentID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPaymentID(String value) {
        this.paymentID = value;
    }

    /**
     * Gets the value of the filter property.
     * 
     * @return
     *     possible object is
     *     {@link PaymentsStatus }
     *     
     */
    public PaymentsStatus getFilter() {
        return filter;
    }

    /**
     * Sets the value of the filter property.
     * 
     * @param value
     *     allowed object is
     *     {@link PaymentsStatus }
     *     
     */
    public void setFilter(PaymentsStatus value) {
        this.filter = value;
    }

}
