import java.util.Scanner;

public class SellerMenu {
    private final Scanner scanner = new Scanner(System.in);
    public void sellerMenu(Seller seller){
        while(true){
            System.out.println("Welcome to the GM!");
            System.out.println("1. Add Listing");
            System.out.println("2. View Listings");
            System.out.println("3. View Orders");
            System.out.println("0. Exit");
            System.out.println("Please enter your choice: ");

            int choice = scanner.nextInt();

            switch (choice) {
                case 1 -> System.out.println(seller.getPhoneNumber());
                case 2 -> System.out.println(seller.getEmail());
                case 3 -> System.out.println("View Orders");
                case 0 -> System.exit(0);
                default -> System.out.println("Invalid choice");
            }
        }
    }
}
