import java.util.Scanner;

public class MainMenu {
    private static final Scanner scanner = new Scanner(System.in);
    static Buyer buyer;
    static Seller seller;

    static void menu() {
        int userType = WelcomeMenu.userType();
        int menuChoice = AccountMenu.menuChoice(userType);

        if (menuChoice == 1) {
            createUser(userType);
            mainMenu(userType);
        } else if (menuChoice == 2) {
            AccountMenu.createAccount(userType);
        } else if (menuChoice == 0) {
            System.exit(0);
        } else {
            System.out.println("Invalid choice");
        }

    }

    private static void mainMenu(int userType) {
        if (userType == 1){
            BuyerMenu buyerMenu = new BuyerMenu();
            buyerMenu.buyerMenu(buyer);
        }
        else if (userType == 2){
            SellerMenu sellerMenu = new SellerMenu();
            sellerMenu.sellerMenu(seller);
        }
        else {
            AdminMenu adminMenu = new AdminMenu();
            adminMenu.adminMenu();
        }
    }

    private static void createUser(int userType) {
        if(userType == 1){
            BuyerLogIn buyerLogIn = new BuyerLogIn();
            buyer = buyerLogIn.logIn();
        } else if(userType == 2){
            SellerLogIn sellerLogIn = new SellerLogIn();
            seller = sellerLogIn.logIn();
        }
    }
}
