package gpig.group2.models.drone.response;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import java.util.Date;
import java.util.List;

/**
 * Created by james on 20/05/2016.
 */

@XmlRootElement(name="reponse-message")
public class ResponseMessage {

    @XmlElement(name="timestamp")
    private Date timestamp;

    @XmlElement(name="response")
    List<ResponseMessage> response;
}
