
package is.netbokhald.li;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * Nota? fyrir vanskilagjald og grunnur a? afsl‡ttum.
 * 
 * <p>Java class for DateRestrictedCharge complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="DateRestrictedCharge">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="First" type="{http://IcelandicOnlineBanking/2005/12/01/ClaimTypes}DiscountOrDefaultChargeBase" minOccurs="0"/>
 *         &lt;element name="Second" type="{http://IcelandicOnlineBanking/2005/12/01/ClaimTypes}DiscountOrDefaultChargeBase" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="ReferenceDate" use="required" type="{http://IcelandicOnlineBanking/2005/12/01/ClaimTypes}ReferenceDate" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DateRestrictedCharge", propOrder = {
    "first",
    "second"
})
@XmlSeeAlso({
    DiscountCharge.class
})
public class DateRestrictedCharge {

    @XmlElement(name = "First")
    protected DiscountOrDefaultChargeBase first;
    @XmlElement(name = "Second")
    protected DiscountOrDefaultChargeBase second;
    @XmlAttribute(name = "ReferenceDate", required = true)
    protected ReferenceDate referenceDate;

    /**
     * Gets the value of the first property.
     * 
     * @return
     *     possible object is
     *     {@link DiscountOrDefaultChargeBase }
     *     
     */
    public DiscountOrDefaultChargeBase getFirst() {
        return first;
    }

    /**
     * Sets the value of the first property.
     * 
     * @param value
     *     allowed object is
     *     {@link DiscountOrDefaultChargeBase }
     *     
     */
    public void setFirst(DiscountOrDefaultChargeBase value) {
        this.first = value;
    }

    /**
     * Gets the value of the second property.
     * 
     * @return
     *     possible object is
     *     {@link DiscountOrDefaultChargeBase }
     *     
     */
    public DiscountOrDefaultChargeBase getSecond() {
        return second;
    }

    /**
     * Sets the value of the second property.
     * 
     * @param value
     *     allowed object is
     *     {@link DiscountOrDefaultChargeBase }
     *     
     */
    public void setSecond(DiscountOrDefaultChargeBase value) {
        this.second = value;
    }

    /**
     * Gets the value of the referenceDate property.
     * 
     * @return
     *     possible object is
     *     {@link ReferenceDate }
     *     
     */
    public ReferenceDate getReferenceDate() {
        return referenceDate;
    }

    /**
     * Sets the value of the referenceDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link ReferenceDate }
     *     
     */
    public void setReferenceDate(ReferenceDate value) {
        this.referenceDate = value;
    }

}
