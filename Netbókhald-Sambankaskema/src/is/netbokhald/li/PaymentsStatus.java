
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
     * Einungis f� uppl?singar um st�?u bunkans, ekki f� lista yfir f�rslur
     * 
     */
    @XmlEnumValue("GetStatus")
    GET_STATUS("GetStatus"),

    /**
     * Einungis s�kja f�rlsur sem hafa lent � villu.
     * 
     */
    @XmlEnumValue("GetErrors")
    GET_ERRORS("GetErrors"),

    /**
     * Einungis s�kja f�rslur sem hafa gengi? � gegn villulaust
     * 
     */
    @XmlEnumValue("GetOkay")
    GET_OKAY("GetOkay"),

    /**
     * S�kja allar f�rslur, b�?i ?�r sem heppnu?ust og ?�r sem lent hafa � villu
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
