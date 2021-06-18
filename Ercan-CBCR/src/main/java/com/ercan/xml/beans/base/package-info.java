/**
 * 
 */
/**
 * @author ekaymaz
 *
 */

@javax.xml.bind.annotation.XmlSchema(
    elementFormDefault = javax.xml.bind.annotation.XmlNsForm.QUALIFIED,
    xmlns ={@XmlNs(prefix="cbc", namespaceURI="urn:oecd:ties:cbc:v2"), 
            @XmlNs(prefix="stf", namespaceURI="urn:oecd:ties:cbcstf:v5"),
            @XmlNs(prefix="xsi", namespaceURI="http://www.w3.org/2001/XMLSchema-instance")})
package com.btc.xml.beans.base;

import javax.xml.bind.annotation.XmlNs;