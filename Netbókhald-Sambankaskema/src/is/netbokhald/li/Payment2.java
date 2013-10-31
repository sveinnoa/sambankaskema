
package is.netbokhald.li;

import java.math.BigDecimal;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * L?sir stakri grei?slu.
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
 *         &lt;element name="Key" type="{http://IcelandicOnlineBanking/2005/12/01/ClaimTypes}ClaimKey"/>
 *         &lt;element name="PayorID" type="{http://IcelandicOnlineBanking/2005/12/01/CommonTypes}PersonID"/>
 *         &lt;element name="Amount" type="{http://IcelandicOnlineBanking/2005/12/01/CommonTypes}Amount"/>
 *         &lt;element name="FinalDueDate" type="{http://www.w3.org/2001/XMLSchema}date"/>
 *         &lt;element name="Identifier" type="{http://IcelandicOnlineBanking/2005/12/01/ClaimTypes}Identifier"/>
 *         &lt;element name="Reference" type="{http://IcelandicOnlineBanking/2005/12/01/ClaimTypes}Reference"/>
 *         &lt;element name="CategoryCode" type="{http://IcelandicOnlineBanking/2005/12/01/CommonTypes}CategoryCode" minOccurs="0"/>
 *         &lt;element name="RedeemingBank" type="{http://IcelandicOnlineBanking/2005/12/01/CommonTypes}Bank"/>
 *         &lt;element name="TransactionDate" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="BookingDate" type="{http://www.w3.org/2001/XMLSchema}date"/>
 *         &lt;element name="ValueDate" type="{http://www.w3.org/2001/XMLSchema}date"/>
 *         &lt;element name="PaymentType">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;enumeration value="Complete"/>
 *               &lt;enumeration value="Partial"/>
 *               &lt;enumeration value="Refund"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="AmountDeposited" type="{http://IcelandicOnlineBanking/2005/12/01/CommonTypes}Amount"/>
 *         &lt;element name="TotalAmount" type="{http://IcelandicOnlineBanking/2005/12/01/CommonTypes}Amount"/>
 *         &lt;element name="CapitalGainsTax" type="{http://IcelandicOnlineBanking/2005/12/01/CommonTypes}Amount"/>
 *         &lt;element name="BillNumber" type="{http://IcelandicOnlineBanking/2005/12/01/CommonTypes}BillNumber" minOccurs="0"/>
 *         &lt;element name="CustomerNumber" type="{http://IcelandicOnlineBanking/2005/12/01/ClaimTypes}CustomerNumber" minOccurs="0"/>
 *         &lt;element name="NoticeChargeAmount" type="{http://IcelandicOnlineBanking/2005/12/01/CommonTypes}Amount"/>
 *         &lt;element name="DefaultChargeAmount" type="{http://IcelandicOnlineBanking/2005/12/01/CommonTypes}Amount"/>
 *         &lt;element name="OtherCostsAmount" type="{http://IcelandicOnlineBanking/2005/12/01/CommonTypes}Amount"/>
 *         &lt;element name="OtherDefaultCostsAmount" type="{http://IcelandicOnlineBanking/2005/12/01/CommonTypes}Amount"/>
 *         &lt;element name="DefaultInterestAmount" type="{http://IcelandicOnlineBanking/2005/12/01/CommonTypes}Amount"/>
 *         &lt;element name="DiscountAmount" type="{http://IcelandicOnlineBanking/2005/12/01/CommonTypes}Amount"/>
 *         &lt;element name="Currency" type="{http://IcelandicOnlineBanking/2005/12/01/ClaimTypes}CurrencyExchangeRate" minOccurs="0"/>
 *         &lt;element name="BatchNumber" type="{http://IcelandicOnlineBanking/2005/12/01/CommonTypes}BatchNumber" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Payment", propOrder = {
    "key",
    "payorID",
    "amount",
    "finalDueDate",
    "identifier",
    "reference",
    "categoryCode",
    "redeemingBank",
    "transactionDate",
    "bookingDate",
    "valueDate",
    "paymentType",
    "amountDeposited",
    "totalAmount",
    "capitalGainsTax",
    "billNumber",
    "customerNumber",
    "noticeChargeAmount",
    "defaultChargeAmount",
    "otherCostsAmount",
    "otherDefaultCostsAmount",
    "defaultInterestAmount",
    "discountAmount",
    "currency",
    "batchNumber"
})
public class Payment2 {

