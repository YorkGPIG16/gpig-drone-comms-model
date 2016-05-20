package gpig.group2.models.drone.response;

import gpig.group2.maps.geographic.Position;
import gpig.group2.maps.geographic.position.Point;
import gpig.group2.models.drone.response.response.ManDownResponse;
import gpig.group2.models.drone.response.response.SurveillanceImageSet;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlSeeAlso;
import java.util.Date;
import java.util.List;

/**
 * Created by james on 20/05/2016.
 */


@XmlRootElement(name="response-data")
@XmlSeeAlso({ManDownResponse.class, SurveillanceImageSet.class})
public class ResponseData {

    @XmlElement(name="timestamp")
    private Date timestamp;

    @XmlElement(name="origin")
    Point origin;

    List<Image> images;
}
