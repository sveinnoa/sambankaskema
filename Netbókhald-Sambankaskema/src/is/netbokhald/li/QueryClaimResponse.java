
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
 *         &lt;element name="QueryClaimResult" type="{http://IcelandicOnlineBanking/2005/12/01/ClaimTypes}ClaimInfo"/>
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
    "queryClaimResult"
})
@XmlRootElement(name = "QueryClaimResponse", namespace = "http://IcelandicOnlineBanking/2005/12/01/Claims")
public class QueryClaimResponse {

    @XmlElement(name = "QueryClaimResult", namespace = "http://IcelandicOnlineBanking/2005/12/01/Claims", required = true)
    protected ClaimInfo queryClaimResult;

    /**
     * Gets the value of the queryClaimResult property.
     * 
     * @return
     *     possible object is
     *     {@link ClaimInfo }
     *     
     */
    public ClaimInfo getQueryClaimResult() {
        return queryClaimResult;
    }

    /**
     * Sets the value of the queryClaimResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link ClaimInfo }
     *     
     */
    public void setQueryClaimResult(ClaimInfo value) {
        this.queryClaimResult = value;
    }

}
