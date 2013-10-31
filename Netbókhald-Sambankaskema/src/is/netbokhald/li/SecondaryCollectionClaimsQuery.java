
package is.netbokhald.li;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * Fyrirspurn um innheimtukršfur ’ milliinnheimtu.
 * 
 * <p>Java class for SecondaryCollectionClaimsQuery complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SecondaryCollectionClaimsQuery">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Claimant" type="{http://IcelandicOnlineBanking/2005/12/01/CommonTypes}PersonID" minOccurs="0"/>
 *         &lt;element name="CollectionDateFrom" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
 *         &lt;element name="CollectionDateTo" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
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
@XmlType(name = "SecondaryCollectionClaimsQuery", propOrder = {
    "claimant",
    "collectionDateFrom",
    "collectionDateTo",
    "status",
    "entryFrom",
    "entryTo"
})
public class SecondaryCollectionClaimsQuery {

    @XmlElement(name = "Claimant")
    protected String claimant;
    @XmlElement(name = "CollectionDateFrom")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar collectionDateFrom;
    @XmlElement(name = "CollectionDateTo")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar collectionDateTo;
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
     * Gets the value of the collectionDateFrom property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getCollectionDateFrom() {
        return collectionDateFrom;
    }

    /**
     * Sets the value of the collectionDateFrom property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setCollectionDateFrom(XMLGregorianCalendar value) {
        this.collectionDateFrom = value;
    }

    /**
     * Gets the value of the collectionDateTo property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getCollectionDateTo() {
        return collectionDateTo;
    }

    /**
     * Sets the value of the collectionDateTo property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setCollectionDateTo(XMLGregorianCalendar value) {
        this.collectionDateTo = value;
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
