
package is.netbokhald.li;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * Skil fyrirspurnar um innheimtukršfur.
 * 
 * <p>Java class for QueryClaimsResult complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="QueryClaimsResult">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="TotalCount" type="{http://www.w3.org/2001/XMLSchema}unsignedInt"/>
 *         &lt;element name="Claims" type="{http://IcelandicOnlineBanking/2005/12/01/ClaimTypes}ClaimInfo" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "QueryClaimsResult", propOrder = {
    "totalCount",
    "claims"
})
public class QueryClaimsResult {

    @XmlElement(name = "TotalCount")
    @XmlSchemaType(name = "unsignedInt")
    protected long totalCount;
    @XmlElement(name = "Claims")
    protected List<ClaimInfo> claims;

    /**
     * Gets the value of the totalCount property.
     * 
     */
    public long getTotalCount() {
        return totalCount;
    }

    /**
     * Sets the value of the totalCount property.
     * 
     */
    public void setTotalCount(long value) {
        this.totalCount = value;
    }

    /**
     * Gets the value of the claims property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the claims property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getClaims().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ClaimInfo }
     * 
     * 
     */
    public List<ClaimInfo> getClaims() {
        if (claims == null) {
            claims = new ArrayList<ClaimInfo>();
        }
        return this.claims;
    }

}
