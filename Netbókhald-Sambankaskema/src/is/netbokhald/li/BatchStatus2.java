
package is.netbokhald.li;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for BatchStatus.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="BatchStatus">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="InProgress"/>
 *     &lt;enumeration value="Completed"/>
 *     &lt;enumeration value="CompletedWithErrors"/>
 *     &lt;enumeration value="NotConfirmed"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "BatchStatus")
@XmlEnum
public enum BatchStatus2 {


    /**
     * Bunkinn er ’ vinnslu.
     * 
     */
    @XmlEnumValue("InProgress")
    IN_PROGRESS("InProgress"),

    /**
     * Vinnslu ‡ bunka er loki? ‡n villu.
     * 
     */
    @XmlEnumValue("Completed")
    COMPLETED("Completed"),

    /**
     * Vinnslu ‡ bunka er loki?. Villa hefur komi? upp.
     * 
     */
    @XmlEnumValue("CompletedWithErrors")
    COMPLETED_WITH_ERRORS("CompletedWithErrors"),

    /**
     * îsta?festur bunki, b’?ur eftir a? ver?a sta?festur handvirkt.
     * 
     */
    @XmlEnumValue("NotConfirmed")
    NOT_CONFIRMED("NotConfirmed");
    private final String value;

    BatchStatus2(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static BatchStatus2 fromValue(String v) {
        for (BatchStatus2 c: BatchStatus2 .values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
