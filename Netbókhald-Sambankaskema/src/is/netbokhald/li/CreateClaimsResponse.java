
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
 *         &lt;element name="CreateClaimsResult" type="{http://IcelandicOnlineBanking/2005/12/01/CommonTypes}OperationID"/>
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
    "createClaimsResult"
})
@XmlRootElement(name = "CreateClaimsResponse", namespace = "http://IcelandicOnlineBanking/2005/12/01/Claims")
public class CreateClaimsResponse {

    @XmlElement(name = "CreateClaimsResult", namespace = "http://IcelandicOnlineBanking/2005/12/01/Claims", required = true)
    protected String createClaimsResult;

    /**
     * Gets the value of the createClaimsResult property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCreateClaimsResult() {
        return createClaimsResult;
    }

    /**
     * Sets the value of the createClaimsResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCreateClaimsResult(String value) {
        this.createClaimsResult = value;
    }

}
