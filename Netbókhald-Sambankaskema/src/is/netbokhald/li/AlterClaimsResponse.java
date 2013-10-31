
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
 *         &lt;element name="AlterClaimsResult" type="{http://IcelandicOnlineBanking/2005/12/01/CommonTypes}OperationID"/>
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
    "alterClaimsResult"
})
@XmlRootElement(name = "AlterClaimsResponse", namespace = "http://IcelandicOnlineBanking/2005/12/01/Claims")
public class AlterClaimsResponse {

    @XmlElement(name = "AlterClaimsResult", namespace = "http://IcelandicOnlineBanking/2005/12/01/Claims", required = true)
    protected String alterClaimsResult;

    /**
     * Gets the value of the alterClaimsResult property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAlterClaimsResult() {
        return alterClaimsResult;
    }

    /**
     * Sets the value of the alterClaimsResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAlterClaimsResult(String value) {
        this.alterClaimsResult = value;
    }

}
