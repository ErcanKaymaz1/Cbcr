
package com.btc.xml.beans.base;

import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ConstituentEntity_Type complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ConstituentEntity_Type"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="ConstEntity" type="{urn:oecd:ties:cbc:v2}OrganisationParty_Type"/&gt;
 *         &lt;element name="Role" type="{urn:oecd:ties:cbc:v2}UltimateParentEntityRole_EnumType" minOccurs="0"/&gt;
 *         &lt;element name="IncorpCountryCode" type="{urn:oecd:ties:isocbctypes:v1}CountryCode_Type" minOccurs="0"/&gt;
 *         &lt;element name="BizActivities" type="{urn:oecd:ties:cbc:v2}CbcBizActivityType_EnumType" maxOccurs="unbounded"/&gt;
 *         &lt;element name="OtherEntityInfo" type="{urn:oecd:ties:cbcstf:v5}StringMin1Max4000_Type" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ConstituentEntity_Type", namespace = "urn:oecd:ties:cbc:v2", propOrder = {
    "constEntity",
    "role",
    "incorpCountryCode",
    "bizActivities",
    "otherEntityInfo"
})
public class ConstituentEntityType {

    @XmlElement(name = "ConstEntity", namespace = "urn:oecd:ties:cbc:v2", required = true)
    protected OrganisationPartyType constEntity;
    @XmlElement(name = "Role", namespace = "urn:oecd:ties:cbc:v2")
    @XmlSchemaType(name = "string")
    protected UltimateParentEntityRoleEnumType role;
    @XmlElement(name = "IncorpCountryCode", namespace = "urn:oecd:ties:cbc:v2")
    @XmlSchemaType(name = "string")
    protected String incorpCountryCode;
    @XmlElement(name = "BizActivities", namespace = "urn:oecd:ties:cbc:v2", required = true)
    @XmlSchemaType(name = "string")
    protected List<String> bizActivities;
    @XmlElement(name = "OtherEntityInfo", namespace = "urn:oecd:ties:cbc:v2")
    protected String otherEntityInfo;

    /**
     * Gets the value of the constEntity property.
     * 
     * @return
     *     possible object is
     *     {@link OrganisationPartyType }
     *     
     */
    public OrganisationPartyType getConstEntity() {
        return constEntity;
    }

    /**
     * Sets the value of the constEntity property.
     * 
     * @param value
     *     allowed object is
     *     {@link OrganisationPartyType }
     *     
     */
    public void setConstEntity(OrganisationPartyType value) {
        this.constEntity = value;
    }

    /**
     * Gets the value of the role property.
     * 
     * @return
     *     possible object is
     *     {@link UltimateParentEntityRoleEnumType }
     *     
     */
    public UltimateParentEntityRoleEnumType getRole() {
        return role;
    }

    /**
     * Sets the value of the role property.
     * 
     * @param value
     *     allowed object is
     *     {@link UltimateParentEntityRoleEnumType }
     *     
     */
    public void setRole(UltimateParentEntityRoleEnumType value) {
        this.role = value;
    }

    /**
     * Gets the value of the incorpCountryCode property.
     * 
     * @return
     *     possible object is
     *     {@link CountryCodeType }
     *     
     */
    public String getIncorpCountryCode() {
        return incorpCountryCode;
    }

    /**
     * Sets the value of the incorpCountryCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link CountryCodeType }
     *     
     */
    public void setIncorpCountryCode(String value) {
        this.incorpCountryCode = value;
    }

    /**
     * Gets the value of the bizActivities property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the bizActivities property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getBizActivities().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CbcBizActivityTypeEnumType }
     * 
     * 
     */
    public List<String> getBizActivities() {
        
        return bizActivities;
    }

    public void setBizActivities(List<String> bizActivities) {
		this.bizActivities = bizActivities;
	}

	/**
     * Gets the value of the otherEntityInfo property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOtherEntityInfo() {
        return otherEntityInfo;
    }

    /**
     * Sets the value of the otherEntityInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOtherEntityInfo(String value) {
        this.otherEntityInfo = value;
    }

}
