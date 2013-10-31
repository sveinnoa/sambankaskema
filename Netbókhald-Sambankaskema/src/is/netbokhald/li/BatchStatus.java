
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
 *     &lt;enumeration value="Cancelled"/>
 *     &lt;enumeration value="OnHold"/>
 *     &lt;enumeration value="NotConfirmed"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "BatchStatus", namespace = "http://IcelandicOnlineBanking/2005/12/01/PaymentTypes")
@XmlEnum
public enum BatchStatus {


    /**
     * Grei?slubunki er ’ vinnslu hj‡ banka.
     * 
     */
    @XmlEnumValue("InProgress")
    IN_PROGRESS("InProgress"),

    /**
     * Afgrei?slu ‡ grei?slubunka loki?
     * 
     */
    @XmlEnumValue("Completed")
    COMPLETED("Completed"),

    /**
     * Grei?slubunki hefur veri? afgreiddur, en ein e?a fleiri grei?slur hafa lent ‡ villu
     * 
     */
    @XmlEnumValue("CompletedWithErrors")
    COMPLETED_WITH_ERRORS("CompletedWithErrors"),

    /**
     * ?egar bunki hefur fari? ’ stš?una —sta?festur og notandi h¾ttir vi? a? sta?festa hann t.d. ’ vi?m—ti netbanka f¾r bunkinn ?essa stš?u.
     * 
     */
    @XmlEnumValue("Cancelled")
    CANCELLED("Cancelled"),

    /**
     * Grei?slubunki b’?ur ?ess a? vera framkv¾mdur ?ar sem vali? hefur veri? a? framkv¾ma hann fram ’ t’manum
     * 
     */
    @XmlEnumValue("OnHold")
    ON_HOLD("OnHold"),

    /**
     * îsta?festur bunki, b’?ur eftir a? ver?a sta?festur handvirkt ’ t.d. netbanka.
     * 
     */
    @XmlEnumValue("NotConfirmed")
    NOT_CONFIRMED("NotConfirmed");
    private final String value;

    BatchStatus(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static BatchStatus fromValue(String v) {
        for (BatchStatus c: BatchStatus.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
