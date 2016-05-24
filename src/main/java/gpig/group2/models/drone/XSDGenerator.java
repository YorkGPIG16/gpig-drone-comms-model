package gpig.group2.models.drone;

import gpig.group2.models.drone.request.RequestMessage;
import gpig.group2.models.drone.response.ResponseMessage;
import gpig.group2.models.drone.status.DroneStatusMessage;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.SchemaOutputResolver;
import javax.xml.transform.Result;
import javax.xml.transform.stream.StreamResult;
import java.io.File;
import java.io.IOException;

/**
 * Created by james on 23/05/2016.
 */
public class XSDGenerator {
    public static void main(final String[] args) throws JAXBException, IOException {

        {
            JAXBContext jaxbContext = JAXBContext.newInstance(DroneStatusMessage.class);


            jaxbContext.generateSchema(new SchemaOutputResolver() {
                @Override
                public Result createOutput(String namespaceUri, String suggestedFileName) throws IOException {
                    File file = new File(args[0]);
                    file.createNewFile();
                    StreamResult result = new StreamResult(file);
                    result.setSystemId(file.toURI().toURL().toString());
                    return result;
                }
            });
        }


        {
            JAXBContext jaxbContext = JAXBContext.newInstance(ResponseMessage.class);

            jaxbContext.generateSchema(new SchemaOutputResolver() {
                @Override
                public Result createOutput(String namespaceUri, String suggestedFileName) throws IOException {
                    File file = new File(args[1]);
                    file.createNewFile();
                    StreamResult result = new StreamResult(file);
                    result.setSystemId(file.toURI().toURL().toString());
                    return result;
                }
            });
        }


        {
            JAXBContext jaxbContext = JAXBContext.newInstance(RequestMessage.class);


            jaxbContext.generateSchema(new SchemaOutputResolver() {
                @Override
                public Result createOutput(String namespaceUri, String suggestedFileName) throws IOException {
                    File file = new File(args[2]);
                    file.createNewFile();
                    StreamResult result = new StreamResult(file);
                    result.setSystemId(file.toURI().toURL().toString());
                    return result;
                }
            });
        }

    }
}
