
package is.netbokhald.li;

import java.math.BigDecimal;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * N‡nari uppl?singar um grei?sluse?il eftir a? grei?sluse?ill hefur veri? greiddur. Gefur uppl?singar um greidda dr‡ttarvexti, vanskilagjšld og fleira
 * 
 * <p>Java class for PaymentSlipInfo complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PaymentSlipInfo">
 *   &lt;complexContent>
 *     &lt;extension base="{http://IcelandicOnlineBanking/2005/12/01/PaymentTypes}PaymentSlip">
 *       &lt;sequence>
 *         &lt;element name="AmountDue" type="{http://IcelandicOnlineBanking/2005/12/01/CommonTypes}Amount"/>
 *         &lt;element name="DefaultCosts" type="{http://IcelandicOnlineBanking/2005/12/01/CommonTypes}Amount"/>
 *         &lt;element name="OtherCosts" type="{http://IcelandicOnlineBanking/2005/12/01/CommonTypes}Amount"/>
 *         &lt;element name="OtherDefaultCosts" type="{http://IcelandicOnlineBanking/2005/12/01/CommonTypes}Amount"/>
 *         &lt;element name="DefaultInterest" type="{http://IcelandicOnlineBanking/2005/12/01/CommonTypes}Amount"/>
 *         &lt;element name="NoticeAndPaymentFee" type="{http://IcelandicOnlineBanking/2005/12/01/CommonTypes}Amount"/>
 *         &lt;element name="Discount" type="{http://IcelandicOnlineBanking/2005/12/01/CommonTypes}Amount"/>
 *         &lt;element name="CategoryCode" type="{http://IcelandicOnlineBanking/2005/12/01/CommonTypes}CategoryCode" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PaymentSlipInfo", namespace = "http://IcelandicOnlineBanking/2005/12/01/PaymentTypes", propOrder = {
    "amountDue",
    "defaultCosts",
    "otherCosts",
    "otherDefaultCosts",
    "defaultInterest",
    "noticeAndPaymentFee",
    "discount",
    "categoryCode"
})
public class PaymentSlipInfo
    extends PaymentSlip
{

    @XmlElement(name = "AmountDue", required = true)
    protected BigDecimal amountDue;
    @XmlElement(name = "DefaultCosts", required = true)
    protected BigDecimal defaultCosts;
    @XmlElement(name = "OtherCosts", required = true)
    protected BigDecimal otherCosts;
    @XmlElement(name = "OtherDefaultCosts", required = true)
    protected BigDecimal otherDefaultCosts;
    @XmlElement(name = "DefaultInterest", required = true)
    protected BigDecimal defaultInterest;
    @XmlElement(name = "NoticeAndPaymentFee", required = true)
    protected BigDecimal noticeAndPaymentFee;
    @XmlElement(name = "Discount", required = true)
    protected BigDecimal discount;
    @XmlElement(name = "CategoryCode")
    protected String categoryCode;

    /**
     * Gets the value of the amountDue property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getAmountDue() {
        return amountDue;
    }

    /**
     * Sets the value of the amountDue property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setAmountDue(BigDecimal value) {
        this.amountDue = value;
    }

    /**
     * Gets the value of the defaultCosts property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getDefaultCosts() {
        return defaultCosts;
    }

    /**
     * Sets the value of the defaultCosts property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setDefaultCosts(BigDecimal value) {
        this.defaultCosts = value;
    }

    /**
     * Gets the value of the otherCosts property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getOtherCosts() {
        return otherCosts;
    }

    /**
     * Sets the value of the otherCosts property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setOtherCosts(BigDecimal value) {
        this.otherCosts = value;
    }

    /**
     * Gets the value of the otherDefaultCosts property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getOtherDefaultCosts() {
        return otherDefaultCosts;
    }

    /**
     * Sets the value of the otherDefaultCosts property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setOtherDefaultCosts(BigDecimal value) {
        this.otherDefaultCosts = value;
    }

    /**
     * Gets the value of the defaultInterest property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getDefaultInterest() {
        return defaultInterest;
    }

    /**
     * Sets the value of the defaultInterest property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setDefaultInterest(BigDecimal value) {
        this.defaultInterest = value;
    }

    /**
     * Gets the value of the noticeAndPaymentFee property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getNoticeAndPaymentFee() {
        return noticeAndPaymentFee;
    }

    /**
     * Sets the value of the noticeAndPaymentFee property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setNoticeAndPaymentFee(BigDecimal value) {
        this.noticeAndPaymentFee = value;
    }

    /**
     * Gets the value of the discount property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getDiscount() {
        return discount;
    }

    /**
     * Sets the value of the discount property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setDiscount(BigDecimal value) {
        this.discount = value;
    }

    /**
     * Gets the value of the categoryCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCategoryCode() {
        return categoryCode;
    }

    /**
     * Sets the value of the categoryCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCategoryCode(String value) {
        this.categoryCode = value;
    }

}
