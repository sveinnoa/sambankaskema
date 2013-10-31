
package is.netbokhald.li;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CurrencyType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="CurrencyType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="NoteRate"/>
 *     &lt;enumeration value="ExchangeRate"/>
 *     &lt;enumeration value="CustomsRate"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "CurrencyType", namespace = "http://IcelandicOnlineBanking/2005/12/01/CommonTypes")
@XmlEnum
public enum CurrencyType {

    @XmlEnumValue("NoteRate")
    NOTE_RATE("NoteRate"),
    @XmlEnumValue("ExchangeRate")
    EXCHANGE_RATE("ExchangeRate"),
    @XmlEnumValue("CustomsRate")
    CUSTOMS_RATE("CustomsRate");
    private final String value;

    CurrencyType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static CurrencyType fromValue(String v) {
        for (CurrencyType c: CurrencyType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
