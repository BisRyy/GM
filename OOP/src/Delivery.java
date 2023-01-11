public class Delivery {

    private int orderId;
    private int customerId;
    private int grainId;
    private int quantity;
    private boolean delivered;

    public Delivery(int orderId, int customerId, int grainId, int quantity) {
        this.orderId = orderId;
        this.customerId = customerId;
        this.grainId = grainId;
        this.quantity = quantity;
        this.delivered = false;
    }

    public int getOrderId() {
        return orderId;
    }

    public int getCustomerId() {
        return customerId;
    }

    public int getGrainId() {
        return grainId;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setDelivered(boolean delivered) {
        this.delivered = delivered;
    }

    public boolean isDelivered() {
        return delivered;
    }

}