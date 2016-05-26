package gpig.group2.models.drone.response.responsedatatype;

import gpig.group2.models.drone.response.ResponseData;

import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlRootElement;

/**
 * Created by james on 20/05/2016.
 */
@XmlRootElement(name="building_occupancy_response")
public class BuildingOccupancyResponse extends ResponseData {

    @XmlAttribute(name="multistory")
    protected boolean isMultiStoryBuilding;

    @XmlAttribute(name="person_count")
    protected Integer estimatedNumberOfPeople;
}
