
package com.btc.xml.beans.base;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for OECDNameType_EnumType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="OECDNameType_EnumType"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="OECD201"/&gt;
 *     &lt;enumeration value="OECD202"/&gt;
 *     &lt;enumeration value="OECD203"/&gt;
 *     &lt;enumeration value="OECD204"/&gt;
 *     &lt;enumeration value="OECD205"/&gt;
 *     &lt;enumeration value="OECD206"/&gt;
 *     &lt;enumeration value="OECD207"/&gt;
 *     &lt;enumeration value="OECD208"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "OECDNameType_EnumType", namespace = "urn:oecd:ties:cbcstf:v5")
@XmlEnum
public enum OECDNameTypeEnumType {


    /**
     * SMFAliasOrOther
     * 
     */
    @XmlEnumValue("OECD201")
    OECD_201("OECD201"),

    /**
     * indiv (individual)
     * 
     */
    @XmlEnumValue("OECD202")
    OECD_202("OECD202"),

    /**
     * alias (alias)
     * 
     */
    @XmlEnumValue("OECD203")
    OECD_203("OECD203"),

    /**
     * nick (nickname)
     * 
     */
    @XmlEnumValue("OECD204")
    OECD_204("OECD204"),

    /**
     * aka (also known as)
     * 
     */
    @XmlEnumValue("OECD205")
    OECD_205("OECD205"),

    /**
     * dba (doing business as)
     * 
     */
    @XmlEnumValue("OECD206")
    OECD_206("OECD206"),

    /**
     * legal (legal name)
     * 
     */
    @XmlEnumValue("OECD207")
    OECD_207("OECD207"),

    /**
     * atbirth (name at birth)
     * 
     */
    @XmlEnumValue("OECD208")
    OECD_208("OECD208");
    private final String value;

    OECDNameTypeEnumType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static OECDNameTypeEnumType fromValue(String v) {
        for (OECDNameTypeEnumType c: OECDNameTypeEnumType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
