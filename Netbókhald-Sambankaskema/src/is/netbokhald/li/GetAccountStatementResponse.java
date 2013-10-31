
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
 *         &lt;element name="accountStatementResponse" type="{http://IcelandicOnlineBanking/2005/12/01/StatementTypes}AccountStatementResponse"/>
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
    "accountStatementResponse"
})
@XmlRootElement(name = "GetAccountStatementResponse", namespace = "http://IcelandicOnlineBanking/2005/12/01/Statements")
public class GetAccountStatementResponse {

    @XmlElement(namespace = "http://IcelandicOnlineBanking/2005/12/01/Statements", required = true)
    protected AccountStatementResponse accountStatementResponse;

    /**
     * Gets the value of the accountStatementResponse property.
     * 
     * @return
     *     possible object is
     *     {@link AccountStatementResponse }
     *     
     */
    public AccountStatementResponse getAccountStatementResponse() {
        return accountStatementResponse;
    }

    /**
     * Sets the value of the accountStatementResponse property.
     * 
     * @param value
     *     allowed object is
     *     {@link AccountStatementResponse }
     *     
     */
    public void setAccountStatementResponse(AccountStatementResponse value) {
        this.accountStatementResponse = value;
    }

}
