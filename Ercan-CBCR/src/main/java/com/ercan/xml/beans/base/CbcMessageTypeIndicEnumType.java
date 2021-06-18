
package com.btc.xml.beans.base;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CbcMessageTypeIndic_EnumType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="CbcMessageTypeIndic_EnumType"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="CBC401"/&gt;
 *     &lt;enumeration value="CBC402"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "CbcMessageTypeIndic_EnumType", namespace = "urn:oecd:ties:cbc:v2")
@XmlEnum
public enum CbcMessageTypeIndicEnumType {


    /**
     * The message contains new information
     * 
     */
    @XmlEnumValue("CBC401")
    CBC_401("CBC401"),

    /**
     * The message contains corrections for previously sent information
     * 
     */
    @XmlEnumValue("CBC402")
    CBC_402("CBC402");
    private final String value;

    CbcMessageTypeIndicEnumType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static CbcMessageTypeIndicEnumType fromValue(String v) {
        for (CbcMessageTypeIndicEnumType c: CbcMessageTypeIndicEnumType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
