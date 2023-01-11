import java.util.ArrayList;
import java.util.List;

class Seller {
    private String id;
    private String name;
    private String address;
    private String email;
    private String phoneNumber;
    private List<GrainListing> grainListings;

    public Seller(String id, String name, String address, String email, String phoneNumber) {
        this.id = id;
        this.name = name;
        this.address = address;
        this.email = email;
        this.phoneNumber = phoneNumber;
        this.grainListings = new ArrayList<>();
    }

    public String getId() {
        return this.id;
    }

    public String getName() {
        return this.name;
    }

    public String getAddress() {
        return this.address;
    }

    public String getEmail() {
        return this.email;
    }

    public String getPhoneNumber() {
        return this.phoneNumber;
    }

    public List<GrainListing> getGrainListings() {
        return this.grainListings;
    }

    public void addGrainListing(GrainListing grainListing) {
        this.grainListings.add(grainListing);
    }

    public void removeGrainListing(GrainListing grainListing) {
        this.grainListings.remove(grainListing);
    }
}