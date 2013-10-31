
package is.netbokhald.li;

import java.math.BigDecimal;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * Hjœpar innheimtukršfu, nota? vi? stofnun og breytingar.
 * 
 * <p>Java class for Claim complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Claim">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Key" type="{http://IcelandicOnlineBanking/2005/12/01/ClaimTypes}ClaimKey"/>
 *         &lt;element name="PayorID" type="{http://IcelandicOnlineBanking/2005/12/01/CommonTypes}PersonID"/>
 *         &lt;element name="CancellationDate" type="{http://www.w3.org/2001/XMLSchema}date"/>
 *         &lt;element name="Identifier" type="{http://IcelandicOnlineBanking/2005/12/01/ClaimTypes}Identifier"/>
 *         &lt;element name="Amount" type="{http://IcelandicOnlineBanking/2005/12/01/CommonTypes}Amount"/>
 *         &lt;element name="Reference" type="{http://IcelandicOnlineBanking/2005/12/01/ClaimTypes}Reference"/>
 *         &lt;element name="FinalDueDate" type="{http://www.w3.org/2001/XMLSchema}date"/>
 *         &lt;element name="BillNumber" type="{http://IcelandicOnlineBanking/2005/12/01/CommonTypes}BillNumber" minOccurs="0"/>
 *         &lt;element name="CustomerNumber" type="{http://IcelandicOnlineBanking/2005/12/01/ClaimTypes}CustomerNumber" minOccurs="0"/>
 *         &lt;element name="NoticeAndPaymentFee" type="{http://IcelandicOnlineBanking/2005/12/01/ClaimTypes}NoticeAndPaymentFee"/>
 *         &lt;element name="DefaultCharge" type="{http://IcelandicOnlineBanking/2005/12/01/ClaimTypes}DateRestrictedCharge"/>
 *         &lt;element name="OtherCosts" type="{http://IcelandicOnlineBanking/2005/12/01/CommonTypes}Amount"/>
 *         &lt;element name="OtherDefaultCosts" type="{http://IcelandicOnlineBanking/2005/12/01/CommonTypes}Amount"/>
 *         &lt;element name="DefaultInterest" type="{http://IcelandicOnlineBanking/2005/12/01/ClaimTypes}DefaultInterest"/>
 *         &lt;element name="CurrencyInformation" type="{http://IcelandicOnlineBanking/2005/12/01/ClaimTypes}CurrencyInformation" minOccurs="0"/>
 *         &lt;element name="PermitOutOfSequencePayment" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="Discount" type="{http://IcelandicOnlineBanking/2005/12/01/ClaimTypes}DiscountCharge"/>
 *         &lt;element name="IsPartialPaymentAllowed" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="BillPresentmentSystem" type="{http://IcelandicOnlineBanking/2005/12/01/ClaimTypes}BillPresentmentSystem" minOccurs="0"/>
 *         &lt;element name="Printing" type="{http://IcelandicOnlineBanking/2005/12/01/ClaimTypes}Printing" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Claim", propOrder = {
    "key",
    "payorID",
    "cancellationDate",
    "identifier",
    "amount",
    "reference",
    "finalDueDate",
    "billNumber",
    "customerNumber",
    "noticeAndPaymentFee",
    "defaultCharge",
    "otherCosts",
    "otherDefaultCosts",
    "defaultInterest",
    "currencyInformation",
    "permitOutOfSequencePayment",
    "discount",
    "isPartialPaymentAllowed",
    "billPresentmentSystem",
    "printing"
})
@XmlSeeAlso({
    ClaimInfo.class
})
public class Claim {

    @XmlElement(name = "Key", required = true)
    protected ClaimKey key;
    @XmlElement(name = "PayorID", required = true)
    protected String payorID;
    @XmlElement(name = "CancellationDate", required = true)
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar cancellationDate;
    @XmlElement(name = "Identifier", required = true)
    protected String identifier;
    @XmlElement(name = "Amount", required = true)
    protected BigDecimal amount;
    @XmlElement(name = "Reference", required = true)
    protected String reference;
    @XmlElement(name = "FinalDueDate", required = true)
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar finalDueDate;
    @XmlElement(name = "BillNumber")
    protected String billNumber;
    @XmlElement(name = "CustomerNumber")
    protected String customerNumber;
    @XmlElement(name = "NoticeAndPaymentFee", required = true)
    protected NoticeAndPaymentFee noticeAndPaymentFee;
    @XmlElement(name = "DefaultCharge", required = true)
    protected DateRestrictedCharge defaultCharge;
    @XmlElement(name = "OtherCosts", required = true)
    protected BigDecimal otherCosts;
    @XmlElement(name = "OtherDefaultCosts", required = true)
    protected BigDecimal otherDefaultCosts;
    @XmlElement(name = "DefaultInterest", required = true)
    protected DefaultInterest defaultInterest;
    @XmlElement(name = "CurrencyInformation")
    protected CurrencyInformation currencyInformation;
    @XmlElement(name = "PermitOutOfSequencePayment")
    protected boolean permitOutOfSequencePayment;
    @XmlElement(name = "Discount", required = true)
    protected DiscountCharge discount;
    @XmlElement(name = "IsPartialPaymentAllowed")
    protected boolean isPartialPaymentAllowed;
    @XmlElement(name = "BillPresentmentSystem")
    protected BillPresentmentSystem billPresentmentSystem;
    @XmlElement(name = "Printing")
    protected Printing printing;

    /**
     * Gets the value of the key property.
     * 
     * @return
     *     possible object is
     *     {@link ClaimKey }
     *     
     */
    public ClaimKey getKey() {
        return key;
    }

    /**
     * Sets the value of the key property.
     * 
     * @param value
     *     allowed object is
     *     {@link ClaimKey }
     *     
     */
    public void setKey(ClaimKey value) {
        this.key = value;
    }

