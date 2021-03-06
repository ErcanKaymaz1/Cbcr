
package com.btc.xml.beans.base;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for OECDDocTypeIndic_EnumType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="OECDDocTypeIndic_EnumType"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="OECD0"/&gt;
 *     &lt;enumeration value="OECD1"/&gt;
 *     &lt;enumeration value="OECD2"/&gt;
 *     &lt;enumeration value="OECD3"/&gt;
 *     &lt;enumeration value="OECD10"/&gt;
 *     &lt;enumeration value="OECD11"/&gt;
 *     &lt;enumeration value="OECD12"/&gt;
 *     &lt;enumeration value="OECD13"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "OECDDocTypeIndic_EnumType", namespace = "urn:oecd:ties:cbcstf:v5")
@XmlEnum
public enum OECDDocTypeIndicEnumType {


    /**
     * Resent Data
     * 
     */
    @XmlEnumValue("OECD0")
    OECD_0("OECD0"),

    /**
     * New Data
     * 
     */
    @XmlEnumValue("OECD1")
    OECD_1("OECD1"),

    /**
     * Corrected Data
     * 
     */
    @XmlEnumValue("OECD2")
    OECD_2("OECD2"),

    /**
     * Deletion of Data
     * 
     */
    @XmlEnumValue("OECD3")
    OECD_3("OECD3"),

    /**
     * Resent Test Data
     * 
     */
    @XmlEnumValue("OECD10")
    OECD_10("OECD10"),

    /**
     * New Test Data
     * 
     */
    @XmlEnumValue("OECD11")
    OECD_11("OECD11"),

    /**
     * Corrected Test Data
     * 
     */
    @XmlEnumValue("OECD12")
    OECD_12("OECD12"),

    /**
     * Deletion of Test Data
     * 
     */
    @XmlEnumValue("OECD13")
    OECD_13("OECD13");
    private final String value;

    OECDDocTypeIndicEnumType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static OECDDocTypeIndicEnumType fromValue(String v) {
        for (OECDDocTypeIndicEnumType c: OECDDocTypeIndicEnumType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
