
package is.netbokhald.li;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * Abstract t?pa fyrir kvittanir. SnailMail, Email og SMS erfa ?essa t?pu
 * 
 * <p>Java class for Receipt complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Receipt">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;attribute name="Language" use="required" type="{http://IcelandicOnlineBanking/2005/12/01/CommonTypes}Language" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Receipt", namespace = "http://IcelandicOnlineBanking/2005/12/01/PaymentTypes")
@XmlSeeAlso({
    is.netbokhald.li.Communication.PostalMail.class,
    is.netbokhald.li.Communication.EMail.class,
    is.netbokhald.li.Communication.SMS.class
})
public abstract class Receipt {

    @XmlAttribute(name = "Language", required = true)
    protected String language;

    /**
     * Gets the value of the language property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLanguage() {
        return language;
    }

    /**
     * Sets the value of the language property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLanguage(String value) {
        this.language = value;
    }

}
