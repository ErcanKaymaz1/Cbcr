
package com.btc.xml.beans.base;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * Information in the message header identifies the Tax Administration that is sending the message.  It specifies when the message was created, what period (normally a year) the report is for, and the nature of the report (original, corrected, supplemental, etc).
 * 
 * <p>Java class for MessageSpec_Type complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="MessageSpec_Type"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="SendingEntityIN" type="{urn:oecd:ties:cbcstf:v5}StringMin1Max200_Type" minOccurs="0"/&gt;
 *         &lt;element name="TransmittingCountry" type="{urn:oecd:ties:isocbctypes:v1}CountryCode_Type"/&gt;
 *         &lt;element name="ReceivingCountry" type="{urn:oecd:ties:isocbctypes:v1}CountryCode_Type" maxOccurs="unbounded"/&gt;
 *         &lt;element name="MessageType" type="{urn:oecd:ties:cbc:v2}MessageType_EnumType"/&gt;
 *         &lt;element name="Language" type="{urn:oecd:ties:isocbctypes:v1}LanguageCode_Type" minOccurs="0"/&gt;
 *         &lt;element name="Warning" type="{urn:oecd:ties:cbcstf:v5}StringMin1Max4000_Type" minOccurs="0"/&gt;
 *         &lt;element name="Contact" type="{urn:oecd:ties:cbcstf:v5}StringMin1Max4000_Type" minOccurs="0"/&gt;
 *         &lt;element name="MessageRefId" type="{urn:oecd:ties:cbcstf:v5}StringMin1Max170_Type"/&gt;
 *         &lt;element name="MessageTypeIndic" type="{urn:oecd:ties:cbc:v2}CbcMessageTypeIndic_EnumType"/&gt;
 *         &lt;element name="CorrMessageRefId" type="{urn:oecd:ties:cbcstf:v5}StringMin1Max170_Type" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="ReportingPeriod" type="{http://www.w3.org/2001/XMLSchema}date"/&gt;
 *         &lt;element name="Timestamp" type="{http://www.w3.org/2001/XMLSchema}dateTime"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "MessageSpec_Type", namespace = "urn:oecd:ties:cbc:v2", propOrder = {
    "sendingEntityIN",
    "transmittingCountry",
    "receivingCountry",
    "messageType",
    "language",
    "warning",
    "contact",
    "messageRefId",
    "messageTypeIndic",
    "corrMessageRefId",
    "reportingPeriod",
    "timestamp"
})
public class MessageSpecType {

