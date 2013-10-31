
package is.netbokhald.li;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * Upphæ? afsláttar e?a vanskilagjalda.
 * 
 * Innihaldi? ætti a? fylgja í öllu skilgreiningu á ct:Amount. Takmarkanir tiltekinna XML tóla lei?a til ?ess a? skilyr?ingin er endurtekin, í sta?inn fyrir a? vísa? sé í fyrrgreinda skilgreiningu gegnum simpleContent undirtag.
 * 
 * <p>Java class for DiscountOrDefaultChargeAmount complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="DiscountOrDefaultChargeAmount">
 *   &lt;simpleContent>
 *     &lt;restriction base="&lt;http://IcelandicOnlineBanking/2005/12/01/ClaimTypes>DiscountOrDefaultChargeBase">
 *     &lt;/restriction>
 *   &lt;/simpleContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DiscountOrDefaultChargeAmount")
public class DiscountOrDefaultChargeAmount
    extends DiscountOrDefaultChargeBase
{


}
