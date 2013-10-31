
package is.netbokhald.li;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * Uppl?singar um innheimtukršfu sem lenti ‡ villu.
 * 
 * <p>Java class for ClaimError complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ClaimError">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Key" type="{http://IcelandicOnlineBanking/2005/12/01/ClaimTypes}ClaimKey"/>
 *         &lt;element name="Error" type="{http://IcelandicOnlineBanking/2005/12/01/CommonTypes}Error"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ClaimError", propOrder = {
    "key",
    "error"
})
public class ClaimError {

    @XmlElement(name = "Key", required = true)
    protected ClaimKey key;
    @XmlElement(name = "Error", required = true)
    protected Error error;

    /**
     * Gets the value of the key property.
     * 
     * @return
     *     possible object is
     *     {@link ClaimKey }
     *     
     */
    public ClaimKey getKey() {
        return key;
    }

    /**
     * Sets the value of the key property.
     * 
     * @param value
     *     allowed object is
     *     {@link ClaimKey }
     *     
     */
    public void setKey(ClaimKey value) {
        this.key = value;
    }

    /**
     * Gets the value of the error property.
     * 
     * @return
     *     possible object is
     *     {@link Error }
     *     
     */
    public Error getError() {
        return error;
    }

    /**
     * Sets the value of the error property.
     * 
     * @param value
     *     allowed object is
     *     {@link Error }
     *     
     */
    public void setError(Error value) {
        this.error = value;
    }

}
