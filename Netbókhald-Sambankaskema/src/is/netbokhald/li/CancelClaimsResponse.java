
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
 *         &lt;element name="CancelClaimsResult" type="{http://IcelandicOnlineBanking/2005/12/01/CommonTypes}OperationID"/>
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
    "cancelClaimsResult"
})
@XmlRootElement(name = "CancelClaimsResponse", namespace = "http://IcelandicOnlineBanking/2005/12/01/Claims")
public class CancelClaimsResponse {

    @XmlElement(name = "CancelClaimsResult", namespace = "http://IcelandicOnlineBanking/2005/12/01/Claims", required = true)
    protected String cancelClaimsResult;

    /**
     * Gets the value of the cancelClaimsResult property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCancelClaimsResult() {
        return cancelClaimsResult;
    }

    /**
     * Sets the value of the cancelClaimsResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCancelClaimsResult(String value) {
        this.cancelClaimsResult = value;
    }

}
