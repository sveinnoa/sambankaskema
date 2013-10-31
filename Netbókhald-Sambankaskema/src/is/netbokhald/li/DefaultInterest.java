
package is.netbokhald.li;

import java.math.BigDecimal;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * Dr‡ttarvextir
 * 
 * <p>Java class for DefaultInterest complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="DefaultInterest">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Rule" type="{http://IcelandicOnlineBanking/2005/12/01/ClaimTypes}DefaultInterestRule"/>
 *         &lt;element name="Percentage4" type="{http://IcelandicOnlineBanking/2005/12/01/CommonTypes}Percentage4" minOccurs="0"/>
 *         &lt;element name="SpecialCode" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;pattern value="[2-9A-A]"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DefaultInterest", propOrder = {
    "rule",
    "percentage4",
    "specialCode"
})
public class DefaultInterest {

    @XmlElement(name = "Rule", required = true)
    protected DefaultInterestRule rule;
    @XmlElement(name = "Percentage4")
    protected BigDecimal percentage4;
    @XmlElement(name = "SpecialCode")
    protected String specialCode;

    /**
     * Gets the value of the rule property.
     * 
     * @return
     *     possible object is
     *     {@link DefaultInterestRule }
     *     
     */
    public DefaultInterestRule getRule() {
        return rule;
    }

    /**
     * Sets the value of the rule property.
     * 
     * @param value
     *     allowed object is
     *     {@link DefaultInterestRule }
     *     
     */
    public void setRule(DefaultInterestRule value) {
        this.rule = value;
    }

    /**
     * Gets the value of the percentage4 property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getPercentage4() {
        return percentage4;
    }

    /**
     * Sets the value of the percentage4 property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setPercentage4(BigDecimal value) {
        this.percentage4 = value;
    }

    /**
     * Gets the value of the specialCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSpecialCode() {
        return specialCode;
    }

    /**
     * Sets the value of the specialCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSpecialCode(String value) {
        this.specialCode = value;
    }

}
