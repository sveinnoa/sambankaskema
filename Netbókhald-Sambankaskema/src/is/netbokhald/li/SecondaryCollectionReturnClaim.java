
package is.netbokhald.li;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * Ni?ursta?a fyrirspurnar um innheimtukršfur ’ milliinnheimtu.
 * 
 * <p>Java class for SecondaryCollectionReturnClaim complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SecondaryCollectionReturnClaim">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Key" type="{http://IcelandicOnlineBanking/2005/12/01/ClaimTypes}ClaimKey" maxOccurs="unbounded"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SecondaryCollectionReturnClaim", propOrder = {
    "key"
})
public class SecondaryCollectionReturnClaim {

    @XmlElement(name = "Key", required = true)
    protected List<ClaimKey> key;

    /**
     * Gets the value of the key property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the key property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getKey().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ClaimKey }
     * 
     * 
     */
    public List<ClaimKey> getKey() {
        if (key == null) {
            key = new ArrayList<ClaimKey>();
        }
        return this.key;
    }

}
