
package is.netbokhald.li;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlType;


/**
 * NotaÌ¡ fyrir afslÌ?tti
 * 
 * <p>Java class for DiscountCharge complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="DiscountCharge">
 *   &lt;complexContent>
 *     &lt;extension base="{http://IcelandicOnlineBanking/2005/12/01/ClaimTypes}DateRestrictedCharge">
 *       &lt;attribute name="IsPostRefDate" type="{http://www.w3.org/2001/XMLSchema}boolean" default="false" />
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DiscountCharge")
public class DiscountCharge
    extends DateRestrictedCharge
{

    @XmlAttribute(name = "IsPostRefDate")
    protected Boolean isPostRefDate;

    /**
     * Gets the value of the isPostRefDate property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public boolean isIsPostRefDate() {
        if (isPostRefDate == null) {
            return false;
        } else {
            return isPostRefDate;
        }
    }

    /**
     * Sets the value of the isPostRefDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIsPostRefDate(Boolean value) {
        this.isPostRefDate = value;
    }

}
