import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@XmlRootElement(name = "addresses_list")
public class AddressesList {
    @XmlElement(name = "address")
    private List<Address> addresses = new ArrayList<>();

    public void add(Address address){
        addresses.add(address);
    }

    @Override
    public String toString(){
        return Arrays.deepToString(addresses.toArray());
    }
}
