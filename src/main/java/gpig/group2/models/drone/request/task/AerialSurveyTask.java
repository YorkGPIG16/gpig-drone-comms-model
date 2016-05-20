package gpig.group2.models.drone.request.task;

import gpig.group2.maps.geographic.position.BoundingBox;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

/**
 * Created by james on 20/05/2016.
 */

@XmlRootElement(name="aerial-survey")
public class AerialSurveyTask {
    @XmlElement(name="bounding-box")
    private BoundingBox location;
}
