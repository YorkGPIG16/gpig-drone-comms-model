package gpig.group2.models.drone;

import gpig.group2.maps.geographic.Point;
import gpig.group2.maps.geographic.position.BoundingBox;
import gpig.group2.maps.geographic.position.CoordinateList;
import gpig.group2.models.drone.request.RequestMessage;
import gpig.group2.models.drone.request.Task;
import gpig.group2.models.drone.request.task.AerialSurveyTask;
import gpig.group2.models.drone.request.task.GoToLocationTask;
import gpig.group2.models.drone.response.Image;
import gpig.group2.models.drone.response.ResponseData;
import gpig.group2.models.drone.response.ResponseMessage;
import gpig.group2.models.drone.status.DroneStatusMessage;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import java.io.IOException;
import java.io.StringWriter;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * Created by james on 23/05/2016.
 */
public class XMLGenerator {
    public static void main(final String[] args) throws JAXBException, IOException {

        {
            JAXBContext jaxbContext = JAXBContext.newInstance(DroneStatusMessage.class);
            Marshaller m = jaxbContext.createMarshaller();

            StringWriter sw = new StringWriter();

            DroneStatusMessage sm = new DroneStatusMessage();
            sm.setTimestamp(new Date());

            Point p = new Point(123,456);
            sm.setPosition(p);

            sm.setBattery(123);

            List<String> fail = new ArrayList<>();
            fail.add("MOTOR");
            fail.add("COMMS");
            sm.setFailures(fail);

            CoordinateList cl = new CoordinateList();
            cl.addCoordinate(new Point(123,456));
            cl.addCoordinate(new Point(125,458));

            sm.setWaypoints(cl);

            m.marshal(sm,sw);
            System.out.println(sw);

        }


        {
            JAXBContext jaxbContext = JAXBContext.newInstance(ResponseMessage.class);
            Marshaller m = jaxbContext.createMarshaller();

            StringWriter sw = new StringWriter();

            ResponseMessage resp = new ResponseMessage();
            resp.setTimestamp(new Date());

            ResponseData rd = new ResponseData();
            rd.setTimestamp(new Date());

            List<Image> images1=  new ArrayList<>();
            Image im1 = new Image();
            im1.setUrl("http://10.0.0.1/myimage.jpg");

            Image im2 = new Image();
            im2.setUrl("http://10.0.0.1/myimage2.jpg");


            images1.add(im1);
            images1.add(im2);

            rd.setImages(images1);
            rd.setOrigin(new Point(124,251));

            List<Image> images2=  new ArrayList<>();
            images2.add(im1);
            ResponseData rd2 = new ResponseData();
            rd2.setImages(images2);
            rd2.setTimestamp(new Date());
            rd2.setOrigin(new Point(123,456));

            List<ResponseData> responses = new ArrayList<>();
            responses.add(rd);
            responses.add(rd2);

            resp.setResponse(responses);
            m.marshal(resp,sw);

            System.out.println(sw);
        }

        {
            JAXBContext jaxbContext = JAXBContext.newInstance(RequestMessage.class);
            Marshaller m = jaxbContext.createMarshaller();

            StringWriter sw = new StringWriter();


            RequestMessage rq = new RequestMessage();
            List<Task> tasks = new ArrayList<>();

            GoToLocationTask t = new GoToLocationTask();
            t.setPoint(new Point(123,456));
            t.setPriority(100);
            t.setTimestamp(new Date());


            AerialSurveyTask t1 = new AerialSurveyTask();
            BoundingBox bb = new BoundingBox(new Point(123,456),new Point(125,458));


            t1.setTimestamp(new Date());
            t1.setPriority(4);
            t1.setLocation(bb);



            tasks.add(t);
            tasks.add(t1);

            rq.setTasks(tasks);
            m.marshal(rq,sw);
            System.out.println(sw);

        }
    }
}
