
package is.netbokhald.li;

import java.math.BigDecimal;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * Uppl?singar um grei?slu sem hefur veri? framkv¾md
 * 
 * <p>Java class for PaymentResultDetails complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PaymentResultDetails">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;choice>
 *           &lt;element name="ABGiro" type="{http://IcelandicOnlineBanking/2005/12/01/PaymentTypes}ABGiro"/>
 *           &lt;element name="CGiro" type="{http://IcelandicOnlineBanking/2005/12/01/PaymentTypes}CGiro"/>
 *           &lt;element name="PaymentSlip" type="{http://IcelandicOnlineBanking/2005/12/01/PaymentTypes}PaymentSlipInfo"/>
 *           &lt;element name="Transfer" type="{http://IcelandicOnlineBanking/2005/12/01/PaymentTypes}Transfer"/>
 *         &lt;/choice>
 *         &lt;element name="Amount" type="{http://IcelandicOnlineBanking/2005/12/01/CommonTypes}Amount"/>
 *         &lt;element name="Receipt" type="{http://IcelandicOnlineBanking/2005/12/01/PaymentTypes}Communication" minOccurs="0"/>
 *         &lt;element name="Description" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="35"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="BookingID" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;minLength value="1"/>
 *               &lt;maxLength value="50"/>
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
@XmlType(name = "PaymentResultDetails", namespace = "http://IcelandicOnlineBanking/2005/12/01/PaymentTypes", propOrder = {
    "abGiro",
    "cGiro",
    "paymentSlip",
    "transfer",
    "amount",
    "receipt",
    "description",
    "bookingID"
})
public class PaymentResultDetails {

    @XmlElement(name = "ABGiro")
    protected ABGiro abGiro;
    @XmlElement(name = "CGiro")
    protected CGiro cGiro;
    @XmlElement(name = "PaymentSlip")
    protected PaymentSlipInfo paymentSlip;
    @XmlElement(name = "Transfer")
    protected Transfer transfer;
    @XmlElement(name = "Amount", required = true)
    protected BigDecimal amount;
    @XmlElement(name = "Receipt")
    protected Communication receipt;
    @XmlElement(name = "Description")
    protected String description;
    @XmlElement(name = "BookingID")
    protected String bookingID;

    /**
     * Gets the value of the abGiro property.
     * 
     * @return
     *     possible object is
     *     {@link ABGiro }
     *     
     */
    public ABGiro getABGiro() {
        return abGiro;
    }

    /**
     * Sets the value of the abGiro property.
     * 
     * @param value
     *     allowed object is
     *     {@link ABGiro }
     *     
     */
    public void setABGiro(ABGiro value) {
        this.abGiro = value;
    }

    /**
     * Gets the value of the cGiro property.
     * 
     * @return
     *     possible object is
     *     {@link CGiro }
     *     
     */
    public CGiro getCGiro() {
        return cGiro;
    }

    /**
     * Sets the value of the cGiro property.
     * 
     * @param value
     *     allowed object is
     *     {@link CGiro }
     *     
     */
    public void setCGiro(CGiro value) {
        this.cGiro = value;
    }

    /**
     * Gets the value of the paymentSlip property.
     * 
     * @return
     *     possible object is
     *     {@link PaymentSlipInfo }
     *     
     */
    public PaymentSlipInfo getPaymentSlip() {
        return paymentSlip;
    }

    /**
     * Sets the value of the paymentSlip property.
     * 
     * @param value
     *     allowed object is
     *     {@link PaymentSlipInfo }
     *     
     */
    public void setPaymentSlip(PaymentSlipInfo value) {
        this.paymentSlip = value;
    }

    /**
     * Gets the value of the transfer property.
     * 
     * @return
     *     possible object is
     *     {@link Transfer }
     *     
     */
    public Transfer getTransfer() {
        return transfer;
    }

    /**
     * Sets the value of the transfer property.
     * 
     * @param value
     *     allowed object is
     *     {@link Transfer }
     *     
     */
    public void setTransfer(Transfer value) {
        this.transfer = value;
    }

    /**
     * Gets the value of the amount property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getAmount() {
        return amount;
    }

    /**
     * Sets the value of the amount property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setAmount(BigDecimal value) {
        this.amount = value;
    }

    /**
     * Gets the value of the receipt property.
     * 
     * @return
     *     possible object is
     *     {@link Communication }
     *     
     */
    public Communication getReceipt() {
        return receipt;
    }

    /**
     * Sets the value of the receipt property.
     * 
     * @param value
     *     allowed object is
     *     {@link Communication }
     *     
     */
    public void setReceipt(Communication value) {
        this.receipt = value;
    }

    /**
     * Gets the value of the description property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDescription() {
        return description;
    }

    /**
     * Sets the value of the description property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDescription(String value) {
        this.description = value;
    }

    /**
     * Gets the value of the bookingID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBookingID() {
        return bookingID;
    }

    /**
     * Sets the value of the bookingID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBookingID(String value) {
        this.bookingID = value;
    }

}
