package gpig.group2.models.drone.status;

import gpig.group2.maps.geographic.position.CoordinateList;
import gpig.group2.maps.geographic.Point;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

import java.util.Date;
import java.util.List;

/**
 * Created by james on 20/05/2016.
 */
@XmlRootElement(name="status_message")
public class StatusMessage {

    @XmlElement(name="timestamp")
    protected Date timestamp;

    @XmlElement(name="battery")
    protected float battery;

    @XmlElement(name="position")
    protected Point position;

    @XmlElement(name="planned_waypoints")
    protected CoordinateList waypoints;

    @XmlElement(name="failure")
    protected List<String> failures;

    public Date getTimestampX() {
        return timestamp;
    }

    public void setTimestamp(Date timestamp) {
        this.timestamp = timestamp;
    }

    public float getBatteryX() {
        return battery;
    }

    public void setBattery(float battery) {
        this.battery = battery;
    }

    public Point getPositionX() {
        return position;
    }

    public void setPosition(Point position) {
        this.position = position;
    }

    public CoordinateList getWaypointsX() {
        return waypoints;
    }

    public void setWaypoints(CoordinateList waypoints) {
        this.waypoints = waypoints;
    }

    public List<String> getFailuresX() {
        return failures;
    }

    public void setFailures(List<String> failures) {
        this.failures = failures;
    }
}
