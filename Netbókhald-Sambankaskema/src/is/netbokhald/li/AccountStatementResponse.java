
package is.netbokhald.li;

import java.math.BigDecimal;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for AccountStatementResponse complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AccountStatementResponse">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Account" type="{http://IcelandicOnlineBanking/2005/12/01/CommonTypes}AccountID"/>
 *         &lt;element name="Currency" type="{http://IcelandicOnlineBanking/2005/12/01/CommonTypes}CurrencyCode"/>
 *         &lt;element name="Overdraft" type="{http://IcelandicOnlineBanking/2005/12/01/CommonTypes}Amount"/>
 *         &lt;element name="Balance" type="{http://IcelandicOnlineBanking/2005/12/01/CommonTypes}Amount"/>
 *         &lt;element name="AvailableAmount" type="{http://IcelandicOnlineBanking/2005/12/01/CommonTypes}Amount"/>
 *         &lt;element name="Status" type="{http://IcelandicOnlineBanking/2005/12/01/CommonTypes}Status"/>
 *         &lt;element name="TotalAmountWaiting" type="{http://IcelandicOnlineBanking/2005/12/01/CommonTypes}Amount"/>
 *         &lt;element name="IBAN" type="{http://IcelandicOnlineBanking/2005/12/01/CommonTypes}IBAN"/>
 *         &lt;element name="AccountOwnerID" type="{http://IcelandicOnlineBanking/2005/12/01/CommonTypes}PersonID"/>
 *         &lt;element name="CustomAccountName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="AccountInformation" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Transactions" type="{http://IcelandicOnlineBanking/2005/12/01/StatementTypes}AccountTransactionArray" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AccountStatementResponse", namespace = "http://IcelandicOnlineBanking/2005/12/01/StatementTypes", propOrder = {
    "account",
    "currency",
    "overdraft",
    "balance",
    "availableAmount",
    "status",
    "totalAmountWaiting",
    "iban",
    "accountOwnerID",
    "customAccountName",
    "accountInformation",
    "transactions"
})
public class AccountStatementResponse {

    @XmlElement(name = "Account", required = true)
    protected String account;
    @XmlElement(name = "Currency", required = true)
    protected String currency;
    @XmlElement(name = "Overdraft", required = true)
    protected BigDecimal overdraft;
    @XmlElement(name = "Balance", required = true)
    protected BigDecimal balance;
    @XmlElement(name = "AvailableAmount", required = true)
    protected BigDecimal availableAmount;
    @XmlElement(name = "Status", required = true)
    protected Status status;
    @XmlElement(name = "TotalAmountWaiting", required = true)
    protected BigDecimal totalAmountWaiting;
    @XmlElement(name = "IBAN", required = true)
    protected String iban;
    @XmlElement(name = "AccountOwnerID", required = true)
    protected String accountOwnerID;
    @XmlElement(name = "CustomAccountName")
    protected String customAccountName;
    @XmlElement(name = "AccountInformation")
    protected String accountInformation;
    @XmlElement(name = "Transactions")
    protected AccountTransactionArray transactions;

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
     * Gets the value of the overdraft property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getOverdraft() {
        return overdraft;
    }

    /**
     * Sets the value of the overdraft property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setOverdraft(BigDecimal value) {
        this.overdraft = value;
    }

    /**
     * Gets the value of the balance property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getBalance() {
        return balance;
    }

    /**
     * Sets the value of the balance property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setBalance(BigDecimal value) {
        this.balance = value;
    }

    /**
     * Gets the value of the availableAmount property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getAvailableAmount() {
        return availableAmount;
    }

    /**
     * Sets the value of the availableAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setAvailableAmount(BigDecimal value) {
        this.availableAmount = value;
    }

    /**
     * Gets the value of the status property.
     * 
     * @return
     *     possible object is
     *     {@link Status }
     *     
     */
    public Status getStatus() {
        return status;
    }

    /**
     * Sets the value of the status property.
     * 
     * @param value
     *     allowed object is
     *     {@link Status }
     *     
     */
    public void setStatus(Status value) {
        this.status = value;
    }

    /**
     * Gets the value of the totalAmountWaiting property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getTotalAmountWaiting() {
        return totalAmountWaiting;
    }

    /**
     * Sets the value of the totalAmountWaiting property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setTotalAmountWaiting(BigDecimal value) {
        this.totalAmountWaiting = value;
    }

    /**
     * Gets the value of the iban property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIBAN() {
        return iban;
    }

    /**
     * Sets the value of the iban property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIBAN(String value) {
        this.iban = value;
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
     * Gets the value of the customAccountName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCustomAccountName() {
        return customAccountName;
    }

    /**
     * Sets the value of the customAccountName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCustomAccountName(String value) {
        this.customAccountName = value;
    }

    /**
     * Gets the value of the accountInformation property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAccountInformation() {
        return accountInformation;
    }

    /**
     * Sets the value of the accountInformation property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAccountInformation(String value) {
        this.accountInformation = value;
    }

    /**
     * Gets the value of the transactions property.
     * 
     * @return
     *     possible object is
     *     {@link AccountTransactionArray }
     *     
     */
    public AccountTransactionArray getTransactions() {
        return transactions;
    }

    /**
     * Sets the value of the transactions property.
     * 
     * @param value
     *     allowed object is
     *     {@link AccountTransactionArray }
     *     
     */
    public void setTransactions(AccountTransactionArray value) {
        this.transactions = value;
    }

}
