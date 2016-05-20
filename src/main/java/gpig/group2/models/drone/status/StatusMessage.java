package gpig.group2.models.drone.status;

import gpig.group2.maps.geographic.Position;
import gpig.group2.maps.geographic.position.CoordinateList;
import gpig.group2.maps.geographic.position.Point;

import javax.xml.bind.annotation.XmlElement;
import java.util.List;

/**
 * Created by james on 20/05/2016.
 */
public class StatusMessage {

    @XmlElement(name="battery")
    private float battery;

    @XmlElement(name="position")
    private Point position;

    @XmlElement(name="planned-waypoints")
    private CoordinateList waypoints;

    @XmlElement(name="failure")
    private List<String> failures;

}