    @XmlElement(name = "Key", required = true)
    protected ClaimKey key;
    @XmlElement(name = "PayorID", required = true)
    protected String payorID;
    @XmlElement(name = "Amount", required = true)
    protected BigDecimal amount;
    @XmlElement(name = "FinalDueDate", required = true)
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar finalDueDate;
    @XmlElement(name = "Identifier", required = true)
    protected String identifier;
    @XmlElement(name = "Reference", required = true)
    protected String reference;
    @XmlElement(name = "CategoryCode")
    protected String categoryCode;
    @XmlElement(name = "RedeemingBank", required = true)
    protected String redeemingBank;
    @XmlElement(name = "TransactionDate", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar transactionDate;
    @XmlElement(name = "BookingDate", required = true)
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar bookingDate;
    @XmlElement(name = "ValueDate", required = true)
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar valueDate;
    @XmlElement(name = "PaymentType", required = true)
    protected String paymentType;
    @XmlElement(name = "AmountDeposited", required = true)
    protected BigDecimal amountDeposited;
    @XmlElement(name = "TotalAmount", required = true)
    protected BigDecimal totalAmount;
    @XmlElement(name = "CapitalGainsTax", required = true)
    protected BigDecimal capitalGainsTax;
    @XmlElement(name = "BillNumber")
    protected String billNumber;
    @XmlElement(name = "CustomerNumber")
    protected String customerNumber;
    @XmlElement(name = "NoticeChargeAmount", required = true)
    protected BigDecimal noticeChargeAmount;
    @XmlElement(name = "DefaultChargeAmount", required = true)
    protected BigDecimal defaultChargeAmount;
    @XmlElement(name = "OtherCostsAmount", required = true)
    protected BigDecimal otherCostsAmount;
    @XmlElement(name = "OtherDefaultCostsAmount", required = true)
    protected BigDecimal otherDefaultCostsAmount;
    @XmlElement(name = "DefaultInterestAmount", required = true)
    protected BigDecimal defaultInterestAmount;
    @XmlElement(name = "DiscountAmount", required = true)
    protected BigDecimal discountAmount;
    @XmlElement(name = "Currency")
    protected CurrencyExchangeRate currency;
    @XmlElement(name = "BatchNumber")
    protected String batchNumber;

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
     * Gets the value of the redeemingBank property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRedeemingBank() {
        return redeemingBank;
    }

    /**
     * Sets the value of the redeemingBank property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRedeemingBank(String value) {
        this.redeemingBank = value;
    }

    /**
     * Gets the value of the transactionDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getTransactionDate() {
        return transactionDate;
    }

    /**
     * Sets the value of the transactionDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setTransactionDate(XMLGregorianCalendar value) {
        this.transactionDate = value;
    }

    /**
     * Gets the value of the bookingDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getBookingDate() {
        return bookingDate;
    }

    /**
     * Sets the value of the bookingDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setBookingDate(XMLGregorianCalendar value) {
        this.bookingDate = value;
    }

    /**
     * Gets the value of the valueDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getValueDate() {
        return valueDate;
    }

    /**
     * Sets the value of the valueDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setValueDate(XMLGregorianCalendar value) {
        this.valueDate = value;
    }

    /**
     * Gets the value of the paymentType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPaymentType() {
        return paymentType;
    }

    /**
     * Sets the value of the paymentType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPaymentType(String value) {
        this.paymentType = value;
    }

    /**
     * Gets the value of the amountDeposited property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getAmountDeposited() {
        return amountDeposited;
    }

    /**
     * Sets the value of the amountDeposited property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setAmountDeposited(BigDecimal value) {
        this.amountDeposited = value;
    }

    /**
     * Gets the value of the totalAmount property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getTotalAmount() {
        return totalAmount;
    }

    /**
     * Sets the value of the totalAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setTotalAmount(BigDecimal value) {
        this.totalAmount = value;
    }

    /**
     * Gets the value of the capitalGainsTax property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getCapitalGainsTax() {
        return capitalGainsTax;
    }

    /**
     * Sets the value of the capitalGainsTax property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setCapitalGainsTax(BigDecimal value) {
        this.capitalGainsTax = value;
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

    /**
     * Gets the value of the currency property.
     * 
     * @return
     *     possible object is
     *     {@link CurrencyExchangeRate }
     *     
     */
    public CurrencyExchangeRate getCurrency() {
        return currency;
    }

    /**
     * Sets the value of the currency property.
     * 
     * @param value
     *     allowed object is
     *     {@link CurrencyExchangeRate }
     *     
     */
    public void setCurrency(CurrencyExchangeRate value) {
        this.currency = value;
    }

    /**
     * Gets the value of the batchNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBatchNumber() {
        return batchNumber;
    }

    /**
     * Sets the value of the batchNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBatchNumber(String value) {
        this.batchNumber = value;
    }

}
