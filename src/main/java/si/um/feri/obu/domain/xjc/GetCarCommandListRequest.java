//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.7 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2015.12.16 at 03:13:19 AM CET 
//


package si.um.feri.obu.domain.xjc;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for getCarCommandListRequest complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="getCarCommandListRequest">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="OBUId" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "getCarCommandListRequest", propOrder = {
    "obuId"
})
@XmlRootElement(name = "getCarCommandListRequest")
public class GetCarCommandListRequest {

    @XmlElement(name = "OBUId", required = true)
    protected String obuId;

    /**
     * Gets the value of the obuId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOBUId() {
        return obuId;
    }

    /**
     * Sets the value of the obuId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOBUId(String value) {
        this.obuId = value;
    }

}
