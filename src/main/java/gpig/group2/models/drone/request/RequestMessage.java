package gpig.group2.models.drone.request;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import java.util.Date;
import java.util.List;

/**
 * Created by james on 20/05/2016.
 */

@XmlRootElement(name="request-message")
public class RequestMessage {

    @XmlElement(name="timestamp")
    private Date timestamp;

    @XmlElement(name="task")
    public List<Task> tasks;
}
