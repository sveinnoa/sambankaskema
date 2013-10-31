
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
 *         &lt;element name="GetClaimOperationResultResult" type="{http://IcelandicOnlineBanking/2005/12/01/ClaimTypes}ClaimOperationResult"/>
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
    "getClaimOperationResultResult"
})
@XmlRootElement(name = "GetClaimOperationResultResponse", namespace = "http://IcelandicOnlineBanking/2005/12/01/Claims")
public class GetClaimOperationResultResponse {

    @XmlElement(name = "GetClaimOperationResultResult", namespace = "http://IcelandicOnlineBanking/2005/12/01/Claims", required = true)
    protected ClaimOperationResult getClaimOperationResultResult;

    /**
     * Gets the value of the getClaimOperationResultResult property.
     * 
     * @return
     *     possible object is
     *     {@link ClaimOperationResult }
     *     
     */
    public ClaimOperationResult getGetClaimOperationResultResult() {
        return getClaimOperationResultResult;
    }

    /**
     * Sets the value of the getClaimOperationResultResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link ClaimOperationResult }
     *     
     */
    public void setGetClaimOperationResultResult(ClaimOperationResult value) {
        this.getClaimOperationResultResult = value;
    }

}
