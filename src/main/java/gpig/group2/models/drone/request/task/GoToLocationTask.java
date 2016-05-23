package gpig.group2.models.drone.request.task;

import gpig.group2.maps.geographic.Point;
import gpig.group2.models.drone.request.Task;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

/**
 * Created by james on 20/05/2016.
 */

@XmlRootElement(name="go_to_location")
public class GoToLocationTask extends Task {
    @XmlElement(name="location")
    protected Point point;

    public Point getPointX() {
        return point;
    }

    public void setPoint(Point point) {
        this.point = point;
    }
}
