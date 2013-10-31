
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
 *         &lt;element name="QueryPaymentsResult" type="{http://IcelandicOnlineBanking/2005/12/01/ClaimTypes}QueryPaymentsResult"/>
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
    "queryPaymentsResult"
})
@XmlRootElement(name = "QueryPaymentsResponse", namespace = "http://IcelandicOnlineBanking/2005/12/01/Claims")
public class QueryPaymentsResponse {

    @XmlElement(name = "QueryPaymentsResult", namespace = "http://IcelandicOnlineBanking/2005/12/01/Claims", required = true)
    protected QueryPaymentsResult queryPaymentsResult;

    /**
     * Gets the value of the queryPaymentsResult property.
     * 
     * @return
     *     possible object is
     *     {@link QueryPaymentsResult }
     *     
     */
    public QueryPaymentsResult getQueryPaymentsResult() {
        return queryPaymentsResult;
    }

    /**
     * Sets the value of the queryPaymentsResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link QueryPaymentsResult }
     *     
     */
    public void setQueryPaymentsResult(QueryPaymentsResult value) {
        this.queryPaymentsResult = value;
    }

}
