import java.util.ArrayList;
import java.util.List;

class Seller extends Person{
    private List<GrainListing> grainListings;

    public Seller(String id, String name, String address, String email, String phoneNumber) {
        this.id = id;
        this.name = name;
        this.address = address;
        this.email = email;
        this.phoneNumber = phoneNumber;
        this.grainListings = new ArrayList<>();
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