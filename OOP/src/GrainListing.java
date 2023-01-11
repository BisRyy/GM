class GrainListing {
    private String grainType;
    private int quantity;
    private double pricePerUnit;
    private String sellerId;

    public GrainListing(String grainType, int quantity, double pricePerUnit, String sellerId) {
        this.grainType = grainType;
        this.quantity = quantity;
        this.pricePerUnit = pricePerUnit;
        this.sellerId = sellerId;
    }

    public String getGrainType() {
        return this.grainType;
    }

    public int getQuantity() {
        return this.quantity;
    }

    public double getPricePerUnit() {
        return this.pricePerUnit;
    }

    public String getSellerId() {
        return this.sellerId;
    }

    public double getTotalPrice() {
        return this.quantity * this.pricePerUnit;
    }
}
