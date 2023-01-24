import java.util.ArrayList;
import java.util.List;

class Seller extends Person{
    private List<Grain> grains;

    public Seller(String id, String name, String address, String email, String phoneNumber) {
        this.id = id;
        this.name = name;
        this.address = address;
        this.email = email;
        this.phoneNumber = phoneNumber;
        this.grains = new ArrayList<>();
    }

    public List<Grain> getGrainListings() {
        return this.grains;
    }

    public void addGrainListing(Grain grain) {
        this.grains.add(grain);
    }

    public void removeGrainListing(Grain grain) {
        this.grains.remove(grain);
    }
}