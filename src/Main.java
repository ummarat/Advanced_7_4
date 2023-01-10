import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import javax.xml.bind.Unmarshaller;
import java.io.File;

public class Main {
    public static void main(String[] args) {
        AddressesList al = new AddressesList();
        al.add(new Address("Kyiv", "Khreshchatyk", "19"));
        al.add(new Address("Lviv", "Sichovykh Striltsiv", "5"));
        try {
            File file = new File("temp.xml");
            JAXBContext jaxbContext = JAXBContext.newInstance(AddressesList.class);
            Marshaller mar = jaxbContext.createMarshaller();
            mar.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);
            mar.marshal(al, file);

            Unmarshaller unmarshaller = jaxbContext.createUnmarshaller();
            al =(AddressesList) unmarshaller.unmarshal(file);
            System.out.println(al);
        } catch (JAXBException e) {
            e.printStackTrace();
        }
    }
}