
package is.netbokhald.li;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for PrintInformation.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="PrintInformation">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="NoInformation"/>
 *     &lt;enumeration value="Print"/>
 *     &lt;enumeration value="DirectPaymentClaim"/>
 *     &lt;enumeration value="InternetBankingClaim"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "PrintInformation")
@XmlEnum
public enum PrintInformation {


    /**
     * Engum uppl?singum um prentun er skila?, einkum ?egar innheimtukršfum er breytt e?a eytt.
     * 
     */
    @XmlEnumValue("NoInformation")
    NO_INFORMATION("NoInformation"),

    /**
     * Prenta ‡ innheimtukršfuna, hj‡ kršfuhafa e?a banka eftir ?v’ sem um hefur samist milli ?eirra.
     * 
     */
    @XmlEnumValue("Print")
    PRINT("Print"),

    /**
     * Beingrei?slukrafa, sem kršfugrei?andi hefur sami? um vi? bankastofnun a? grei?ist ‡ gjalddaga œt af tilgreindum reikningi.
     * 
     */
    @XmlEnumValue("DirectPaymentClaim")
    DIRECT_PAYMENT_CLAIM("DirectPaymentClaim"),

    /**
     * Netkrafa, sem kršfugrei?anda vill a? birtist ’ netbanka en er ekki prentu? œt.
     * 
     */
    @XmlEnumValue("InternetBankingClaim")
    INTERNET_BANKING_CLAIM("InternetBankingClaim");
    private final String value;

    PrintInformation(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static PrintInformation fromValue(String v) {
        for (PrintInformation c: PrintInformation.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
