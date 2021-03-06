
package com.btc.xml.beans.base;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for OECDLegalAddressType_EnumType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="OECDLegalAddressType_EnumType"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}token"&gt;
 *     &lt;enumeration value="OECD301"/&gt;
 *     &lt;enumeration value="OECD302"/&gt;
 *     &lt;enumeration value="OECD303"/&gt;
 *     &lt;enumeration value="OECD304"/&gt;
 *     &lt;enumeration value="OECD305"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "OECDLegalAddressType_EnumType", namespace = "urn:oecd:ties:cbcstf:v5")
@XmlEnum
public enum OECDLegalAddressTypeEnumType {


    /**
     * residentialOrBusiness
     * 
     */
    @XmlEnumValue("OECD301")
    OECD_301("OECD301"),

    /**
     * residential
     * 
     */
    @XmlEnumValue("OECD302")
    OECD_302("OECD302"),

    /**
     * business
     * 
     */
    @XmlEnumValue("OECD303")
    OECD_303("OECD303"),

    /**
     * registeredOffice
     * 
     */
    @XmlEnumValue("OECD304")
    OECD_304("OECD304"),

    /**
     * unspecified
     * 
     */
    @XmlEnumValue("OECD305")
    OECD_305("OECD305");
    private final String value;

    OECDLegalAddressTypeEnumType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static OECDLegalAddressTypeEnumType fromValue(String v) {
        for (OECDLegalAddressTypeEnumType c: OECDLegalAddressTypeEnumType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
