
package is.netbokhald.li;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * Samsett sv¾?i fyrir gengiskršfu.
 * 
 * <p>Java class for CurrencyInformation complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CurrencyInformation">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ReferenceRate">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;enumeration value="ExchangeRate"/>
 *               &lt;enumeration value="NoteRate"/>
 *               &lt;enumeration value="CentralBankMidRate"/>
 *               &lt;enumeration value="CentralBankStatutoryRate"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="Currency" type="{http://IcelandicOnlineBanking/2005/12/01/CommonTypes}CurrencyCode"/>
 *         &lt;element name="PaymentRate">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;enumeration value="DueDateRate"/>
 *               &lt;enumeration value="PaymentDateRate"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CurrencyInformation", propOrder = {
    "referenceRate",
    "currency",
    "paymentRate"
})
public class CurrencyInformation {

    @XmlElement(name = "ReferenceRate", required = true)
    protected String referenceRate;
    @XmlElement(name = "Currency", required = true)
    protected String currency;
    @XmlElement(name = "PaymentRate", required = true)
    protected String paymentRate;

    /**
     * Gets the value of the referenceRate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getReferenceRate() {
        return referenceRate;
    }

    /**
     * Sets the value of the referenceRate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setReferenceRate(String value) {
        this.referenceRate = value;
    }

    /**
     * Gets the value of the currency property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCurrency() {
        return currency;
    }

    /**
     * Sets the value of the currency property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCurrency(String value) {
        this.currency = value;
    }

    /**
     * Gets the value of the paymentRate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPaymentRate() {
        return paymentRate;
    }

    /**
     * Sets the value of the paymentRate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPaymentRate(String value) {
        this.paymentRate = value;
    }

}
