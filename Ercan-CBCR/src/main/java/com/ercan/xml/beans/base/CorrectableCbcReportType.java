
package com.btc.xml.beans.base;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CorrectableCbcReport_Type complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CorrectableCbcReport_Type"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="DocSpec" type="{urn:oecd:ties:cbcstf:v5}DocSpec_Type"/&gt;
 *         &lt;element name="ResCountryCode" type="{urn:oecd:ties:isocbctypes:v1}CountryCode_Type"/&gt;
 *         &lt;element name="Summary"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="Revenues"&gt;
 *                     &lt;complexType&gt;
 *                       &lt;complexContent&gt;
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                           &lt;sequence&gt;
 *                             &lt;element name="Unrelated" type="{urn:oecd:ties:cbc:v2}MonAmnt_Type"/&gt;
 *                             &lt;element name="Related" type="{urn:oecd:ties:cbc:v2}MonAmnt_Type"/&gt;
 *                             &lt;element name="Total" type="{urn:oecd:ties:cbc:v2}MonAmnt_Type"/&gt;
 *                           &lt;/sequence&gt;
 *                         &lt;/restriction&gt;
 *                       &lt;/complexContent&gt;
 *                     &lt;/complexType&gt;
 *                   &lt;/element&gt;
 *                   &lt;element name="ProfitOrLoss" type="{urn:oecd:ties:cbc:v2}MonAmnt_Type"/&gt;
 *                   &lt;element name="TaxPaid" type="{urn:oecd:ties:cbc:v2}MonAmnt_Type"/&gt;
 *                   &lt;element name="TaxAccrued" type="{urn:oecd:ties:cbc:v2}MonAmnt_Type"/&gt;
 *                   &lt;element name="Capital" type="{urn:oecd:ties:cbc:v2}MonAmnt_Type"/&gt;
 *                   &lt;element name="Earnings" type="{urn:oecd:ties:cbc:v2}MonAmnt_Type"/&gt;
 *                   &lt;element name="NbEmployees" type="{http://www.w3.org/2001/XMLSchema}integer"/&gt;
 *                   &lt;element name="Assets" type="{urn:oecd:ties:cbc:v2}MonAmnt_Type"/&gt;
 *                 &lt;/sequence&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="ConstEntities" type="{urn:oecd:ties:cbc:v2}ConstituentEntity_Type" maxOccurs="unbounded"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CorrectableCbcReport_Type", namespace = "urn:oecd:ties:cbc:v2", propOrder = {
    "docSpec",
    "resCountryCode",
    "summary",
    "constEntities"
})
public class CorrectableCbcReportType {

    @XmlElement(name = "DocSpec", namespace = "urn:oecd:ties:cbc:v2", required = true)
    protected DocSpecType docSpec;
    @XmlElement(name = "ResCountryCode", namespace = "urn:oecd:ties:cbc:v2", required = true)
    @XmlSchemaType(name = "string")
    protected String resCountryCode;
    @XmlElement(name = "Summary", namespace = "urn:oecd:ties:cbc:v2", required = true)
    protected CorrectableCbcReportType.Summary summary;
    @XmlElement(name = "ConstEntities", namespace = "urn:oecd:ties:cbc:v2", required = true)
    protected List<ConstituentEntityType> constEntities;

    /**
     * Gets the value of the docSpec property.
     * 
     * @return
     *     possible object is
     *     {@link DocSpecType }
     *     
     */
    public DocSpecType getDocSpec() {
        return docSpec;
    }

    /**
     * Sets the value of the docSpec property.
     * 
     * @param value
     *     allowed object is
     *     {@link DocSpecType }
     *     
     */
    public void setDocSpec(DocSpecType value) {
        this.docSpec = value;
    }

    /**
     * Gets the value of the resCountryCode property.
     * 
     * @return
     *     possible object is
     *     {@link CountryCodeType }
     *     
     */
    public String getResCountryCode() {
        return resCountryCode;
    }

    /**
     * Sets the value of the resCountryCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link CountryCodeType }
     *     
     */
    public void setResCountryCode(String value) {
        this.resCountryCode = value;
    }

    /**
     * Gets the value of the summary property.
     * 
     * @return
     *     possible object is
     *     {@link CorrectableCbcReportType.Summary }
     *     
     */
    public CorrectableCbcReportType.Summary getSummary() {
        return summary;
    }

    /**
     * Sets the value of the summary property.
     * 
     * @param value
     *     allowed object is
     *     {@link CorrectableCbcReportType.Summary }
     *     
     */
    public void setSummary(CorrectableCbcReportType.Summary value) {
        this.summary = value;
    }

    /**
     * Gets the value of the constEntities property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the constEntities property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getConstEntities().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ConstituentEntityType }
     * 
     * 
     */
    public List<ConstituentEntityType> getConstEntities() {
        if (constEntities == null) {
            constEntities = new ArrayList<ConstituentEntityType>();
        }
        return this.constEntities;
    }
    


