package gpig.group2.models.drone.request;

import gpig.group2.maps.geographic.Position;
import gpig.group2.models.drone.request.task.AerialSurveyTask;
import gpig.group2.models.drone.request.task.GoToLocationTask;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlSeeAlso;

/**
 * Created by james on 20/05/2016.
 */

@XmlRootElement(name="task")
@XmlSeeAlso({GoToLocationTask.class, AerialSurveyTask.class})
public abstract class Task  {
    @XmlElement(name="priority")
    protected Integer priority;

}
