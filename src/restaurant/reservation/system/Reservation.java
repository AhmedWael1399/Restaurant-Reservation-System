package restaurant.reservation.system;
import javax.xml.bind.annotation.*;

@XmlRootElement(name = "reservation")
@XmlAccessorType (XmlAccessType.FIELD)

public class Reservation {
    
    private String reserver;
    private double resPrice;
    private int tableId;
    private String food;

    public String getReserver() {
        return reserver;
    }

    public void setReserver(String reserver) {
        this.reserver = reserver;
    }

    public double getResPrice() {
        return resPrice;
    }

    public void setResPrice(double resPrice) {
        this.resPrice = resPrice;
    }

    public int getTableId() {
        return tableId;
    }

    public void setTableId(int tableId) {
        this.tableId = tableId;
    }

    public String getFood() {
        return food;
    }

    public void setFood(String food) {
        this.food = food;
    }
}
