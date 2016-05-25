package gpig.group2.models.drone.request;

import gpig.group2.maps.geographic.Position;
import gpig.group2.models.drone.request.task.AerialSurveyTask;
import gpig.group2.models.drone.request.task.GoToLocationTask;
import javafx.beans.property.IntegerProperty;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlSeeAlso;
import java.util.Date;

/**
 * Created by james on 20/05/2016.
 */

@XmlRootElement(name="task")
@XmlSeeAlso({GoToLocationTask.class, AerialSurveyTask.class})
public abstract class Task  {

    @XmlElement(name="timestamp")
    protected Date timestamp;

    @XmlElement(name="priority")
    protected Integer priority;

    @XmlElement(name="id")
    protected Integer id;

    public Date getTimestampX() {
        return timestamp;
    }

    public void setTimestamp(Date timestamp) {
        this.timestamp = timestamp;
    }

    public Integer getPriorityX() {
        return priority;
    }

    public void setPriority(Integer priority) {
        this.priority = priority;
    }

    public Integer getIdX() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

}
