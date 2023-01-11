import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

class Market {
    private List<GrainListing> grainListings;
    private Map<String, Seller> sellers;
    private Map<String, Buyer> buyers;
    private List<Transaction> transactions;
    private List<Payment> payments;
    private List<Delivery> deliveries;

    public Market() {
        this.grainListings = new ArrayList<>();
        this.sellers = new HashMap<>();
        this.buyers = new HashMap<>();
        this.transactions = new ArrayList<>();
        this.payments = new ArrayList<>();
        this.deliveries = new ArrayList<>();
    }

    public void addGrainListing(GrainListing grainListing) {
        this.grainListings.add(grainListing);
    }

    public void removeGrainListing(GrainListing grainListing) {
        this.grainListings.remove(grainListing);
    }

    public List<GrainListing> searchGrainListings(String grainType, int quantity) {
        List<GrainListing> results = new ArrayList<>();
        for (GrainListing listing : grainListings) {
            if (listing.getGrainType().equals(grainType) && listing.getQuantity() >= quantity) {
                results.add(listing);
            }
        }
        return results;
    }

    public void addSeller(Seller seller) {
        this.sellers.put(seller.getId(), seller);
    }

    public void removeSeller(Seller seller) {
        this.sellers.remove(seller.getId());
    }

    public Seller getSeller(String id) {
        return this.sellers.get(id);
    }

    public void addBuyer(Buyer buyer) {
        this.buyers.put(buyer.getId(), buyer);
    }

    public void removeBuyer(Buyer buyer) {
        this.buyers.remove(buyer.getId());
    }

    public Buyer getBuyer(String id) {
        return this.buyers.get(id);
    }

    public void addTransaction(Transaction transaction) {
        this.transactions.add(transaction);
    }
    public void addPayment(Payment payment) {
        this.payments.add(payment);
    }
    public void addDelivery(Delivery delivery) {
        this.deliveries.add(delivery);
    }
}