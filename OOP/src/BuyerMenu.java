import java.util.Scanner;

public class BuyerMenu {
    private static Scanner scanner = new Scanner(System.in);
    public static void buyerMenu(){
        while(true){
            System.out.println("Welcome to the GM!");
            System.out.println("1. Search");
            System.out.println("2. View Cart");
            System.out.println("3. View Orders");
            System.out.println("0. Exit");
            System.out.println("Please enter your choice: ");

            int choice = scanner.nextInt();

            switch (choice) {
                case 1 -> System.out.println("Search");
                case 2 -> System.out.println("View Cart");
                case 3 -> System.out.println("View Orders");
                case 0 -> System.exit(0);
                default -> System.out.println("Invalid choice");
            }
        }
    }

}
