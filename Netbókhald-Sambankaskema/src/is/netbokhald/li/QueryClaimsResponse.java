
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
 *         &lt;element name="QueryClaimsResult" type="{http://IcelandicOnlineBanking/2005/12/01/ClaimTypes}QueryClaimsResult"/>
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
    "queryClaimsResult"
})
@XmlRootElement(name = "QueryClaimsResponse", namespace = "http://IcelandicOnlineBanking/2005/12/01/Claims")
public class QueryClaimsResponse {

    @XmlElement(name = "QueryClaimsResult", namespace = "http://IcelandicOnlineBanking/2005/12/01/Claims", required = true)
    protected QueryClaimsResult queryClaimsResult;

    /**
     * Gets the value of the queryClaimsResult property.
     * 
     * @return
     *     possible object is
     *     {@link QueryClaimsResult }
     *     
     */
    public QueryClaimsResult getQueryClaimsResult() {
        return queryClaimsResult;
    }

    /**
     * Sets the value of the queryClaimsResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link QueryClaimsResult }
     *     
     */
    public void setQueryClaimsResult(QueryClaimsResult value) {
        this.queryClaimsResult = value;
    }

}
