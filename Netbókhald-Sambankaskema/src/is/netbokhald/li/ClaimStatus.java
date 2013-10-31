
package is.netbokhald.li;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ClaimStatus.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="ClaimStatus">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="Unpaid"/>
 *     &lt;enumeration value="Paid"/>
 *     &lt;enumeration value="Cancelled"/>
 *     &lt;enumeration value="SecondaryCollection"/>
 *     &lt;enumeration value="LegalCollection"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "ClaimStatus")
@XmlEnum
public enum ClaimStatus {


    /**
     * Innheimtukrafa er —greidd.
     * 
     */
    @XmlEnumValue("Unpaid")
    UNPAID("Unpaid"),

    /**
     * Innheimtukrafa hefur greidd a? fullu.
     * 
     */
    @XmlEnumValue("Paid")
    PAID("Paid"),

    /**
     * Innheimtukrafa hefur veri? felld ni?ur.
     * 
     */
    @XmlEnumValue("Cancelled")
    CANCELLED("Cancelled"),

    /**
     * Innheimtukrafan hefur veri? sett ’ milliinnheimtu.
     * 
     */
    @XmlEnumValue("SecondaryCollection")
    SECONDARY_COLLECTION("SecondaryCollection"),

    /**
     * Innheimtukrafa hefur veri? sett ’ lšgfr¾?iinnheimtu
     * 
     */
    @XmlEnumValue("LegalCollection")
    LEGAL_COLLECTION("LegalCollection");
    private final String value;

    ClaimStatus(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static ClaimStatus fromValue(String v) {
        for (ClaimStatus c: ClaimStatus.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
