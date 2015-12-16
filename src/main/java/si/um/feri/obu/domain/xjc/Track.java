//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.7 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2015.12.16 at 01:37:18 AM CET 
//


package si.um.feri.obu.domain.xjc;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for track complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="track">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="id" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="distance" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="duration" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="trackPoints" type="{http://feri.um.si/obu}trackPoint" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "track", propOrder = {
    "id",
    "distance",
    "duration",
    "trackPoints"
})
public class Track {

    @XmlElement(required = true)
    protected String id;
    protected long distance;
    protected long duration;
    @XmlElement(nillable = true)
    protected List<TrackPoint> trackPoints;

    /**
     * Gets the value of the id property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getId() {
        return id;
    }

    /**
     * Sets the value of the id property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setId(String value) {
        this.id = value;
    }

    /**
     * Gets the value of the distance property.
     * 
     */
    public long getDistance() {
        return distance;
    }

    /**
     * Sets the value of the distance property.
     * 
     */
    public void setDistance(long value) {
        this.distance = value;
    }

    /**
     * Gets the value of the duration property.
     * 
     */
    public long getDuration() {
        return duration;
    }

    /**
     * Sets the value of the duration property.
     * 
     */
    public void setDuration(long value) {
        this.duration = value;
    }

    /**
     * Gets the value of the trackPoints property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the trackPoints property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTrackPoints().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TrackPoint }
     * 
     * 
     */
    public List<TrackPoint> getTrackPoints() {
        if (trackPoints == null) {
            trackPoints = new ArrayList<TrackPoint>();
        }
        return this.trackPoints;
    }

}
