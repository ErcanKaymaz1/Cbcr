
package com.btc.xml.beans.base;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for UltimateParentEntityRole_EnumType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="UltimateParentEntityRole_EnumType"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="CBC801"/&gt;
 *     &lt;enumeration value="CBC802"/&gt;
 *     &lt;enumeration value="CBC803"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "UltimateParentEntityRole_EnumType", namespace = "urn:oecd:ties:cbc:v2")
@XmlEnum
public enum UltimateParentEntityRoleEnumType {


    /**
     * Ultimate Parent Entity
     * 
     */
    @XmlEnumValue("CBC801")
    CBC_801("CBC801"),

    /**
     * Reporting Entity
     * 
     */
    @XmlEnumValue("CBC802")
    CBC_802("CBC802"),

    /**
     * Both (Ultimate Parent Entity and Reporting Entity)
     * 
     */
    @XmlEnumValue("CBC803")
    CBC_803("CBC803");
    private final String value;

    UltimateParentEntityRoleEnumType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static UltimateParentEntityRoleEnumType fromValue(String v) {
        for (UltimateParentEntityRoleEnumType c: UltimateParentEntityRoleEnumType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
