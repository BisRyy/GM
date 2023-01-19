import java.util.List;

public class Main {
    public static void main(String[] args) {
        Seller abebe =  new Seller("001", "Abebe", "AASTU 101 road", "Abe@abebe.com","+2519555555");

        var shimbira = new GrainListing("Shimbira",12,200,"001");
        var bakela = new GrainListing("Bakela",120,500,"001");

        abebe.addGrainListing(new GrainListing("Ater",32,300,"001"));
        abebe.addGrainListing(shimbira);
        abebe.addGrainListing(bakela);

        List<GrainListing> grains = abebe.getGrainListings();
        for (int i = 0; i < grains.size(); i++){
            System.out.println(grains.get(i).getGrainType());
        }

        SignUp newuser = new SignUp();

    }
}