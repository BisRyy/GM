import java.util.Date;
import java.util.List;

public class Order {
    private String orderId;
    private List<Grain> items;
    private double totalPrice;
    private Buyer buyer;
    private Seller seller;
    private String deliveryLocation;
    private Date deliveryDate;
    private boolean isComplete;

    Order(String orderId, List<Grain> items, double totalPrice, Buyer buyer, Seller seller, String deliveryLocation, Date deliveryDate) {
        this.orderId = orderId;
        this.items = items;
        this.totalPrice = totalPrice;
        this.buyer = buyer;
        this.seller = seller;
        this.deliveryLocation = deliveryLocation;
        this.deliveryDate = deliveryDate;
        this.isComplete = false;
    }

    public String getOrderId() {
        return orderId;
    }

    void setCompleted() {
        this.isComplete = true;
    }

    public boolean isComplete() {
        return isComplete;
    }

    public List<Grain> getItems() {
        return items;
    }



}