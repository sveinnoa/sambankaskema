
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
 *         &lt;element name="keys" type="{http://IcelandicOnlineBanking/2005/12/01/ClaimTypes}ClaimKeyCollection"/>
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
    "keys"
})
@XmlRootElement(name = "CancelClaims", namespace = "http://IcelandicOnlineBanking/2005/12/01/Claims")
public class CancelClaims {

    @XmlElement(namespace = "http://IcelandicOnlineBanking/2005/12/01/Claims", required = true)
    protected ClaimKeyCollection keys;

    /**
     * Gets the value of the keys property.
     * 
     * @return
     *     possible object is
     *     {@link ClaimKeyCollection }
     *     
     */
    public ClaimKeyCollection getKeys() {
        return keys;
    }

    /**
     * Sets the value of the keys property.
     * 
     * @param value
     *     allowed object is
     *     {@link ClaimKeyCollection }
     *     
     */
    public void setKeys(ClaimKeyCollection value) {
        this.keys = value;
    }

}
