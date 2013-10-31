
package is.netbokhald.li;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * Wrapper fyrir mismunandi sendingarform ‡ kvittunum
 * 
 * <p>Java class for Communication complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Communication">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="PostalMail" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;extension base="{http://IcelandicOnlineBanking/2005/12/01/PaymentTypes}Receipt">
 *                 &lt;choice>
 *                   &lt;element name="ReceiverAddress" type="{http://IcelandicOnlineBanking/2005/12/01/CommonTypes}Address"/>
 *                   &lt;element name="UsePersonID" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *                 &lt;/choice>
 *               &lt;/extension>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="EMail" maxOccurs="3" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;extension base="{http://IcelandicOnlineBanking/2005/12/01/PaymentTypes}Receipt">
 *                 &lt;sequence>
 *                   &lt;element name="EmailAddress" type="{http://IcelandicOnlineBanking/2005/12/01/CommonTypes}Email"/>
 *                 &lt;/sequence>
 *               &lt;/extension>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="SMS" maxOccurs="3" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;extension base="{http://IcelandicOnlineBanking/2005/12/01/PaymentTypes}Receipt">
 *                 &lt;sequence>
 *                   &lt;element name="PhoneNumber" type="{http://IcelandicOnlineBanking/2005/12/01/CommonTypes}PhoneNumber"/>
 *                 &lt;/sequence>
 *               &lt;/extension>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Communication", namespace = "http://IcelandicOnlineBanking/2005/12/01/PaymentTypes", propOrder = {
    "postalMail",
    "eMail",
    "sms"
})
public class Communication {

    @XmlElement(name = "PostalMail")
    protected Communication.PostalMail postalMail;
    @XmlElement(name = "EMail")
    protected List<Communication.EMail> eMail;
    @XmlElement(name = "SMS")
    protected List<Communication.SMS> sms;

    /**
     * Gets the value of the postalMail property.
     * 
     * @return
     *     possible object is
     *     {@link Communication.PostalMail }
     *     
     */
    public Communication.PostalMail getPostalMail() {
        return postalMail;
    }

    /**
     * Sets the value of the postalMail property.
     * 
     * @param value
     *     allowed object is
     *     {@link Communication.PostalMail }
     *     
     */
    public void setPostalMail(Communication.PostalMail value) {
        this.postalMail = value;
    }

    /**
     * Gets the value of the eMail property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the eMail property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getEMail().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Communication.EMail }
     * 
     * 
     */
    public List<Communication.EMail> getEMail() {
        if (eMail == null) {
            eMail = new ArrayList<Communication.EMail>();
        }
        return this.eMail;
    }

    /**
     * Gets the value of the sms property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the sms property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSMS().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Communication.SMS }
     * 
     * 
     */
    public List<Communication.SMS> getSMS() {
        if (sms == null) {
            sms = new ArrayList<Communication.SMS>();
        }
        return this.sms;
    }


    /**
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;extension base="{http://IcelandicOnlineBanking/2005/12/01/PaymentTypes}Receipt">
     *       &lt;sequence>
     *         &lt;element name="EmailAddress" type="{http://IcelandicOnlineBanking/2005/12/01/CommonTypes}Email"/>
     *       &lt;/sequence>
     *     &lt;/extension>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "emailAddress"
    })
    public static class EMail
        extends Receipt
    {

        @XmlElement(name = "EmailAddress", namespace = "http://IcelandicOnlineBanking/2005/12/01/PaymentTypes", required = true)
        protected String emailAddress;

        /**
         * Gets the value of the emailAddress property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getEmailAddress() {
            return emailAddress;
        }

        /**
         * Sets the value of the emailAddress property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setEmailAddress(String value) {
            this.emailAddress = value;
        }

    }


    /**
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;extension base="{http://IcelandicOnlineBanking/2005/12/01/PaymentTypes}Receipt">
     *       &lt;choice>
     *         &lt;element name="ReceiverAddress" type="{http://IcelandicOnlineBanking/2005/12/01/CommonTypes}Address"/>
     *         &lt;element name="UsePersonID" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
     *       &lt;/choice>
     *     &lt;/extension>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "receiverAddress",
        "usePersonID"
    })
    public static class PostalMail
        extends Receipt
    {

        @XmlElement(name = "ReceiverAddress", namespace = "http://IcelandicOnlineBanking/2005/12/01/PaymentTypes")
        protected Address receiverAddress;
        @XmlElement(name = "UsePersonID", namespace = "http://IcelandicOnlineBanking/2005/12/01/PaymentTypes")
        protected Boolean usePersonID;

        /**
         * Gets the value of the receiverAddress property.
         * 
         * @return
         *     possible object is
         *     {@link Address }
         *     
         */
        public Address getReceiverAddress() {
            return receiverAddress;
        }

        /**
         * Sets the value of the receiverAddress property.
         * 
         * @param value
         *     allowed object is
         *     {@link Address }
         *     
         */
        public void setReceiverAddress(Address value) {
            this.receiverAddress = value;
        }

        /**
         * Gets the value of the usePersonID property.
         * 
         * @return
         *     possible object is
         *     {@link Boolean }
         *     
         */
        public Boolean isUsePersonID() {
            return usePersonID;
        }

        /**
         * Sets the value of the usePersonID property.
         * 
         * @param value
         *     allowed object is
         *     {@link Boolean }
         *     
         */
        public void setUsePersonID(Boolean value) {
            this.usePersonID = value;
        }

    }


    /**
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;extension base="{http://IcelandicOnlineBanking/2005/12/01/PaymentTypes}Receipt">
     *       &lt;sequence>
     *         &lt;element name="PhoneNumber" type="{http://IcelandicOnlineBanking/2005/12/01/CommonTypes}PhoneNumber"/>
     *       &lt;/sequence>
     *     &lt;/extension>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "phoneNumber"
    })
    public static class SMS
        extends Receipt
    {

        @XmlElement(name = "PhoneNumber", namespace = "http://IcelandicOnlineBanking/2005/12/01/PaymentTypes", required = true)
        protected PhoneNumber phoneNumber;

        /**
         * Gets the value of the phoneNumber property.
         * 
         * @return
         *     possible object is
         *     {@link PhoneNumber }
         *     
         */
        public PhoneNumber getPhoneNumber() {
            return phoneNumber;
        }

        /**
         * Sets the value of the phoneNumber property.
         * 
         * @param value
         *     allowed object is
         *     {@link PhoneNumber }
         *     
         */
        public void setPhoneNumber(PhoneNumber value) {
            this.phoneNumber = value;
        }

    }

}
