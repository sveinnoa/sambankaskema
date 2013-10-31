
package is.netbokhald.li;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * Uppl?singar um ni?urstš?u a?ger?ar. Skila? er lista af innheimtukršfum og/e?a villum. Uppl?singar um prentun og beingrei?slu eiga a?eins vi? ?egar innheimtukrafa er stofnu?.
 * 
 * <p>Java class for ClaimOperationResult complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ClaimOperationResult">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ID" type="{http://IcelandicOnlineBanking/2005/12/01/CommonTypes}OperationID"/>
 *         &lt;element name="Status" type="{http://IcelandicOnlineBanking/2005/12/01/ClaimTypes}BatchStatus"/>
 *         &lt;element name="Success" type="{http://IcelandicOnlineBanking/2005/12/01/ClaimTypes}ClaimResult" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="Errors" type="{http://IcelandicOnlineBanking/2005/12/01/ClaimTypes}ClaimError" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ClaimOperationResult", propOrder = {
    "id",
    "status",
    "success",
    "errors"
})
public class ClaimOperationResult {

    @XmlElement(name = "ID", required = true)
    protected String id;
    @XmlElement(name = "Status", required = true)
    protected BatchStatus2 status;
    @XmlElement(name = "Success")
    protected List<ClaimResult> success;
    @XmlElement(name = "Errors")
    protected List<ClaimError> errors;

    /**
     * Gets the value of the id property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getID() {
        return id;
    }

    /**
     * Sets the value of the id property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setID(String value) {
        this.id = value;
    }

    /**
     * Gets the value of the status property.
     * 
     * @return
     *     possible object is
     *     {@link BatchStatus2 }
     *     
     */
    public BatchStatus2 getStatus() {
        return status;
    }

    /**
     * Sets the value of the status property.
     * 
     * @param value
     *     allowed object is
     *     {@link BatchStatus2 }
     *     
     */
    public void setStatus(BatchStatus2 value) {
        this.status = value;
    }

    /**
     * Gets the value of the success property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the success property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSuccess().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ClaimResult }
     * 
     * 
     */
    public List<ClaimResult> getSuccess() {
        if (success == null) {
            success = new ArrayList<ClaimResult>();
        }
        return this.success;
    }

    /**
     * Gets the value of the errors property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the errors property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getErrors().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ClaimError }
     * 
     * 
     */
    public List<ClaimError> getErrors() {
        if (errors == null) {
            errors = new ArrayList<ClaimError>();
        }
        return this.errors;
    }

}
