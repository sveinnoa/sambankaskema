
package is.netbokhald.li;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * Fyrirspurn um innheimtukršfur.
 * 
 * <p>Java class for ClaimsQuery complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ClaimsQuery">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Claimant" type="{http://IcelandicOnlineBanking/2005/12/01/CommonTypes}PersonID"/>
 *         &lt;element name="Identifier" type="{http://IcelandicOnlineBanking/2005/12/01/ClaimTypes}Identifier" minOccurs="0"/>
 *         &lt;element name="Period" type="{http://IcelandicOnlineBanking/2005/12/01/ClaimTypes}ClaimsQueryDateSpan"/>
 *         &lt;element name="Payor" type="{http://IcelandicOnlineBanking/2005/12/01/CommonTypes}PersonID" minOccurs="0"/>
 *         &lt;element name="Status" type="{http://IcelandicOnlineBanking/2005/12/01/ClaimTypes}ClaimStatus" minOccurs="0"/>
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
@XmlType(name = "ClaimsQuery", propOrder = {
    "claimant",
    "identifier",
    "period",
    "payor",
    "status",
    "entryFrom",
    "entryTo"
})
public class ClaimsQuery {

    @XmlElement(name = "Claimant", required = true)
    protected String claimant;
    @XmlElement(name = "Identifier")
    protected String identifier;
    @XmlElement(name = "Period", required = true)
    protected ClaimsQueryDateSpan period;
    @XmlElement(name = "Payor")
    protected String payor;
    @XmlElement(name = "Status")
    protected ClaimStatus status;
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
     * Gets the value of the period property.
     * 
     * @return
     *     possible object is
     *     {@link ClaimsQueryDateSpan }
     *     
     */
    public ClaimsQueryDateSpan getPeriod() {
        return period;
    }

    /**
     * Sets the value of the period property.
     * 
     * @param value
     *     allowed object is
     *     {@link ClaimsQueryDateSpan }
     *     
     */
    public void setPeriod(ClaimsQueryDateSpan value) {
        this.period = value;
    }

    /**
     * Gets the value of the payor property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPayor() {
        return payor;
    }

    /**
     * Sets the value of the payor property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPayor(String value) {
        this.payor = value;
    }

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
