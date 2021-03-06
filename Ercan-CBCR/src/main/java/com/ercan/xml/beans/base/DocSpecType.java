
package com.btc.xml.beans.base;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * Document specification: Data identifying and describing the document, where
 * 'document' here means the part of a message that is to transmit the data about a single block of CBC information. 
 * 
 * <p>Java class for DocSpec_Type complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="DocSpec_Type"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="DocTypeIndic" type="{urn:oecd:ties:cbcstf:v5}OECDDocTypeIndic_EnumType"/&gt;
 *         &lt;element name="DocRefId" type="{urn:oecd:ties:cbcstf:v5}StringMin1Max200_Type"/&gt;
 *         &lt;element name="CorrMessageRefId" type="{urn:oecd:ties:cbcstf:v5}StringMin1Max170_Type" minOccurs="0"/&gt;
 *         &lt;element name="CorrDocRefId" type="{urn:oecd:ties:cbcstf:v5}StringMin1Max200_Type" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DocSpec_Type", namespace = "urn:oecd:ties:cbcstf:v5", propOrder = {
    "docTypeIndic",
    "docRefId",
    "corrMessageRefId",
    "corrDocRefId"
})
public class DocSpecType {

    @XmlElement(name = "DocTypeIndic", namespace = "urn:oecd:ties:cbcstf:v5", required = true)
    @XmlSchemaType(name = "string")
    protected OECDDocTypeIndicEnumType docTypeIndic;
    @XmlElement(name = "DocRefId", namespace = "urn:oecd:ties:cbcstf:v5", required = true)
    protected String docRefId;
    @XmlElement(name = "CorrMessageRefId", namespace = "urn:oecd:ties:cbcstf:v5")
    protected String corrMessageRefId;
    @XmlElement(name = "CorrDocRefId", namespace = "urn:oecd:ties:cbcstf:v5")
    protected String corrDocRefId;

    /**
     * Gets the value of the docTypeIndic property.
     * 
     * @return
     *     possible object is
     *     {@link OECDDocTypeIndicEnumType }
     *     
     */
    public OECDDocTypeIndicEnumType getDocTypeIndic() {
        return docTypeIndic;
    }

    /**
     * Sets the value of the docTypeIndic property.
     * 
     * @param value
     *     allowed object is
     *     {@link OECDDocTypeIndicEnumType }
     *     
     */
    public void setDocTypeIndic(OECDDocTypeIndicEnumType value) {
        this.docTypeIndic = value;
    }

    /**
     * Gets the value of the docRefId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDocRefId() {
        return docRefId;
    }

    /**
     * Sets the value of the docRefId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDocRefId(String value) {
        this.docRefId = value;
    }

    /**
     * Gets the value of the corrMessageRefId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCorrMessageRefId() {
        return corrMessageRefId;
    }

    /**
     * Sets the value of the corrMessageRefId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCorrMessageRefId(String value) {
        this.corrMessageRefId = value;
    }

    /**
     * Gets the value of the corrDocRefId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCorrDocRefId() {
        return corrDocRefId;
    }

    /**
     * Sets the value of the corrDocRefId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCorrDocRefId(String value) {
        this.corrDocRefId = value;
    }

}
