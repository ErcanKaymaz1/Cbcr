
package com.btc.xml.beans.base;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CbcBody_Type complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CbcBody_Type"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="ReportingEntity" type="{urn:oecd:ties:cbc:v2}CorrectableReportingEntity_Type"/&gt;
 *         &lt;element name="CbcReports" type="{urn:oecd:ties:cbc:v2}CorrectableCbcReport_Type" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="AdditionalInfo" type="{urn:oecd:ties:cbc:v2}CorrectableAdditionalInfo_Type" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CbcBody_Type", namespace = "urn:oecd:ties:cbc:v2", propOrder = {
    "reportingEntity",
    "cbcReports",
    "additionalInfo"
})
public class CbcBodyType {

    @XmlElement(name = "ReportingEntity", namespace = "urn:oecd:ties:cbc:v2", required = true)
    protected CorrectableReportingEntityType reportingEntity;
    @XmlElement(name = "CbcReports", namespace = "urn:oecd:ties:cbc:v2")
    protected List<CorrectableCbcReportType> cbcReports;
    @XmlElement(name = "AdditionalInfo", namespace = "urn:oecd:ties:cbc:v2")
    protected List<CorrectableAdditionalInfoType> additionalInfo;

    /**
     * Gets the value of the reportingEntity property.
     * 
     * @return
     *     possible object is
     *     {@link CorrectableReportingEntityType }
     *     
     */
    public CorrectableReportingEntityType getReportingEntity() {
        return reportingEntity;
    }

    /**
     * Sets the value of the reportingEntity property.
     * 
     * @param arrayList
     *     allowed object is
     *     {@link CorrectableReportingEntityType }
     *     
     */
    public void setReportingEntity(CorrectableReportingEntityType arrayList) {
        this.reportingEntity = arrayList;
    }

    /**
     * Gets the value of the cbcReports property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the cbcReports property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCbcReports().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CorrectableCbcReportType }
     * 
     * 
     */
    public List<CorrectableCbcReportType> getCbcReports() {
        if (cbcReports == null) {
            cbcReports = new ArrayList<CorrectableCbcReportType>();
        }
        return this.cbcReports;
    }

    /**
     * Gets the value of the additionalInfo property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the additionalInfo property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAdditionalInfo().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CorrectableAdditionalInfoType }
     * 
     * 
     */
    public List<CorrectableAdditionalInfoType> getAdditionalInfo() {
        if (additionalInfo == null) {
            additionalInfo = new ArrayList<CorrectableAdditionalInfoType>();
        }
        return this.additionalInfo;
    }

}
