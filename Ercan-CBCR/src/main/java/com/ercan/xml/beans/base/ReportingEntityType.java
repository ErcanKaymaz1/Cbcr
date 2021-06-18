
package com.btc.xml.beans.base;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for ReportingEntity_Type complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ReportingEntity_Type"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Entity" type="{urn:oecd:ties:cbc:v2}OrganisationParty_Type"/&gt;
 *         &lt;element name="NameMNEGroup" type="{urn:oecd:ties:cbcstf:v5}StringMin1Max200_Type" minOccurs="0"/&gt;
 *         &lt;element name="ReportingRole" type="{urn:oecd:ties:cbc:v2}CbcReportingRole_EnumType"/&gt;
 *         &lt;element name="ReportingPeriod"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="StartDate" type="{http://www.w3.org/2001/XMLSchema}date"/&gt;
 *                   &lt;element name="EndDate" type="{http://www.w3.org/2001/XMLSchema}date"/&gt;
 *                 &lt;/sequence&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ReportingEntity_Type", namespace = "urn:oecd:ties:cbc:v2", propOrder = {
    "entity",
    "nameMNEGroup",
    "reportingRole",
    "reportingPeriod"
})
@XmlSeeAlso({
    CorrectableReportingEntityType.class
})
public class ReportingEntityType {

    @XmlElement(name = "Entity", namespace = "urn:oecd:ties:cbc:v2", required = true)
    protected OrganisationPartyType entity;
    @XmlElement(name = "NameMNEGroup", namespace = "urn:oecd:ties:cbc:v2")
    protected String nameMNEGroup;
    @XmlElement(name = "ReportingRole", namespace = "urn:oecd:ties:cbc:v2", required = true)
    @XmlSchemaType(name = "string")
    protected CbcReportingRoleEnumType reportingRole;
    @XmlElement(name = "ReportingPeriod", namespace = "urn:oecd:ties:cbc:v2", required = true)
    protected ReportingEntityType.ReportingPeriod reportingPeriod;

    /**
     * Gets the value of the entity property.
     * 
     * @return
     *     possible object is
     *     {@link OrganisationPartyType }
     *     
     */
    public OrganisationPartyType getEntity() {
        return entity;
    }

    /**
     * Sets the value of the entity property.
     * 
     * @param value
     *     allowed object is
     *     {@link OrganisationPartyType }
     *     
     */
    public void setEntity(OrganisationPartyType value) {
        this.entity = value;
    }

    /**
     * Gets the value of the nameMNEGroup property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNameMNEGroup() {
        return nameMNEGroup;
    }

    /**
     * Sets the value of the nameMNEGroup property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNameMNEGroup(String value) {
        this.nameMNEGroup = value;
    }

    /**
     * Gets the value of the reportingRole property.
     * 
     * @return
     *     possible object is
     *     {@link CbcReportingRoleEnumType }
     *     
     */
    public CbcReportingRoleEnumType getReportingRole() {
        return reportingRole;
    }

    /**
     * Sets the value of the reportingRole property.
     * 
     * @param value
     *     allowed object is
     *     {@link CbcReportingRoleEnumType }
     *     
     */
    public void setReportingRole(CbcReportingRoleEnumType value) {
        this.reportingRole = value;
    }

    /**
     * Gets the value of the reportingPeriod property.
     * 
     * @return
     *     possible object is
     *     {@link ReportingEntityType.ReportingPeriod }
     *     
     */
    public ReportingEntityType.ReportingPeriod getReportingPeriod() {
        return reportingPeriod;
    }

    /**
     * Sets the value of the reportingPeriod property.
     * 
     * @param value
     *     allowed object is
     *     {@link ReportingEntityType.ReportingPeriod }
     *     
     */
    public void setReportingPeriod(ReportingEntityType.ReportingPeriod value) {
        this.reportingPeriod = value;
    }


    /**
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType&gt;
     *   &lt;complexContent&gt;
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *       &lt;sequence&gt;
     *         &lt;element name="StartDate" type="{http://www.w3.org/2001/XMLSchema}date"/&gt;
     *         &lt;element name="EndDate" type="{http://www.w3.org/2001/XMLSchema}date"/&gt;
     *       &lt;/sequence&gt;
     *     &lt;/restriction&gt;
     *   &lt;/complexContent&gt;
     * &lt;/complexType&gt;
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "startDate",
        "endDate"
    })
    public static class ReportingPeriod {

        @XmlElement(name = "StartDate", namespace = "urn:oecd:ties:cbc:v2", required = true)
        @XmlSchemaType(name = "date")
        protected XMLGregorianCalendar startDate;
        @XmlElement(name = "EndDate", namespace = "urn:oecd:ties:cbc:v2", required = true)
        @XmlSchemaType(name = "date")
        protected XMLGregorianCalendar endDate;

        /**
         * Gets the value of the startDate property.
         * 
         * @return
         *     possible object is
         *     {@link XMLGregorianCalendar }
         *     
         */
        public XMLGregorianCalendar getStartDate() {
            return startDate;
        }

        /**
         * Sets the value of the startDate property.
         * 
         * @param value
         *     allowed object is
         *     {@link XMLGregorianCalendar }
         *     
         */
        public void setStartDate(XMLGregorianCalendar value) {
            this.startDate = value;
        }

        /**
         * Gets the value of the endDate property.
         * 
         * @return
         *     possible object is
         *     {@link XMLGregorianCalendar }
         *     
         */
        public XMLGregorianCalendar getEndDate() {
            return endDate;
        }

        /**
         * Sets the value of the endDate property.
         * 
         * @param value
         *     allowed object is
         *     {@link XMLGregorianCalendar }
         *     
         */
        public void setEndDate(XMLGregorianCalendar value) {
            this.endDate = value;
        }

    }

}
