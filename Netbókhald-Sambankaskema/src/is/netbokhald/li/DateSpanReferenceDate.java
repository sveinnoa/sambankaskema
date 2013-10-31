
package is.netbokhald.li;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for DateSpanReferenceDate.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="DateSpanReferenceDate">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="DueDate"/>
 *     &lt;enumeration value="FinalDueDate"/>
 *     &lt;enumeration value="CancellationDate"/>
 *     &lt;enumeration value="CreationDate"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "DateSpanReferenceDate")
@XmlEnum
public enum DateSpanReferenceDate {


    /**
     * Gjalddagi er vi?mi?unardagsetning.
     * 
     */
    @XmlEnumValue("DueDate")
    DUE_DATE("DueDate"),

    /**
     * Eindagi er vi?mi?unardagsetning.
     * 
     */
    @XmlEnumValue("FinalDueDate")
    FINAL_DUE_DATE("FinalDueDate"),

    /**
     * Ni?urfellingardagur er vi?mi?unardagsetning.
     * 
     */
    @XmlEnumValue("CancellationDate")
    CANCELLATION_DATE("CancellationDate"),

    /**
     * Skr‡ningardagur er vi?mi?unardagsetning.
     * 
     */
    @XmlEnumValue("CreationDate")
    CREATION_DATE("CreationDate");
    private final String value;

    DateSpanReferenceDate(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static DateSpanReferenceDate fromValue(String v) {
        for (DateSpanReferenceDate c: DateSpanReferenceDate.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
