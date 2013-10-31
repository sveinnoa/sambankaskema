
package is.netbokhald.li;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="claims" type="{http://IcelandicOnlineBanking/2005/12/01/ClaimTypes}ClaimCollection"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "claims"
})
@XmlRootElement(name = "AlterClaims", namespace = "http://IcelandicOnlineBanking/2005/12/01/Claims")
public class AlterClaims {

    @XmlElement(namespace = "http://IcelandicOnlineBanking/2005/12/01/Claims", required = true)
    protected ClaimCollection claims;

    /**
     * Gets the value of the claims property.
     * 
     * @return
     *     possible object is
     *     {@link ClaimCollection }
     *     
     */
    public ClaimCollection getClaims() {
        return claims;
    }

    /**
     * Sets the value of the claims property.
     * 
     * @param value
     *     allowed object is
     *     {@link ClaimCollection }
     *     
     */
    public void setClaims(ClaimCollection value) {
        this.claims = value;
    }

}
