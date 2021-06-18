
package com.btc.xml.beans.base;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * 
 * This container brings together all data about an organisation as a party. Name and address are required components and each can
 * be present more than once to enable as complete a description as possible. Whenever possible one or more identifiers (TIN
 * etc) should be added as well as a residence country code. Additional data that describes and identifies the party can be
 * given . The code for the legal type according to the OECD codelist must be added. The structures of
 * all of the subelements are defined elsewhere in this schema.
 * 
 * <p>Java class for OrganisationParty_Type complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="OrganisationParty_Type"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="ResCountryCode" type="{urn:oecd:ties:isocbctypes:v1}CountryCode_Type" maxOccurs="unbounded"/&gt;
 *         &lt;element name="TIN" type="{urn:oecd:ties:cbc:v2}TIN_Type"/&gt;
 *         &lt;element name="IN" type="{urn:oecd:ties:cbc:v2}OrganisationIN_Type" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="Name" type="{urn:oecd:ties:cbc:v2}NameOrganisation_Type" maxOccurs="unbounded"/&gt;
 *         &lt;element name="Address" type="{urn:oecd:ties:cbc:v2}Address_Type" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "OrganisationParty_Type", namespace = "urn:oecd:ties:cbc:v2", propOrder = {
    "resCountryCode",
    "tin",
    "in",
    "name",
    "address"
})
public class OrganisationPartyType {

    @XmlElement(name = "ResCountryCode", namespace = "urn:oecd:ties:cbc:v2", required = true)
    @XmlSchemaType(name = "string")
    protected String resCountryCode;
    @XmlElement(name = "TIN", namespace = "urn:oecd:ties:cbc:v2", required = true)
    protected TINType tin;
    @XmlElement(name = "IN", namespace = "urn:oecd:ties:cbc:v2")
    protected OrganisationINType in;
    @XmlElement(name = "Name", namespace = "urn:oecd:ties:cbc:v2", required = true)
    protected String name;
    @XmlElement(name = "Address", namespace = "urn:oecd:ties:cbc:v2")
    protected AddressType address;

    /**
     * Gets the value of the resCountryCode property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the resCountryCode property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getResCountryCode().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CountryCodeType }
     * 
     * 
     */
    public String getResCountryCode() {
       
        return this.resCountryCode;
    }

    /**
     * Gets the value of the tin property.
     * 
     * @return
     *     possible object is
     *     {@link TINType }
     *     
     */
    public TINType getTIN() {
        return tin;
    }

    /**
     * Sets the value of the tin property.
     * 
     * @param value
     *     allowed object is
     *     {@link TINType }
     *     
     */
    public void setTIN(TINType value) {
        this.tin = value;
    }

    /**
     * Gets the value of the in property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the in property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getIN().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link OrganisationINType }
     * 
     * 
     */
    public OrganisationINType getIN() {
        if (in == null) {
            in = new OrganisationINType();
        }
        return this.in;
    }

    /**
     * Gets the value of the name property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the name property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getName().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link NameOrganisationType }
     * 
     * 
     */
    public String getName() {
        
        return name;
    }
    

    public TINType getTin() {
		return tin;
	}

	public void setTin(TINType tin) {
		this.tin = tin;
	}

	public OrganisationINType getIn() {
		return in;
	}

	public void setIn(OrganisationINType in) {
		this.in = in;
	}

	public void setResCountryCode(String string) {
		this.resCountryCode = string;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setAddress(AddressType address) {
		this.address = address;
	}

	/**
     * Gets the value of the address property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the address property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAddress().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AddressType }
     * 
     * 
     */
    public AddressType getAddress() {
        
        return address;
    }

}
