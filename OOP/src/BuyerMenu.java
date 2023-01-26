import java.util.Scanner;

public class BuyerMenu {
    private final Scanner scanner = new Scanner(System.in);
    public void buyerMenu( Buyer buyer) {
        while(true){
            System.out.println("Welcome to the GM!");
            System.out.println("1. Search");
            System.out.println("2. View Cart");
            System.out.println("3. View Orders");
            System.out.println("0. Exit");
            System.out.println("Please enter your choice: ");

            int choice = scanner.nextInt();

            switch (choice) {
                
                case 1 :
                    System.out.println(buyer.getEmail());
                    break;
                case 2 :
                    System.out.println(buyer.getPhoneNumber());
                    break;
                case 3 :
                    System.out.println("View Orders");
                    break;
                case 0 :
                    System.exit(0);
                    break;
                default :
                    System.out.println("Invalid choice");
                    break;
            }
        }
    }

}
