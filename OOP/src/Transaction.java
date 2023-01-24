public class Transaction {
    private Order order;
    private double price;
    private int quantity;
    private String buyer;
    private String seller;
    private String deliveryLocation;
    private String deliveryDate;
    private String contractNumber;
    private boolean isComplete;

    public Transaction(Order order, double price, int quantity,
                       String buyer, String seller, String deliveryLocation,
                       String deliveryDate, String contractNumber) {
        this.order = order;
        this.price = price;
        this.quantity = quantity;
        this.buyer = buyer;
        this.seller = seller;
        this.deliveryLocation = deliveryLocation;
        this.deliveryDate = deliveryDate;
        this.contractNumber = contractNumber;
        this.isComplete = false;
    }

    public Order getOrder() {
        return order;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public String getBuyer() {
        return buyer;
    }

    public void setBuyer(String buyer) {
        this.buyer = buyer;
    }

    public String getSeller() {
        return seller;
    }

    public void setSeller(String seller) {
        this.seller = seller;
    }

    public String getDeliveryLocation() {
        return deliveryLocation;
    }

    public void setDeliveryLocation(String deliveryLocation) {
        this.deliveryLocation = deliveryLocation;
    }

    public String getDeliveryDate() {
        return deliveryDate;
    }

    public void setDeliveryDate(String deliveryDate) {
        this.deliveryDate = deliveryDate;
    }

    public String getContractNumber() {
        return contractNumber;
    }

    public void setContractNumber(String contractNumber) {
        this.contractNumber = contractNumber;
    }

    public boolean getIsComplete() {
        return isComplete;
    }

    public void setIsComplete(boolean isComplete) {
        this.isComplete = isComplete;
    }
}
