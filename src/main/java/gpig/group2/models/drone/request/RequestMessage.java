package gpig.group2.models.drone.request;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import java.util.Date;
import java.util.List;

/**
 * Created by james on 20/05/2016.
 */

@XmlRootElement(name="request_message")
public class RequestMessage {

    @XmlElement(name="timestamp")
    protected Date timestamp;

    @XmlElement(name="task")
    protected List<Task> tasks;

    public Date getTimestampX() {
        return timestamp;
    }

    public void setTimestamp(Date timestamp) {
        this.timestamp = timestamp;
    }

    public List<Task> getTasksX() {
        return tasks;
    }

    public void setTasks(List<Task> tasks) {
        this.tasks = tasks;
    }
}
