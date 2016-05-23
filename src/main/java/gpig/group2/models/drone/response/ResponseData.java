package gpig.group2.models.drone.response;

import gpig.group2.maps.geographic.Point;
import gpig.group2.models.drone.response.responsedatatype.ManDownResponse;
import gpig.group2.models.drone.response.responsedatatype.SurveillanceImageSet;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlSeeAlso;
import java.util.Date;
import java.util.List;

/**
 * Created by james on 20/05/2016.
 */


@XmlRootElement(name="response_data")
@XmlSeeAlso({ManDownResponse.class, SurveillanceImageSet.class})
public class ResponseData {

    @XmlElement(name="timestamp")
    protected Date timestamp;

    @XmlElement(name="origin")
    protected Point origin;

    @XmlElement(name="image")
    protected List<Image> images;

    public Date getTimestampX() {
        return timestamp;
    }

    public void setTimestamp(Date timestamp) {
        this.timestamp = timestamp;
    }

    public Point getOriginX() {
        return origin;
    }

    public void setOrigin(Point origin) {
        this.origin = origin;
    }

    public List<Image> getImagesX() {
        return images;
    }

    public void setImages(List<Image> images) {
        this.images = images;
    }
}
