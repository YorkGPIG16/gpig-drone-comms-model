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
    protected List<DroneStatusCollection> collection;


    public List<DroneStatusCollection> getCollectionX() {
        return collection;
    }

    public void setCollection(List<DroneStatusCollection> collection) {
        this.collection = collection;
    }
}
