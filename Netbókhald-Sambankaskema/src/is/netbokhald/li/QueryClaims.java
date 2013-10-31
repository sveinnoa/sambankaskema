
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
 *         &lt;element name="query" type="{http://IcelandicOnlineBanking/2005/12/01/ClaimTypes}ClaimsQuery"/>
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
    "query"
})
@XmlRootElement(name = "QueryClaims", namespace = "http://IcelandicOnlineBanking/2005/12/01/Claims")
public class QueryClaims {

    @XmlElement(namespace = "http://IcelandicOnlineBanking/2005/12/01/Claims", required = true)
    protected ClaimsQuery query;

    /**
     * Gets the value of the query property.
     * 
     * @return
     *     possible object is
     *     {@link ClaimsQuery }
     *     
     */
    public ClaimsQuery getQuery() {
        return query;
    }

    /**
     * Sets the value of the query property.
     * 
     * @param value
     *     allowed object is
     *     {@link ClaimsQuery }
     *     
     */
    public void setQuery(ClaimsQuery value) {
        this.query = value;
    }

}
