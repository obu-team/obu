//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.7 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2015.12.21 at 07:25:02 PM CET 
//


package si.um.feri.obu.domain.xjc;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for sendCarCommandRequest complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="sendCarCommandRequest">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="OBUId" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="trr" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="carCommand" type="{http://feri.um.si/obu}carCommand"/>
 *         &lt;element name="commandState" type="{http://feri.um.si/obu}commandState"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "sendCarCommandRequest", propOrder = {
    "obuId",
    "trr",
    "carCommand",
    "commandState"
})
@XmlRootElement(name = "sendCarCommandRequest")
public class SendCarCommandRequest {

    @XmlElement(name = "OBUId", required = true)
    protected String obuId;
    @XmlElement(required = true)
    protected String trr;
    @XmlElement(required = true)
    protected CarCommand carCommand;
    @XmlElement(required = true)
    protected CommandState commandState;

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

    /**
     * Gets the value of the trr property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTrr() {
        return trr;
    }

    /**
     * Sets the value of the trr property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTrr(String value) {
        this.trr = value;
    }

    /**
     * Gets the value of the carCommand property.
     * 
     * @return
     *     possible object is
     *     {@link CarCommand }
     *     
     */
    public CarCommand getCarCommand() {
        return carCommand;
    }

    /**
     * Sets the value of the carCommand property.
     * 
     * @param value
     *     allowed object is
     *     {@link CarCommand }
     *     
     */
    public void setCarCommand(CarCommand value) {
        this.carCommand = value;
    }

    /**
     * Gets the value of the commandState property.
     * 
     * @return
     *     possible object is
     *     {@link CommandState }
     *     
     */
    public CommandState getCommandState() {
        return commandState;
    }

    /**
     * Sets the value of the commandState property.
     * 
     * @param value
     *     allowed object is
     *     {@link CommandState }
     *     
     */
    public void setCommandState(CommandState value) {
        this.commandState = value;
    }

}
