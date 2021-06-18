
package com.btc.xml.beans.base;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.XmlValue;


/**
 * Defines a string with minimum length 1 and maximum length of 4000, with the Language attribute
 * 
 * <p>Java class for StringMin1Max4000WithLang_Type complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="StringMin1Max4000WithLang_Type"&gt;
 *   &lt;simpleContent&gt;
 *     &lt;extension base="&lt;urn:oecd:ties:cbcstf:v5&gt;StringMin1Max4000_Type"&gt;
 *       &lt;attribute name="language" type="{urn:oecd:ties:isocbctypes:v1}LanguageCode_Type" /&gt;
 *     &lt;/extension&gt;
 *   &lt;/simpleContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "StringMin1Max4000WithLang_Type", namespace = "urn:oecd:ties:cbcstf:v5", propOrder = {
    "value"
})
public class StringMin1Max4000WithLangType {

    @XmlValue
    protected String value;
    @XmlAttribute(name = "language")
    protected LanguageCodeType language;

    /**
     * Defines a string with minimum length 1 and maximum length of 4000
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
     * Gets the value of the language property.
     * 
     * @return
     *     possible object is
     *     {@link LanguageCodeType }
     *     
     */
    public LanguageCodeType getLanguage() {
        return language;
    }

    /**
     * Sets the value of the language property.
     * 
     * @param value
     *     allowed object is
     *     {@link LanguageCodeType }
     *     
     */
    public void setLanguage(LanguageCodeType value) {
        this.language = value;
    }

}
