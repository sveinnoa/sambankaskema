
package is.netbokhald.li;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * Pr�senta fyrir vanskilagjald e?a afsl�tt
 * 
 * Innihaldi? �tti a? fylgja � �llu skilgreiningu � ct:Percentage2. Takmarkanir tiltekinna XML t�la lei?a til ?ess a? skilyr?ingin er endurtekin, � sta?inn fyrir a? v�sa? s� � fyrrgreinda skilgreiningu gegnum simpleContent undirtag.
 * 
 * <p>Java class for DiscountOrDefaultChargePercentage complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="DiscountOrDefaultChargePercentage">
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
@XmlType(name = "DiscountOrDefaultChargePercentage")
public class DiscountOrDefaultChargePercentage
    extends DiscountOrDefaultChargeBase
{


}
