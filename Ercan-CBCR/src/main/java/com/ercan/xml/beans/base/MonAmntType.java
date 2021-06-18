
package com.btc.xml.beans.base;

import java.math.BigInteger;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.XmlValue;


/**
 * 
 * This data type is to be used whenever monetary amounts are to be communicated.  Such amounts shall be given in full units, i.e. without decimals.  The code for the currency in which the value is expressed has to be
 * taken from the ISO codelist 4217 and added in attribute currCode.
 * 
 * 
 * <p>Java class for MonAmnt_Type complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="MonAmnt_Type"&gt;
 *   &lt;simpleContent&gt;
 *     &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema&gt;integer"&gt;
 *       &lt;attribute name="currCode" use="required" type="{urn:oecd:ties:isocbctypes:v1}currCode_Type" /&gt;
 *     &lt;/extension&gt;
 *   &lt;/simpleContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "MonAmnt_Type", namespace = "urn:oecd:ties:cbc:v2", propOrder = {
    "value"
})
public class MonAmntType {

    @XmlValue
    protected int value;
    @XmlAttribute(name = "currCode", required = true)
    protected String currCode;

    /**
     * Gets the value of the value property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public int getValue() {
        return value;
    }

    /**
     * Sets the value of the value property.
     * 
     * @param d
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setValue(int d) {
        this.value = d;
    }

    /**
     * Gets the value of the currCode property.
     * 
     * @return
     *     possible object is
     *     {@link CurrCodeType }
     *     
     */
    public String getCurrCode() {
        return currCode;
    }

    /**
     * Sets the value of the currCode property.
     * 
     * @param string
     *     allowed object is
     *     {@link CurrCodeType }
     *     
     */
    public void setCurrCode(String string) {
        this.currCode = string;
    }

}
