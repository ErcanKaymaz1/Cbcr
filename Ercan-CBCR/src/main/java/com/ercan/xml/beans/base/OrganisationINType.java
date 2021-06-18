
package com.btc.xml.beans.base;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.XmlValue;


/**
 * This is the identification number/identification code for the Entity in question. As the identifier may be not strictly numeric, it is just defined as a string of characters. Attribute 'issuedBy' is required to designate the issuer of the identifier.  Attribute 'INType' defines the type of identification number. 
 * 
 * <p>Java class for OrganisationIN_Type complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="OrganisationIN_Type"&gt;
 *   &lt;simpleContent&gt;
 *     &lt;extension base="&lt;urn:oecd:ties:cbcstf:v5&gt;StringMin1Max200_Type"&gt;
 *       &lt;attribute name="issuedBy" type="{urn:oecd:ties:isocbctypes:v1}CountryCode_Type" /&gt;
 *       &lt;attribute name="INType" type="{urn:oecd:ties:cbcstf:v5}StringMin1Max200_Type" /&gt;
 *     &lt;/extension&gt;
 *   &lt;/simpleContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "OrganisationIN_Type", namespace = "urn:oecd:ties:cbc:v2", propOrder = {
    "value"
})
public class OrganisationINType {

    @XmlValue
    protected String value;
    @XmlAttribute(name = "issuedBy")
    protected String issuedBy;
    @XmlAttribute(name = "INType")
    protected String inType;

    /**
     * Defines a string with minimum length 1 and maximum length of 200
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getValue() {
        return value;
    }

    /**
     * Sets the value of the value property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setValue(String value) {
        this.value = value;
    }

    /**
     * Gets the value of the issuedBy property.
     * 
     * @return
     *     possible object is
     *     {@link CountryCodeType }
     *     
     */
    public String getIssuedBy() {
        return issuedBy;
    }

    /**
     * Sets the value of the issuedBy property.
     * 
     * @param string
     *     allowed object is
     *     {@link CountryCodeType }
     *     
     */
    public void setIssuedBy(String string) {
        this.issuedBy = string;
    }

    /**
     * Gets the value of the inType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getINType() {
        return inType;
    }

    /**
     * Sets the value of the inType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setINType(String value) {
        this.inType = value;
    }

}
