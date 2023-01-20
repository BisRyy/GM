import java.util.Scanner;

public class BuyerLogIn extends LogIn {
    Buyer buyer;
    public Buyer logIn(){
        getID();
        getPassword();
        if(verifyPassword()){
            buyer = getBuyer();
        }
        return buyer;
    }

    public Buyer getBuyer(){
        return new Buyer("001", "Abebe", "AASTU 101 road", "Abe@abebe.com","+2519555555");
    }
}