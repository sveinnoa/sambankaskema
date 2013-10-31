
package is.netbokhald.li;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for PaymentsStatus.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="PaymentsStatus">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="GetStatus"/>
 *     &lt;enumeration value="GetErrors"/>
 *     &lt;enumeration value="GetOkay"/>
 *     &lt;enumeration value="GetAll"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "PaymentsStatus", namespace = "http://IcelandicOnlineBanking/2005/12/01/PaymentTypes")
@XmlEnum
public enum PaymentsStatus {


    /**
     * Einungis f‡ uppl?singar um stš?u bunkans, ekki f‡ lista yfir f¾rslur
     * 
     */
    @XmlEnumValue("GetStatus")
    GET_STATUS("GetStatus"),

    /**
     * Einungis s¾kja f¾rlsur sem hafa lent ‡ villu.
     * 
     */
    @XmlEnumValue("GetErrors")
    GET_ERRORS("GetErrors"),

    /**
     * Einungis s¾kja f¾rslur sem hafa gengi? ’ gegn villulaust
     * 
     */
    @XmlEnumValue("GetOkay")
    GET_OKAY("GetOkay"),

    /**
     * S¾kja allar f¾rslur, b¾?i ?¾r sem heppnu?ust og ?¾r sem lent hafa ‡ villu
     * 
     */
    @XmlEnumValue("GetAll")
    GET_ALL("GetAll");
    private final String value;

    PaymentsStatus(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static PaymentsStatus fromValue(String v) {
        for (PaymentsStatus c: PaymentsStatus.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
