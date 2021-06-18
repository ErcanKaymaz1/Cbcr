
package com.btc.xml.beans.base;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="MessageSpec" type="{urn:oecd:ties:cbc:v2}MessageSpec_Type"/&gt;
 *         &lt;element name="CbcBody" type="{urn:oecd:ties:cbc:v2}CbcBody_Type" maxOccurs="unbounded"/&gt;
 *       &lt;/sequence&gt;
 *       &lt;attribute name="version" type="{urn:oecd:ties:cbcstf:v5}StringMin1Max10_Type" /&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "messageSpec",
    "cbcBody"
})
@XmlRootElement(name = "CBC_OECD", namespace = "urn:oecd:ties:cbc:v2")
public class CBCOECD {

    @XmlElement(name = "MessageSpec", namespace = "urn:oecd:ties:cbc:v2", required = true)
    protected MessageSpecType messageSpec;
    @XmlElement(name = "CbcBody", namespace = "urn:oecd:ties:cbc:v2", required = true)
    protected CbcBodyType cbcBody;
    @XmlAttribute(name = "version")
    protected String version="2.0";
    @XmlAttribute(name="schemaLocation" , namespace = "http://www.w3.org/2001/XMLSchema-instance")
    protected String schemaLocation="urn:oecd:ties:cbc:v2 CbcXML_v2.0.xsd";
    /**
     * Gets the value of the messageSpec property.
     * 
     * @return
     *     possible object is
     *     {@link MessageSpecType }
     *     
     */
    public MessageSpecType getMessageSpec() {
        return messageSpec;
    }

    /**
     * Sets the value of the messageSpec property.
     * 
     * @param value
     *     allowed object is
     *     {@link MessageSpecType }
     *     
     */
    public void setMessageSpec(MessageSpecType value) {
        this.messageSpec = value;
    }

    /**
     * Gets the value of the cbcBody property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the cbcBody property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCbcBody().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CbcBodyType }
     * 
     * 
     */
    public CbcBodyType getCbcBody() {
        
        return cbcBody;
    }
    

    public void setCbcBody(CbcBodyType cbcBody) {
		this.cbcBody = cbcBody;
	}

	/**
     * Gets the value of the version property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVersion() {
        return version;
    }

    /**
     * Sets the value of the version property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVersion(String value) {
        this.version = value;
    }

}
