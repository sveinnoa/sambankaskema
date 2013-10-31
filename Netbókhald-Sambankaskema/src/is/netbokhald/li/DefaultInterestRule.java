
package is.netbokhald.li;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for DefaultInterestRule.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="DefaultInterestRule">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="NoDefaultInterest"/>
 *     &lt;enumeration value="DefaultInterestAmount"/>
 *     &lt;enumeration value="DefaultInterestAmountAndDefaultCharge"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "DefaultInterestRule")
@XmlEnum
public enum DefaultInterestRule {


    /**
     * Engir dr‡ttarvextir skulu vera ‡ kršfu.
     * 
     */
    @XmlEnumValue("NoDefaultInterest")
    NO_DEFAULT_INTEREST("NoDefaultInterest"),

    /**
     * Segir til um a? dr‡ttarvextir reiknast œt fr‡ upph¾? kršfu.
     * 
     */
    @XmlEnumValue("DefaultInterestAmount")
    DEFAULT_INTEREST_AMOUNT("DefaultInterestAmount"),

    /**
     * Segir til um hvort dr‡ttarvextir reiknast œt fr‡ upph¾? og vanskilagjaldi kršfu.
     * 
     */
    @XmlEnumValue("DefaultInterestAmountAndDefaultCharge")
    DEFAULT_INTEREST_AMOUNT_AND_DEFAULT_CHARGE("DefaultInterestAmountAndDefaultCharge");
    private final String value;

    DefaultInterestRule(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static DefaultInterestRule fromValue(String v) {
        for (DefaultInterestRule c: DefaultInterestRule.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
