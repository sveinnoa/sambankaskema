
package is.netbokhald.li;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * Uppl?singar um œttektarreikning.
 * 
 * <p>Java class for PaymentOut complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PaymentOut">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Account" type="{http://IcelandicOnlineBanking/2005/12/01/CommonTypes}AccountID"/>
 *         &lt;element name="AccountOwnerID" type="{http://IcelandicOnlineBanking/2005/12/01/CommonTypes}PersonID"/>
 *         &lt;element name="CategoryCode" type="{http://IcelandicOnlineBanking/2005/12/01/CommonTypes}CategoryCode" minOccurs="0"/>
 *         &lt;element name="Reference" type="{http://IcelandicOnlineBanking/2005/12/01/CommonTypes}Reference" minOccurs="0"/>
 *         &lt;element name="BillNumber" type="{http://IcelandicOnlineBanking/2005/12/01/CommonTypes}BillNumber" minOccurs="0"/>
 *         &lt;element name="Receipt" type="{http://IcelandicOnlineBanking/2005/12/01/PaymentTypes}Communication" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PaymentOut", namespace = "http://IcelandicOnlineBanking/2005/12/01/PaymentTypes", propOrder = {
    "account",
    "accountOwnerID",
    "categoryCode",
    "reference",
    "billNumber",
    "receipt"
})
public class PaymentOut {

    @XmlElement(name = "Account", required = true)
    protected String account;
    @XmlElement(name = "AccountOwnerID", required = true)
    protected String accountOwnerID;
    @XmlElement(name = "CategoryCode")
    protected String categoryCode;
    @XmlElement(name = "Reference")
    protected String reference;
    @XmlElement(name = "BillNumber")
    protected String billNumber;
    @XmlElement(name = "Receipt")
    protected Communication receipt;

    /**
     * Gets the value of the account property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAccount() {
        return account;
    }

    /**
     * Sets the value of the account property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAccount(String value) {
        this.account = value;
    }

    /**
     * Gets the value of the accountOwnerID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAccountOwnerID() {
        return accountOwnerID;
    }

    /**
     * Sets the value of the accountOwnerID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAccountOwnerID(String value) {
        this.accountOwnerID = value;
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

}
