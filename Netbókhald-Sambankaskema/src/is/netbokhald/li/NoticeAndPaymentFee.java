
package is.netbokhald.li;

import java.math.BigDecimal;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * Gjald fyrir œtreikning og œtskrift grei?sluse?ils ‡samt sendingu hans til grei?anda.
 * 
 * <p>Java class for NoticeAndPaymentFee complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="NoticeAndPaymentFee">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Printing" type="{http://IcelandicOnlineBanking/2005/12/01/CommonTypes}Amount"/>
 *         &lt;element name="Paperless" type="{http://IcelandicOnlineBanking/2005/12/01/CommonTypes}Amount"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "NoticeAndPaymentFee", propOrder = {
    "printing",
    "paperless"
})
public class NoticeAndPaymentFee {

    @XmlElement(name = "Printing", required = true)
    protected BigDecimal printing;
    @XmlElement(name = "Paperless", required = true)
    protected BigDecimal paperless;

    /**
     * Gets the value of the printing property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getPrinting() {
        return printing;
    }

    /**
     * Sets the value of the printing property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setPrinting(BigDecimal value) {
        this.printing = value;
    }

    /**
     * Gets the value of the paperless property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getPaperless() {
        return paperless;
    }

    /**
     * Sets the value of the paperless property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setPaperless(BigDecimal value) {
        this.paperless = value;
    }

}
