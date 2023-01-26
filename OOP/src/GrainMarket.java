
import java.util.Scanner;

public class GrainMarket {

    private static Scanner scanner = new Scanner(System.in);

    public static void menu() {
        int choice;

        do {
            // display menu
            System.out.println("\nGrain Market and Delivery System");
            System.out.println("1. Display available grains");
            System.out.println("2. Place an order");
            System.out.println("3. View order history");
            System.out.println("4. Exit");
            System.out.print("Enter your choice: ");
            choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    // display available grains
                    displayGrains();
                    break;
                case 2:
                    // place an order
                    placeOrder();
                    break;
                case 3:
                    // view order history
                    viewOrderHistory();
                    break;
                case 4:
                    // exit
                    System.out.println("Exiting...");
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");
                    break;
            }
        } while (choice != 4);
    }

    private static void displayGrains() {
        // code to display available grains
        System.out.println("Displaying available grains...");
    }

    private static void placeOrder() {
        // code to place an order
        System.out.println("Placing an order...");
    }

    private static void viewOrderHistory() {
        // code to view order history
        System.out.println("Viewing order history...");
    }
}