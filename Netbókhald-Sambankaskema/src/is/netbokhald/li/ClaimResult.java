
package is.netbokhald.li;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * Ni?ursta?a af a?ger? ‡ innheimtukršfu. Ef hœn var stofnu? eru uppl?singar um hvor ?a? eigi a? prenta hana og hvort hœn tengist beingrei?slusamningi.
 * 
 * <p>Java class for ClaimResult complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ClaimResult">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Key" type="{http://IcelandicOnlineBanking/2005/12/01/ClaimTypes}ClaimKey"/>
 *         &lt;element name="Print" type="{http://IcelandicOnlineBanking/2005/12/01/ClaimTypes}PrintInformation"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ClaimResult", propOrder = {
    "key",
    "print"
})
public class ClaimResult {

    @XmlElement(name = "Key", required = true)
    protected ClaimKey key;
    @XmlElement(name = "Print", required = true)
    protected PrintInformation print;

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
     * Gets the value of the print property.
     * 
     * @return
     *     possible object is
     *     {@link PrintInformation }
     *     
     */
    public PrintInformation getPrint() {
        return print;
    }

    /**
     * Sets the value of the print property.
     * 
     * @param value
     *     allowed object is
     *     {@link PrintInformation }
     *     
     */
    public void setPrint(PrintInformation value) {
        this.print = value;
    }

}
