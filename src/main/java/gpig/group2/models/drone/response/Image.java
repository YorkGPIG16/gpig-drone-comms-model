package gpig.group2.models.drone.response;

import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlRootElement;

/**
 * Created by james on 20/05/2016.
 */

@XmlRootElement(name="image")
public class Image {

    @XmlAttribute(name="url")
    protected String url;

    public String getUrlX() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }
}
