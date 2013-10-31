
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
 *         &lt;element name="AlterClaimResult" type="{http://IcelandicOnlineBanking/2005/12/01/ClaimTypes}ClaimOperationResult"/>
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
    "alterClaimResult"
})
@XmlRootElement(name = "AlterClaimResponse", namespace = "http://IcelandicOnlineBanking/2005/12/01/Claims")
public class AlterClaimResponse {

    @XmlElement(name = "AlterClaimResult", namespace = "http://IcelandicOnlineBanking/2005/12/01/Claims", required = true)
    protected ClaimOperationResult alterClaimResult;

    /**
     * Gets the value of the alterClaimResult property.
     * 
     * @return
     *     possible object is
     *     {@link ClaimOperationResult }
     *     
     */
    public ClaimOperationResult getAlterClaimResult() {
        return alterClaimResult;
    }

    /**
     * Sets the value of the alterClaimResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link ClaimOperationResult }
     *     
     */
    public void setAlterClaimResult(ClaimOperationResult value) {
        this.alterClaimResult = value;
    }

}
