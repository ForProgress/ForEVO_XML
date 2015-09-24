//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.4-2 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2015.09.22 at 03:19:38 PM CEST 
//


package fp.forevo.xml.map;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for xDriverName.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="xDriverName">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="WebDriver"/>
 *     &lt;enumeration value="Sikuli"/>
 *     &lt;enumeration value="AutoIt"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "xDriverName")
@XmlEnum
public enum XDriverName {

    @XmlEnumValue("WebDriver")
    WEB_DRIVER("WebDriver"),
    @XmlEnumValue("Sikuli")
    SIKULI("Sikuli"),
    @XmlEnumValue("AutoIt")
    AUTO_IT("AutoIt");
    private final String value;

    XDriverName(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static XDriverName fromValue(String v) {
        for (XDriverName c: XDriverName.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