    @XmlElement(name = "SendingEntityIN", namespace = "urn:oecd:ties:cbc:v2")
    protected String sendingEntityIN;
    @XmlElement(name = "TransmittingCountry", namespace = "urn:oecd:ties:cbc:v2", required = true)
    @XmlSchemaType(name = "string")
    protected String transmittingCountry;
    @XmlElement(name = "ReceivingCountry", namespace = "urn:oecd:ties:cbc:v2", required = true)
    @XmlSchemaType(name = "string")
    protected String receivingCountry;
    @XmlElement(name = "MessageType", namespace = "urn:oecd:ties:cbc:v2", required = true)
    @XmlSchemaType(name = "string")
    protected String messageType;
    @XmlElement(name = "Language", namespace = "urn:oecd:ties:cbc:v2")
    @XmlSchemaType(name = "string")
    protected String language;
    @XmlElement(name = "Warning", namespace = "urn:oecd:ties:cbc:v2")
    protected String warning;
    @XmlElement(name = "Contact", namespace = "urn:oecd:ties:cbc:v2")
    protected String contact;
    @XmlElement(name = "MessageRefId", namespace = "urn:oecd:ties:cbc:v2", required = true)
    protected String messageRefId;
    @XmlElement(name = "MessageTypeIndic", namespace = "urn:oecd:ties:cbc:v2", required = true)
    @XmlSchemaType(name = "string")
    protected CbcMessageTypeIndicEnumType messageTypeIndic;
    @XmlElement(name = "CorrMessageRefId", namespace = "urn:oecd:ties:cbc:v2")
    protected List<String> corrMessageRefId;
    @XmlElement(name = "ReportingPeriod", namespace = "urn:oecd:ties:cbc:v2", required = true)
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar reportingPeriod;
    @XmlElement(name = "Timestamp", namespace = "urn:oecd:ties:cbc:v2", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar timestamp;

    /**
     * Gets the value of the sendingEntityIN property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSendingEntityIN() {
        return sendingEntityIN;
    }

    /**
     * Sets the value of the sendingEntityIN property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSendingEntityIN(String value) {
        this.sendingEntityIN = value;
    }

    /**
     * Gets the value of the transmittingCountry property.
     * 
     * @return
     *     possible object is
     *     {@link CountryCodeType }
     *     
     */
    public String getTransmittingCountry() {
        return transmittingCountry;
    }

    /**
     * Sets the value of the transmittingCountry property.
     * 
     * @param value
     *     allowed object is
     *     {@link CountryCodeType }
     *     
     */
    public void setTransmittingCountry(String value) {
        this.transmittingCountry = value;
    }

    /**
     * Gets the value of the receivingCountry property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the receivingCountry property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getReceivingCountry().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CountryCodeType }
     * 
     * 
     */
    public String getReceivingCountry() {
        
        return receivingCountry;
    }
    

    public void setReceivingCountry(String receivingCountry) {
		this.receivingCountry = receivingCountry;
	}

	public void setCorrMessageRefId(List<String> corrMessageRefId) {
		this.corrMessageRefId = corrMessageRefId;
	}

	/**
     * Gets the value of the messageType property.
     * 
     * @return
     *     possible object is
     *     {@link MessageTypeEnumType }
     *     
     */
    public String getMessageType() {
        return messageType;
    }

    /**
     * Sets the value of the messageType property.
     * 
     * @param value
     *     allowed object is
     *     {@link MessageTypeEnumType }
     *     
     */
    public void setMessageType(String value) {
        this.messageType = value;
    }

    /**
     * Gets the value of the language property.
     * 
     * @return
     *     possible object is
     *     {@link LanguageCodeType }
     *     
     */
    public String getLanguage() {
        return language;
    }

    /**
     * Sets the value of the language property.
     * 
     * @param string
     *     allowed object is
     *     {@link LanguageCodeType }
     *     
     */
    public void setLanguage(String string) {
        this.language = string;
    }

    /**
     * Gets the value of the warning property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getWarning() {
        return warning;
    }

    /**
     * Sets the value of the warning property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setWarning(String value) {
        this.warning = value;
    }

    /**
     * Gets the value of the contact property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getContact() {
        return contact;
    }

    /**
     * Sets the value of the contact property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setContact(String value) {
        this.contact = value;
    }

    /**
     * Gets the value of the messageRefId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMessageRefId() {
        return messageRefId;
    }

    /**
     * Sets the value of the messageRefId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMessageRefId(String value) {
        this.messageRefId = value;
    }

    /**
     * Gets the value of the messageTypeIndic property.
     * 
     * @return
     *     possible object is
     *     {@link CbcMessageTypeIndicEnumType }
     *     
     */
    public CbcMessageTypeIndicEnumType getMessageTypeIndic() {
        return messageTypeIndic;
    }

    /**
     * Sets the value of the messageTypeIndic property.
     * 
     * @param value
     *     allowed object is
     *     {@link CbcMessageTypeIndicEnumType }
     *     
     */
    public void setMessageTypeIndic(CbcMessageTypeIndicEnumType value) {
        this.messageTypeIndic = value;
    }

    /**
     * Gets the value of the corrMessageRefId property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the corrMessageRefId property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCorrMessageRefId().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getCorrMessageRefId() {
        if (corrMessageRefId == null) {
            corrMessageRefId = new ArrayList<String>();
        }
        return this.corrMessageRefId;
    }

    /**
     * Gets the value of the reportingPeriod property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getReportingPeriod() {
        return reportingPeriod;
    }

    /**
     * Sets the value of the reportingPeriod property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setReportingPeriod(XMLGregorianCalendar value) {
        this.reportingPeriod = value;
    }

    /**
     * Gets the value of the timestamp property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getTimestamp() {
        return timestamp;
    }

    /**
     * Sets the value of the timestamp property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setTimestamp(XMLGregorianCalendar value) {
        this.timestamp = value;
    }

}
