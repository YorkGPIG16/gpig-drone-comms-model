package gpig.group2.models.drone.response;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import java.util.Date;
import java.util.List;

/**
 * Created by james on 20/05/2016.
 */

@XmlRootElement(name="reponse_message")
public class ResponseMessage {

    @XmlElement(name="timestamp")
    protected Date timestamp;

    @XmlElement(name="response")
    protected List<ResponseData> response;

    public Date getTimestampX() {
        return timestamp;
    }

    public void setTimestamp(Date timestamp) {
        this.timestamp = timestamp;
    }

    public List<ResponseData> getResponseX() {
        return response;
    }

    public void setResponse(List<ResponseData> response) {
        this.response = response;
    }
}
