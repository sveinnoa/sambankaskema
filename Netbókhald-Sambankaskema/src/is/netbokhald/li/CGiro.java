
package is.netbokhald.li;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * CGiro er nota? til ?ess a? grei?a C-g’r— se?la.
 * 
 * <p>Java class for CGiro complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CGiro">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Account" type="{http://IcelandicOnlineBanking/2005/12/01/CommonTypes}AccountID"/>
 *         &lt;element name="AccountOwnerID" type="{http://IcelandicOnlineBanking/2005/12/01/CommonTypes}PersonID"/>
 *         &lt;element name="BillNumber" type="{http://IcelandicOnlineBanking/2005/12/01/CommonTypes}BillNumber"/>
 *         &lt;element name="CategoryCode" type="{http://IcelandicOnlineBanking/2005/12/01/CommonTypes}CategoryCode" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CGiro", namespace = "http://IcelandicOnlineBanking/2005/12/01/PaymentTypes", propOrder = {
    "account",
    "accountOwnerID",
    "billNumber",
    "categoryCode"
})
public class CGiro {

    @XmlElement(name = "Account", required = true)
    protected String account;
    @XmlElement(name = "AccountOwnerID", required = true)
    protected String accountOwnerID;
    @XmlElement(name = "BillNumber", required = true)
    protected String billNumber;
    @XmlElement(name = "CategoryCode")
    protected String categoryCode;

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
