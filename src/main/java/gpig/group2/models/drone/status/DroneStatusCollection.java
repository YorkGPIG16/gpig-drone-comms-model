package gpig.group2.models.drone.status;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import java.util.List;

/**
 * Created by james on 20/05/2016.
 */
@XmlRootElement(name="drones")
public class DroneStatusCollection {
    @XmlElement(name="drone")
    List<DroneStatusCollection> collection;
}
