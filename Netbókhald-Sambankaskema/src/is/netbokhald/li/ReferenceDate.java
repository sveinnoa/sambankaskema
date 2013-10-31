
package is.netbokhald.li;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ReferenceDate.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="ReferenceDate">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="DueDate"/>
 *     &lt;enumeration value="FinalDueDate"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "ReferenceDate")
@XmlEnum
public enum ReferenceDate {


    /**
     * Gjalddagi er vi?mi?unardagur.
     * 
     */
    @XmlEnumValue("DueDate")
    DUE_DATE("DueDate"),

    /**
     * Eindagi er vi?mi?unardagur.
     * 
     */
    @XmlEnumValue("FinalDueDate")
    FINAL_DUE_DATE("FinalDueDate");
    private final String value;

    ReferenceDate(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static ReferenceDate fromValue(String v) {
        for (ReferenceDate c: ReferenceDate.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
