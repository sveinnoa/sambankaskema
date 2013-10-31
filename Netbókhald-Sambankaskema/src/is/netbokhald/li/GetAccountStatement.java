
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
 *         &lt;element name="accountStatement" type="{http://IcelandicOnlineBanking/2005/12/01/StatementTypes}AccountStatement"/>
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
    "accountStatement"
})
@XmlRootElement(name = "GetAccountStatement", namespace = "http://IcelandicOnlineBanking/2005/12/01/Statements")
public class GetAccountStatement {

    @XmlElement(namespace = "http://IcelandicOnlineBanking/2005/12/01/Statements", required = true)
    protected AccountStatement accountStatement;

    /**
     * Gets the value of the accountStatement property.
     * 
     * @return
     *     possible object is
     *     {@link AccountStatement }
     *     
     */
    public AccountStatement getAccountStatement() {
        return accountStatement;
    }

    /**
     * Sets the value of the accountStatement property.
     * 
     * @param value
     *     allowed object is
     *     {@link AccountStatement }
     *     
     */
    public void setAccountStatement(AccountStatement value) {
        this.accountStatement = value;
    }

}
