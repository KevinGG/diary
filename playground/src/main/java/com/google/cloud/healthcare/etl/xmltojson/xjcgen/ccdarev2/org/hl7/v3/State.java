//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2021.04.08 at 01:45:54 PM EDT 
//


package com.google.cloud.healthcare.etl.xmltojson.xjcgen.ccdarev2.org.hl7.v3;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for State.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="State">
 *   &lt;restriction base="{urn:hl7-org:v3}cs">
 *     &lt;enumeration value="STATE"/>
 *     &lt;enumeration value="NAT"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "State")
@XmlEnum
public enum State {

    STATE,
    NAT;

    public String value() {
        return name();
    }

    public static State fromValue(String v) {
        return valueOf(v);
    }

}
