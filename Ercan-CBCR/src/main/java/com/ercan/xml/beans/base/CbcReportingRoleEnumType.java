
package com.btc.xml.beans.base;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CbcReportingRole_EnumType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="CbcReportingRole_EnumType"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="CBC701"/&gt;
 *     &lt;enumeration value="CBC702"/&gt;
 *     &lt;enumeration value="CBC703"/&gt;
 *     &lt;enumeration value="CBC704"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "CbcReportingRole_EnumType", namespace = "urn:oecd:ties:cbc:v2")
@XmlEnum
public enum CbcReportingRoleEnumType {


    /**
     * Ultimate Parent Entity
     * 
     */
    @XmlEnumValue("CBC701")
    CBC_701("CBC701"),

    /**
     * Surrogate Parent Entity
     * 
     */
    @XmlEnumValue("CBC702")
    CBC_702("CBC702"),

    /**
     * Local Filing in the framework of an international exchange
     * 
     */
    @XmlEnumValue("CBC703")
    CBC_703("CBC703"),

    /**
     * Local Filing with Incomplete Information
     * 
     */
    @XmlEnumValue("CBC704")
    CBC_704("CBC704");
    private final String value;

    CbcReportingRoleEnumType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static CbcReportingRoleEnumType fromValue(String v) {
        for (CbcReportingRoleEnumType c: CbcReportingRoleEnumType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
