import java.util.Scanner;

public class SellerLogIn extends LogIn {
    Seller seller;

    public Seller logIn() {
        getID();
        getPassword();
        if (verifyPassword()) {
            seller = getSeller();
        }
        return seller;
    }

    public Seller getSeller() {
        return new Seller("001", "Debebe", "AASTU 101 road", "Debebe@debe.com", "+2519555555");

    }
}