    /**
     * Gets the value of the payorID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPayorID() {
        return payorID;
    }

    /**
     * Sets the value of the payorID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPayorID(String value) {
        this.payorID = value;
    }

    /**
     * Gets the value of the cancellationDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getCancellationDate() {
        return cancellationDate;
    }

    /**
     * Sets the value of the cancellationDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setCancellationDate(XMLGregorianCalendar value) {
        this.cancellationDate = value;
    }

    /**
     * Gets the value of the identifier property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIdentifier() {
        return identifier;
    }

    /**
     * Sets the value of the identifier property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIdentifier(String value) {
        this.identifier = value;
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
     * Gets the value of the reference property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getReference() {
        return reference;
    }

    /**
     * Sets the value of the reference property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setReference(String value) {
        this.reference = value;
    }

    /**
     * Gets the value of the finalDueDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getFinalDueDate() {
        return finalDueDate;
    }

    /**
     * Sets the value of the finalDueDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setFinalDueDate(XMLGregorianCalendar value) {
        this.finalDueDate = value;
    }

    /**
     * Gets the value of the billNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBillNumber() {
        return billNumber;
    }

    /**
     * Sets the value of the billNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBillNumber(String value) {
        this.billNumber = value;
    }

    /**
     * Gets the value of the customerNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCustomerNumber() {
        return customerNumber;
    }

    /**
     * Sets the value of the customerNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCustomerNumber(String value) {
        this.customerNumber = value;
    }

    /**
     * Gets the value of the noticeAndPaymentFee property.
     * 
     * @return
     *     possible object is
     *     {@link NoticeAndPaymentFee }
     *     
     */
    public NoticeAndPaymentFee getNoticeAndPaymentFee() {
        return noticeAndPaymentFee;
    }

    /**
     * Sets the value of the noticeAndPaymentFee property.
     * 
     * @param value
     *     allowed object is
     *     {@link NoticeAndPaymentFee }
     *     
     */
    public void setNoticeAndPaymentFee(NoticeAndPaymentFee value) {
        this.noticeAndPaymentFee = value;
    }

    /**
     * Gets the value of the defaultCharge property.
     * 
     * @return
     *     possible object is
     *     {@link DateRestrictedCharge }
     *     
     */
    public DateRestrictedCharge getDefaultCharge() {
        return defaultCharge;
    }

    /**
     * Sets the value of the defaultCharge property.
     * 
     * @param value
     *     allowed object is
     *     {@link DateRestrictedCharge }
     *     
     */
    public void setDefaultCharge(DateRestrictedCharge value) {
        this.defaultCharge = value;
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
     *     {@link DefaultInterest }
     *     
     */
    public DefaultInterest getDefaultInterest() {
        return defaultInterest;
    }

    /**
     * Sets the value of the defaultInterest property.
     * 
     * @param value
     *     allowed object is
     *     {@link DefaultInterest }
     *     
     */
    public void setDefaultInterest(DefaultInterest value) {
        this.defaultInterest = value;
    }

    /**
     * Gets the value of the currencyInformation property.
     * 
     * @return
     *     possible object is
     *     {@link CurrencyInformation }
     *     
     */
    public CurrencyInformation getCurrencyInformation() {
        return currencyInformation;
    }

    /**
     * Sets the value of the currencyInformation property.
     * 
     * @param value
     *     allowed object is
     *     {@link CurrencyInformation }
     *     
     */
    public void setCurrencyInformation(CurrencyInformation value) {
        this.currencyInformation = value;
    }

    /**
     * Gets the value of the permitOutOfSequencePayment property.
     * 
     */
    public boolean isPermitOutOfSequencePayment() {
        return permitOutOfSequencePayment;
    }

    /**
     * Sets the value of the permitOutOfSequencePayment property.
     * 
     */
    public void setPermitOutOfSequencePayment(boolean value) {
        this.permitOutOfSequencePayment = value;
    }

    /**
     * Gets the value of the discount property.
     * 
     * @return
     *     possible object is
     *     {@link DiscountCharge }
     *     
     */
    public DiscountCharge getDiscount() {
        return discount;
    }

    /**
     * Sets the value of the discount property.
     * 
     * @param value
     *     allowed object is
     *     {@link DiscountCharge }
     *     
     */
    public void setDiscount(DiscountCharge value) {
        this.discount = value;
    }

    /**
     * Gets the value of the isPartialPaymentAllowed property.
     * 
     */
    public boolean isIsPartialPaymentAllowed() {
        return isPartialPaymentAllowed;
    }

    /**
     * Sets the value of the isPartialPaymentAllowed property.
     * 
     */
    public void setIsPartialPaymentAllowed(boolean value) {
        this.isPartialPaymentAllowed = value;
    }

    /**
     * Gets the value of the billPresentmentSystem property.
     * 
     * @return
     *     possible object is
     *     {@link BillPresentmentSystem }
     *     
     */
    public BillPresentmentSystem getBillPresentmentSystem() {
        return billPresentmentSystem;
    }

    /**
     * Sets the value of the billPresentmentSystem property.
     * 
     * @param value
     *     allowed object is
     *     {@link BillPresentmentSystem }
     *     
     */
    public void setBillPresentmentSystem(BillPresentmentSystem value) {
        this.billPresentmentSystem = value;
    }

    /**
     * Gets the value of the printing property.
     * 
     * @return
     *     possible object is
     *     {@link Printing }
     *     
     */
    public Printing getPrinting() {
        return printing;
    }

    /**
     * Sets the value of the printing property.
     * 
     * @param value
     *     allowed object is
     *     {@link Printing }
     *     
     */
    public void setPrinting(Printing value) {
        this.printing = value;
    }

}
