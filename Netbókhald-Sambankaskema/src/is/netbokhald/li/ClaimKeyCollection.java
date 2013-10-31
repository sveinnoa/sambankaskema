
package is.netbokhald.li;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * Listi af lyklum innheimtukrafna.
 * 
 * <p>Java class for ClaimKeyCollection complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ClaimKeyCollection">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element ref="{http://IcelandicOnlineBanking/2005/12/01/ClaimTypes}ClaimKey" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ClaimKeyCollection", propOrder = {
    "claimKey"
})
public class ClaimKeyCollection {

    @XmlElement(name = "ClaimKey", nillable = true)
    protected List<ClaimKey> claimKey;

    /**
     * Gets the value of the claimKey property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the claimKey property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getClaimKey().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ClaimKey }
     * 
     * 
     */
    public List<ClaimKey> getClaimKey() {
        if (claimKey == null) {
            claimKey = new ArrayList<ClaimKey>();
        }
        return this.claimKey;
    }

}
