
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
 *         &lt;element name="CreateClaimResult" type="{http://IcelandicOnlineBanking/2005/12/01/ClaimTypes}ClaimOperationResult"/>
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
    "createClaimResult"
})
@XmlRootElement(name = "CreateClaimResponse", namespace = "http://IcelandicOnlineBanking/2005/12/01/Claims")
public class CreateClaimResponse {

    @XmlElement(name = "CreateClaimResult", namespace = "http://IcelandicOnlineBanking/2005/12/01/Claims", required = true)
    protected ClaimOperationResult createClaimResult;

    /**
     * Gets the value of the createClaimResult property.
     * 
     * @return
     *     possible object is
     *     {@link ClaimOperationResult }
     *     
     */
    public ClaimOperationResult getCreateClaimResult() {
        return createClaimResult;
    }

    /**
     * Sets the value of the createClaimResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link ClaimOperationResult }
     *     
     */
    public void setCreateClaimResult(ClaimOperationResult value) {
        this.createClaimResult = value;
    }

}
