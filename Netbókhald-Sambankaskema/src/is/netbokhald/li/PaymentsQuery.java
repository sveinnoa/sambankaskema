
package is.netbokhald.li;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * Fyrirspurn um grei?slu.
 * 
 * <p>Java class for PaymentsQuery complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PaymentsQuery">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Claimant" type="{http://IcelandicOnlineBanking/2005/12/01/CommonTypes}PersonID"/>
 *         &lt;element name="Identifier" type="{http://IcelandicOnlineBanking/2005/12/01/ClaimTypes}Identifier" minOccurs="0"/>
 *         &lt;element name="DisposalAccount" type="{http://IcelandicOnlineBanking/2005/12/01/CommonTypes}AccountID" minOccurs="0"/>
 *         &lt;element name="TransactionDateFrom" type="{http://www.w3.org/2001/XMLSchema}date"/>
 *         &lt;element name="TransactionDateTo" type="{http://www.w3.org/2001/XMLSchema}date"/>
 *         &lt;element name="EntryFrom" type="{http://www.w3.org/2001/XMLSchema}unsignedInt" minOccurs="0"/>
 *         &lt;element name="EntryTo" type="{http://www.w3.org/2001/XMLSchema}unsignedInt" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PaymentsQuery", propOrder = {
    "claimant",
    "identifier",
    "disposalAccount",
    "transactionDateFrom",
    "transactionDateTo",
    "entryFrom",
    "entryTo"
})
public class PaymentsQuery {

    @XmlElement(name = "Claimant", required = true)
    protected String claimant;
    @XmlElement(name = "Identifier")
    protected String identifier;
    @XmlElement(name = "DisposalAccount")
    protected String disposalAccount;
    @XmlElement(name = "TransactionDateFrom", required = true)
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar transactionDateFrom;
    @XmlElement(name = "TransactionDateTo", required = true)
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar transactionDateTo;
    @XmlElement(name = "EntryFrom")
    @XmlSchemaType(name = "unsignedInt")
    protected Long entryFrom;
    @XmlElement(name = "EntryTo")
    @XmlSchemaType(name = "unsignedInt")
    protected Long entryTo;

    /**
     * Gets the value of the claimant property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getClaimant() {
        return claimant;
    }

    /**
     * Sets the value of the claimant property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setClaimant(String value) {
        this.claimant = value;
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
     * Gets the value of the disposalAccount property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDisposalAccount() {
        return disposalAccount;
    }

    /**
     * Sets the value of the disposalAccount property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDisposalAccount(String value) {
        this.disposalAccount = value;
    }

    /**
     * Gets the value of the transactionDateFrom property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getTransactionDateFrom() {
        return transactionDateFrom;
    }

    /**
     * Sets the value of the transactionDateFrom property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setTransactionDateFrom(XMLGregorianCalendar value) {
        this.transactionDateFrom = value;
    }

    /**
     * Gets the value of the transactionDateTo property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getTransactionDateTo() {
        return transactionDateTo;
    }

    /**
     * Sets the value of the transactionDateTo property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setTransactionDateTo(XMLGregorianCalendar value) {
        this.transactionDateTo = value;
    }

    /**
     * Gets the value of the entryFrom property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getEntryFrom() {
        return entryFrom;
    }

    /**
     * Sets the value of the entryFrom property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setEntryFrom(Long value) {
        this.entryFrom = value;
    }

    /**
     * Gets the value of the entryTo property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getEntryTo() {
        return entryTo;
    }

    /**
     * Sets the value of the entryTo property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setEntryTo(Long value) {
        this.entryTo = value;
    }

}
