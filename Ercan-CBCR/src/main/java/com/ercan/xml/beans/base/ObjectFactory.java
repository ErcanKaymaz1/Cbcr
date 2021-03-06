
package com.btc.xml.beans.base;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.btc.xml package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _AddressTypeCountryCode_QNAME = new QName("urn:oecd:ties:cbc:v2", "CountryCode");
    private final static QName _AddressTypeAddressFree_QNAME = new QName("urn:oecd:ties:cbc:v2", "AddressFree");
    private final static QName _AddressTypeAddressFix_QNAME = new QName("urn:oecd:ties:cbc:v2", "AddressFix");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.btc.xml
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link ReportingEntityType }
     * 
     */
    public ReportingEntityType createReportingEntityType() {
        return new ReportingEntityType();
    }

    /**
     * Create an instance of {@link CorrectableCbcReportType }
     * 
     */
    public CorrectableCbcReportType createCorrectableCbcReportType() {
        return new CorrectableCbcReportType();
    }

    /**
     * Create an instance of {@link CorrectableCbcReportType.Summary }
     * 
     */
    public CorrectableCbcReportType.Summary createCorrectableCbcReportTypeSummary() {
        return new CorrectableCbcReportType.Summary();
    }

    /**
     * Create an instance of {@link CBCOECD }
     * 
     */
    public CBCOECD createCBCOECD() {
        return new CBCOECD();
    }

    /**
     * Create an instance of {@link MessageSpecType }
     * 
     */
    public MessageSpecType createMessageSpecType() {
        return new MessageSpecType();
    }

    /**
     * Create an instance of {@link CbcBodyType }
     * 
     */
    public CbcBodyType createCbcBodyType() {
        return new CbcBodyType();
    }

    /**
     * Create an instance of {@link AddressFixType }
     * 
     */
    public AddressFixType createAddressFixType() {
        return new AddressFixType();
    }

    /**
     * Create an instance of {@link AddressType }
     * 
     */
    public AddressType createAddressType() {
        return new AddressType();
    }

    /**
     * Create an instance of {@link MonAmntType }
     * 
     */
    public MonAmntType createMonAmntType() {
        return new MonAmntType();
    }

    /**
     * Create an instance of {@link NameOrganisationType }
     * 
     */
    public NameOrganisationType createNameOrganisationType() {
        return new NameOrganisationType();
    }

    /**
     * Create an instance of {@link TINType }
     * 
     */
    public TINType createTINType() {
        return new TINType();
    }

    /**
     * Create an instance of {@link ConstituentEntityType }
     * 
     */
    public ConstituentEntityType createConstituentEntityType() {
        return new ConstituentEntityType();
    }

    /**
     * Create an instance of {@link OrganisationINType }
     * 
     */
    public OrganisationINType createOrganisationINType() {
        return new OrganisationINType();
    }

    /**
     * Create an instance of {@link OrganisationPartyType }
     * 
     */
    public OrganisationPartyType createOrganisationPartyType() {
        return new OrganisationPartyType();
    }

    /**
     * Create an instance of {@link CorrectableReportingEntityType }
     * 
     */
    public CorrectableReportingEntityType createCorrectableReportingEntityType() {
        return new CorrectableReportingEntityType();
    }

    /**
     * Create an instance of {@link CorrectableAdditionalInfoType }
     * 
     */
    public CorrectableAdditionalInfoType createCorrectableAdditionalInfoType() {
        return new CorrectableAdditionalInfoType();
    }

    /**
     * Create an instance of {@link StringMin1Max4000WithLangType }
     * 
     */
    public StringMin1Max4000WithLangType createStringMin1Max4000WithLangType() {
        return new StringMin1Max4000WithLangType();
    }

    /**
     * Create an instance of {@link DocSpecType }
     * 
     */
    public DocSpecType createDocSpecType() {
        return new DocSpecType();
    }

    /**
     * Create an instance of {@link ReportingEntityType.ReportingPeriod }
     * 
     */
    public ReportingEntityType.ReportingPeriod createReportingEntityTypeReportingPeriod() {
        return new ReportingEntityType.ReportingPeriod();
    }

    /**
     * Create an instance of {@link CorrectableCbcReportType.Summary.Revenues }
     * 
     */
    public CorrectableCbcReportType.Summary.Revenues createCorrectableCbcReportTypeSummaryRevenues() {
        return new CorrectableCbcReportType.Summary.Revenues();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CountryCodeType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link CountryCodeType }{@code >}
     */
    @XmlElementDecl(namespace = "urn:oecd:ties:cbc:v2", name = "CountryCode", scope = AddressType.class)
    public JAXBElement<CountryCodeType> createAddressTypeCountryCode(CountryCodeType value) {
        return new JAXBElement<CountryCodeType>(_AddressTypeCountryCode_QNAME, CountryCodeType.class, AddressType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "urn:oecd:ties:cbc:v2", name = "AddressFree", scope = AddressType.class)
    public JAXBElement<String> createAddressTypeAddressFree(String value) {
        return new JAXBElement<String>(_AddressTypeAddressFree_QNAME, String.class, AddressType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AddressFixType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link AddressFixType }{@code >}
     */
    @XmlElementDecl(namespace = "urn:oecd:ties:cbc:v2", name = "AddressFix", scope = AddressType.class)
    public JAXBElement<AddressFixType> createAddressTypeAddressFix(AddressFixType value) {
        return new JAXBElement<AddressFixType>(_AddressTypeAddressFix_QNAME, AddressFixType.class, AddressType.class, value);
    }

}
