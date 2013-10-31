
package is.netbokhald.li;

import java.util.ArrayList;
import java.util.List;
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
 *         &lt;element name="currencyRates" type="{http://IcelandicOnlineBanking/2005/12/01/CommonTypes}CurrencyRate" maxOccurs="unbounded" minOccurs="0"/>
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
    "currencyRates"
})
@XmlRootElement(name = "CurrencyRateResponse", namespace = "http://IcelandicOnlineBanking/2005/12/01/Statements")
public class CurrencyRateResponse {

    @XmlElement(namespace = "http://IcelandicOnlineBanking/2005/12/01/Statements")
    protected List<CurrencyRate> currencyRates;

    /**
     * Gets the value of the currencyRates property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the currencyRates property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCurrencyRates().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CurrencyRate }
     * 
     * 
     */
    public List<CurrencyRate> getCurrencyRates() {
        if (currencyRates == null) {
            currencyRates = new ArrayList<CurrencyRate>();
        }
        return this.currencyRates;
    }

}
