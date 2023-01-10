import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

@XmlRootElement(name = "address")
@XmlType(propOrder = {"city", "street", "house"})
public class Address {
    private String city;
    private String street;
    private String house;

    public Address() {
    }

    public Address(String city, String street, String house) {
        this.city = city;
        this.street = street;
        this.house = house;
    }

    @Override
    public String toString() {
        return "Address{" +
                "city='" + city + '\'' +
                ", street='" + street + '\'' +
                ", house='" + house + '\'' +
                '}';
    }

    public String getCity() {
        return city;
    }
    @XmlElement
    public void setCity(String city) {
        this.city = city;
    }

    public String getStreet() {
        return street;
    }
    @XmlElement
    public void setStreet(String street) {
        this.street = street;
    }

    public String getHouse() {
        return house;
    }
    @XmlElement
    public void setHouse(String house) {
        this.house = house;
    }
}
