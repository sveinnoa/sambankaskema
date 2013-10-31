
package is.netbokhald.li;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * Samsett svæ?i sem nota? er til a? stjórna útprentun innheimtukröfu (ef banki prentar). Printing svæ?i? er nota? ef innheimtukrafa er prentu? hjá banka / sparisjó? til ?ess a? st?ra útprentun innheimtukröfunnar. Ef prentun er breytt í breytingarfærslu eftir a? búi? er a? prenta út se?il, hefur ?a? ekki í för me? sér a? hann sé prenta?ur út aftur.
 * 
 * <p>Java class for Printing complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Printing">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ClaimantAddress" type="{http://IcelandicOnlineBanking/2005/12/01/CommonTypes}Address" minOccurs="0"/>
 *         &lt;element name="PayorAddress" type="{http://IcelandicOnlineBanking/2005/12/01/CommonTypes}Address" minOccurs="0"/>
 *         &lt;element name="ItemRows" type="{http://IcelandicOnlineBanking/2005/12/01/ClaimTypes}ItemRow" maxOccurs="20" minOccurs="0"/>
 *         &lt;element name="Comments" type="{http://IcelandicOnlineBanking/2005/12/01/ClaimTypes}Comment" maxOccurs="5" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Printing", propOrder = {
    "claimantAddress",
    "payorAddress",
    "itemRows",
    "comments"
})
public class Printing {

    @XmlElement(name = "ClaimantAddress")
    protected Address claimantAddress;
    @XmlElement(name = "PayorAddress")
    protected Address payorAddress;
    @XmlElement(name = "ItemRows")
    protected List<ItemRow> itemRows;
    @XmlElement(name = "Comments")
    protected List<String> comments;

    /**
     * Gets the value of the claimantAddress property.
     * 
     * @return
     *     possible object is
     *     {@link Address }
     *     
     */
    public Address getClaimantAddress() {
        return claimantAddress;
    }

    /**
     * Sets the value of the claimantAddress property.
     * 
     * @param value
     *     allowed object is
     *     {@link Address }
     *     
     */
    public void setClaimantAddress(Address value) {
        this.claimantAddress = value;
    }

    /**
     * Gets the value of the payorAddress property.
     * 
     * @return
     *     possible object is
     *     {@link Address }
     *     
     */
    public Address getPayorAddress() {
        return payorAddress;
    }

    /**
     * Sets the value of the payorAddress property.
     * 
     * @param value
     *     allowed object is
     *     {@link Address }
     *     
     */
    public void setPayorAddress(Address value) {
        this.payorAddress = value;
    }

    /**
     * Gets the value of the itemRows property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the itemRows property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getItemRows().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ItemRow }
     * 
     * 
     */
    public List<ItemRow> getItemRows() {
        if (itemRows == null) {
            itemRows = new ArrayList<ItemRow>();
        }
        return this.itemRows;
    }

    /**
     * Gets the value of the comments property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the comments property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getComments().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getComments() {
        if (comments == null) {
            comments = new ArrayList<String>();
        }
        return this.comments;
    }

}
