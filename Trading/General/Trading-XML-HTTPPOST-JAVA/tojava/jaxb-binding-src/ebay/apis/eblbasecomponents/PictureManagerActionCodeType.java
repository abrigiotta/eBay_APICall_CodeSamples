//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vhudson-jaxb-ri-2.1-661 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2013.05.27 at 04:06:26 PM PDT 
//


package ebay.apis.eblbasecomponents;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for PictureManagerActionCodeType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="PictureManagerActionCodeType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}token">
 *     &lt;enumeration value="Add"/>
 *     &lt;enumeration value="Delete"/>
 *     &lt;enumeration value="Rename"/>
 *     &lt;enumeration value="Move"/>
 *     &lt;enumeration value="Change"/>
 *     &lt;enumeration value="CustomCode"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "PictureManagerActionCodeType")
@XmlEnum
public enum PictureManagerActionCodeType {


    /**
     * 
     * 						(in) Adds a folder or setting  to the account.
     * 					
     * 
     */
    @XmlEnumValue("Add")
    ADD("Add"),

    /**
     * 
     * 						(in) Deletes a folder or setting from the account.
     * 					
     * 
     */
    @XmlEnumValue("Delete")
    DELETE("Delete"),

    /**
     * 
     * 						(in) Renames a folder or picture.
     * 					
     * 
     */
    @XmlEnumValue("Rename")
    RENAME("Rename"),

    /**
     * 
     * 						(in) Moves a picture to the user's default folder in the 
     * 						default album. If the picture is already there, 
     * 						then no action occurs.
     * 					
     * 
     */
    @XmlEnumValue("Move")
    MOVE("Move"),

    /**
     * 
     * 						(in) Changes a subscription level.
     * 					
     * 
     */
    @XmlEnumValue("Change")
    CHANGE("Change"),

    /**
     * 
     * 						(out) Reserved for internal or future use
     * 					
     * 
     */
    @XmlEnumValue("CustomCode")
    CUSTOM_CODE("CustomCode");
    private final String value;

    PictureManagerActionCodeType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static PictureManagerActionCodeType fromValue(String v) {
        for (PictureManagerActionCodeType c: PictureManagerActionCodeType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}