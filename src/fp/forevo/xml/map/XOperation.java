//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.4-2 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2015.09.25 at 09:52:47 AM CEST 
//


package fp.forevo.xml.map;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for xOperation.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="xOperation">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="click"/>
 *     &lt;enumeration value="setText"/>
 *     &lt;enumeration value="select"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "xOperation")
@XmlEnum
public enum XOperation {

    @XmlEnumValue("click")
    CLICK("click"),
    @XmlEnumValue("setText")
    SET_TEXT("setText"),
    @XmlEnumValue("select")
    SELECT("select");
    private final String value;

    XOperation(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static XOperation fromValue(String v) {
        for (XOperation c: XOperation.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
