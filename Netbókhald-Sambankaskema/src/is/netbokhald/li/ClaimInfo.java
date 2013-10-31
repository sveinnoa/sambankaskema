
package is.netbokhald.li;

import java.math.BigDecimal;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * Uppl?singar um stš?u innheimtukršfu.
 * 
 * <p>Java class for ClaimInfo complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ClaimInfo">
 *   &lt;complexContent>
 *     &lt;extension base="{http://IcelandicOnlineBanking/2005/12/01/ClaimTypes}Claim">
 *       &lt;sequence>
 *         &lt;element name="Status" type="{http://IcelandicOnlineBanking/2005/12/01/ClaimTypes}ClaimStatus"/>
 *         &lt;element name="CategoryCode" type="{http://IcelandicOnlineBanking/2005/12/01/CommonTypes}CategoryCode" minOccurs="0"/>
 *         &lt;element name="TotalAmountDue" type="{http://IcelandicOnlineBanking/2005/12/01/CommonTypes}Amount"/>
 *         &lt;element name="NoticeChargeAmount" type="{http://IcelandicOnlineBanking/2005/12/01/CommonTypes}Amount" minOccurs="0"/>
 *         &lt;element name="DefaultChargeAmount" type="{http://IcelandicOnlineBanking/2005/12/01/CommonTypes}Amount" minOccurs="0"/>
 *         &lt;element name="OtherCostsAmount" type="{http://IcelandicOnlineBanking/2005/12/01/CommonTypes}Amount" minOccurs="0"/>
 *         &lt;element name="OtherDefaultCostsAmount" type="{http://IcelandicOnlineBanking/2005/12/01/CommonTypes}Amount" minOccurs="0"/>
 *         &lt;element name="DefaultInterestAmount" type="{http://IcelandicOnlineBanking/2005/12/01/CommonTypes}Amount" minOccurs="0"/>
 *         &lt;element name="DiscountAmount" type="{http://IcelandicOnlineBanking/2005/12/01/CommonTypes}Amount" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ClaimInfo", propOrder = {
    "status",
    "categoryCode",
    "totalAmountDue",
    "noticeChargeAmount",
    "defaultChargeAmount",
    "otherCostsAmount",
    "otherDefaultCostsAmount",
    "defaultInterestAmount",
    "discountAmount"
})
public class ClaimInfo
    extends Claim
{

    @XmlElement(name = "Status", required = true)
    protected ClaimStatus status;
    @XmlElement(name = "CategoryCode")
    protected String categoryCode;
    @XmlElement(name = "TotalAmountDue", required = true)
    protected BigDecimal totalAmountDue;
    @XmlElement(name = "NoticeChargeAmount")
    protected BigDecimal noticeChargeAmount;
    @XmlElement(name = "DefaultChargeAmount")
    protected BigDecimal defaultChargeAmount;
    @XmlElement(name = "OtherCostsAmount")
    protected BigDecimal otherCostsAmount;
    @XmlElement(name = "OtherDefaultCostsAmount")
    protected BigDecimal otherDefaultCostsAmount;
    @XmlElement(name = "DefaultInterestAmount")
    protected BigDecimal defaultInterestAmount;
    @XmlElement(name = "DiscountAmount")
    protected BigDecimal discountAmount;

    /**
     * Gets the value of the status property.
     * 
     * @return
     *     possible object is
     *     {@link ClaimStatus }
     *     
     */
    public ClaimStatus getStatus() {
        return status;
    }

    /**
     * Sets the value of the status property.
     * 
     * @param value
     *     allowed object is
     *     {@link ClaimStatus }
     *     
     */
    public void setStatus(ClaimStatus value) {
        this.status = value;
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

    /**
     * Gets the value of the totalAmountDue property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getTotalAmountDue() {
        return totalAmountDue;
    }

    /**
     * Sets the value of the totalAmountDue property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setTotalAmountDue(BigDecimal value) {
        this.totalAmountDue = value;
    }

    /**
     * Gets the value of the noticeChargeAmount property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getNoticeChargeAmount() {
        return noticeChargeAmount;
    }

    /**
     * Sets the value of the noticeChargeAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setNoticeChargeAmount(BigDecimal value) {
        this.noticeChargeAmount = value;
    }

    /**
     * Gets the value of the defaultChargeAmount property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getDefaultChargeAmount() {
        return defaultChargeAmount;
    }

    /**
     * Sets the value of the defaultChargeAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setDefaultChargeAmount(BigDecimal value) {
        this.defaultChargeAmount = value;
    }

    /**
     * Gets the value of the otherCostsAmount property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getOtherCostsAmount() {
        return otherCostsAmount;
    }

    /**
     * Sets the value of the otherCostsAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setOtherCostsAmount(BigDecimal value) {
        this.otherCostsAmount = value;
    }

    /**
     * Gets the value of the otherDefaultCostsAmount property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getOtherDefaultCostsAmount() {
        return otherDefaultCostsAmount;
    }

    /**
     * Sets the value of the otherDefaultCostsAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setOtherDefaultCostsAmount(BigDecimal value) {
        this.otherDefaultCostsAmount = value;
    }

    /**
     * Gets the value of the defaultInterestAmount property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getDefaultInterestAmount() {
        return defaultInterestAmount;
    }

    /**
     * Sets the value of the defaultInterestAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setDefaultInterestAmount(BigDecimal value) {
        this.defaultInterestAmount = value;
    }

    /**
     * Gets the value of the discountAmount property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getDiscountAmount() {
        return discountAmount;
    }

    /**
     * Sets the value of the discountAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setDiscountAmount(BigDecimal value) {
        this.discountAmount = value;
    }

}