    public void setConstEntities(List<ConstituentEntityType> constEntities) {
		this.constEntities = constEntities;
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
     *         &lt;element name="Revenues"&gt;
     *           &lt;complexType&gt;
     *             &lt;complexContent&gt;
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *                 &lt;sequence&gt;
     *                   &lt;element name="Unrelated" type="{urn:oecd:ties:cbc:v2}MonAmnt_Type"/&gt;
     *                   &lt;element name="Related" type="{urn:oecd:ties:cbc:v2}MonAmnt_Type"/&gt;
     *                   &lt;element name="Total" type="{urn:oecd:ties:cbc:v2}MonAmnt_Type"/&gt;
     *                 &lt;/sequence&gt;
     *               &lt;/restriction&gt;
     *             &lt;/complexContent&gt;
     *           &lt;/complexType&gt;
     *         &lt;/element&gt;
     *         &lt;element name="ProfitOrLoss" type="{urn:oecd:ties:cbc:v2}MonAmnt_Type"/&gt;
     *         &lt;element name="TaxPaid" type="{urn:oecd:ties:cbc:v2}MonAmnt_Type"/&gt;
     *         &lt;element name="TaxAccrued" type="{urn:oecd:ties:cbc:v2}MonAmnt_Type"/&gt;
     *         &lt;element name="Capital" type="{urn:oecd:ties:cbc:v2}MonAmnt_Type"/&gt;
     *         &lt;element name="Earnings" type="{urn:oecd:ties:cbc:v2}MonAmnt_Type"/&gt;
     *         &lt;element name="NbEmployees" type="{http://www.w3.org/2001/XMLSchema}integer"/&gt;
     *         &lt;element name="Assets" type="{urn:oecd:ties:cbc:v2}MonAmnt_Type"/&gt;
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
        "revenues",
        "profitOrLoss",
        "taxPaid",
        "taxAccrued",
        "capital",
        "earnings",
        "nbEmployees",
        "assets"
    })
    public static class Summary {

        @XmlElement(name = "Revenues", namespace = "urn:oecd:ties:cbc:v2", required = true)
        protected CorrectableCbcReportType.Summary.Revenues revenues;
        @XmlElement(name = "ProfitOrLoss", namespace = "urn:oecd:ties:cbc:v2", required = true)
        protected MonAmntType profitOrLoss;
        @XmlElement(name = "TaxPaid", namespace = "urn:oecd:ties:cbc:v2", required = true)
        protected MonAmntType taxPaid;
        @XmlElement(name = "TaxAccrued", namespace = "urn:oecd:ties:cbc:v2", required = true)
        protected MonAmntType taxAccrued;
        @XmlElement(name = "Capital", namespace = "urn:oecd:ties:cbc:v2", required = true)
        protected MonAmntType capital;
        @XmlElement(name = "Earnings", namespace = "urn:oecd:ties:cbc:v2", required = true)
        protected MonAmntType earnings;
        @XmlElement(name = "NbEmployees", namespace = "urn:oecd:ties:cbc:v2", required = true)
        protected int nbEmployees;
        @XmlElement(name = "Assets", namespace = "urn:oecd:ties:cbc:v2", required = true)
        protected MonAmntType assets;

        /**
         * Gets the value of the revenues property.
         * 
         * @return
         *     possible object is
         *     {@link CorrectableCbcReportType.Summary.Revenues }
         *     
         */
        public CorrectableCbcReportType.Summary.Revenues getRevenues() {
            return revenues;
        }

        /**
         * Sets the value of the revenues property.
         * 
         * @param value
         *     allowed object is
         *     {@link CorrectableCbcReportType.Summary.Revenues }
         *     
         */
        public void setRevenues(CorrectableCbcReportType.Summary.Revenues value) {
            this.revenues = value;
        }

        /**
         * Gets the value of the profitOrLoss property.
         * 
         * @return
         *     possible object is
         *     {@link MonAmntType }
         *     
         */
        public MonAmntType getProfitOrLoss() {
        	if (profitOrLoss == null) {
				profitOrLoss = new MonAmntType();
			}
            return profitOrLoss;
        }

        /**
         * Sets the value of the profitOrLoss property.
         * 
         * @param value
         *     allowed object is
         *     {@link MonAmntType }
         *     
         */
        public void setProfitOrLoss(MonAmntType value) {
            this.profitOrLoss = value;
        }

        /**
         * Gets the value of the taxPaid property.
         * 
         * @return
         *     possible object is
         *     {@link MonAmntType }
         *     
         */
        public MonAmntType getTaxPaid() {
        	if (taxPaid == null) {
				taxPaid = new MonAmntType();
			}
            return taxPaid;
        }

        /**
         * Sets the value of the taxPaid property.
         * 
         * @param value
         *     allowed object is
         *     {@link MonAmntType }
         *     
         */
        public void setTaxPaid(MonAmntType value) {
            this.taxPaid = value;
        }

        /**
         * Gets the value of the taxAccrued property.
         * 
         * @return
         *     possible object is
         *     {@link MonAmntType }
         *     
         */
        public MonAmntType getTaxAccrued() {
        	if (taxAccrued == null) {
				taxAccrued = new MonAmntType();
			}
            return taxAccrued;
        }

        /**
         * Sets the value of the taxAccrued property.
         * 
         * @param value
         *     allowed object is
         *     {@link MonAmntType }
         *     
         */
        public void setTaxAccrued(MonAmntType value) {
            this.taxAccrued = value;
        }

        /**
         * Gets the value of the capital property.
         * 
         * @return
         *     possible object is
         *     {@link MonAmntType }
         *     
         */
        public MonAmntType getCapital() {
        	if (capital == null) {
				capital = new MonAmntType();
			}
            return capital;
        }

        /**
         * Sets the value of the capital property.
         * 
         * @param value
         *     allowed object is
         *     {@link MonAmntType }
         *     
         */
        public void setCapital(MonAmntType value) {
            this.capital = value;
        }

        /**
         * Gets the value of the earnings property.
         * 
         * @return
         *     possible object is
         *     {@link MonAmntType }
         *     
         */
        public MonAmntType getEarnings() {
        	if (earnings == null) {
				earnings = new MonAmntType();
			}
            return earnings;
        }

        /**
         * Sets the value of the earnings property.
         * 
         * @param value
         *     allowed object is
         *     {@link MonAmntType }
         *     
         */
        public void setEarnings(MonAmntType value) {
            this.earnings = value;
        }

        /**
         * Gets the value of the nbEmployees property.
         * 
         * @return
         *     possible object is
         *     {@link BigInteger }
         *     
         */
        public int getNbEmployees() {
        	
            return nbEmployees;
        }

        /**
         * Sets the value of the nbEmployees property.
         * 
         * @param d
         *     allowed object is
         *     {@link BigInteger }
         *     
         */
        public void setNbEmployees(int d) {
            this.nbEmployees = d;
        }

        /**
         * Gets the value of the assets property.
         * 
         * @return
         *     possible object is
         *     {@link MonAmntType }
         *     
         */
        public MonAmntType getAssets() {
        	if (assets == null) {
				assets = new MonAmntType();
			}
            return assets;
        }

        /**
         * Sets the value of the assets property.
         * 
         * @param value
         *     allowed object is
         *     {@link MonAmntType }
         *     
         */
        public void setAssets(MonAmntType value) {
            this.assets = value;
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
         *         &lt;element name="Unrelated" type="{urn:oecd:ties:cbc:v2}MonAmnt_Type"/&gt;
         *         &lt;element name="Related" type="{urn:oecd:ties:cbc:v2}MonAmnt_Type"/&gt;
         *         &lt;element name="Total" type="{urn:oecd:ties:cbc:v2}MonAmnt_Type"/&gt;
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
            "unrelated",
            "related",
            "total"
        })
        public static class Revenues {

            @XmlElement(name = "Unrelated", namespace = "urn:oecd:ties:cbc:v2", required = true)
            protected MonAmntType unrelated;
            @XmlElement(name = "Related", namespace = "urn:oecd:ties:cbc:v2", required = true)
            protected MonAmntType related;
            @XmlElement(name = "Total", namespace = "urn:oecd:ties:cbc:v2", required = true)
            protected MonAmntType total;

            /**
             * Gets the value of the unrelated property.
             * 
             * @return
             *     possible object is
             *     {@link MonAmntType }
             *     
             */
            public MonAmntType getUnrelated() {
            	if (unrelated == null) {
					unrelated= new MonAmntType();
				}
                return unrelated;
            }

            /**
             * Sets the value of the unrelated property.
             * 
             * @param value
             *     allowed object is
             *     {@link MonAmntType }
             *     
             */
            public void setUnrelated(MonAmntType value) {
                this.unrelated = value;
            }

            /**
             * Gets the value of the related property.
             * 
             * @return
             *     possible object is
             *     {@link MonAmntType }
             *     
             */
            public MonAmntType getRelated() {
            	if (related== null) {
					related = new MonAmntType();
				}
                return related;
            }

            /**
             * Sets the value of the related property.
             * 
             * @param value
             *     allowed object is
             *     {@link MonAmntType }
             *     
             */
            public void setRelated(MonAmntType value) {
                this.related = value;
            }

            /**
             * Gets the value of the total property.
             * 
             * @return
             *     possible object is
             *     {@link MonAmntType }
             *     
             */
            public MonAmntType getTotal() {
            	if (total == null) {
					total = new MonAmntType();
				}
                return total;
            }

            /**
             * Sets the value of the total property.
             * 
             * @param value
             *     allowed object is
             *     {@link MonAmntType }
             *     
             */
            public void setTotal(MonAmntType value) {
                this.total = value;
            }

        }

    }

}
