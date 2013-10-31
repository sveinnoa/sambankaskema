
package is.netbokhald.li;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * ABGiro er nota? til ?ess a? grei?a AB-g’r— se?la.
 * 
 * <p>Java class for ABGiro complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ABGiro">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Account" type="{http://IcelandicOnlineBanking/2005/12/01/CommonTypes}AccountID"/>
 *         &lt;element name="Reference" type="{http://IcelandicOnlineBanking/2005/12/01/CommonTypes}Reference"/>
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
@XmlType(name = "ABGiro", namespace = "http://IcelandicOnlineBanking/2005/12/01/PaymentTypes", propOrder = {
    "account",
    "reference",
    "billNumber",
    "categoryCode"
})
public class ABGiro {

    @XmlElement(name = "Account", required = true)
    protected String account;
    @XmlElement(name = "Reference", required = true)
    protected String reference;
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
