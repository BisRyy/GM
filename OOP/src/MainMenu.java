import java.util.Scanner;

public class MainMenu {
    private static Scanner scanner = new Scanner(System.in);

    private static void mainMenu(int userType, boolean confirm) {
        if (confirm){
            if (userType == 1){
                BuyerMenu adminMenu = new BuyerMenu();
                BuyerMenu.buyerMenu();
            }
            else if (userType == 2){
                SellerMenu adminMenu = new SellerMenu();
                SellerMenu.sellerMenu();
            }
            else {
                AdminMenu adminMenu = new AdminMenu();
                AdminMenu.adminMenu();
            }
        }
    }
}
