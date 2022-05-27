package restaurant.reservation.system;
import javax.xml.bind.annotation.*;

@XmlRootElement(name = "order")
@XmlAccessorType (XmlAccessType.FIELD)
public class Order {
    
    private String name;
    private double price;
    private String type;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }
}
