import java.util.Scanner;

public class WelcomeMenu {
    private static final Scanner scanner = new Scanner(System.in);
    public static boolean welcomeMenu() {
        System.out.println("Welcome to the Grain Market and Delivery System");
        System.out.println(" >> I'm a.");
        System.out.println("1. Buyer");
        System.out.println("2. Seller");
        System.out.println("3. Admin");
        System.out.println("0. Exit");
        System.out.println("Please enter your choice: ");

        int choice = scanner.nextInt();

        AccountMenu accountMenu = new AccountMenu();
        switch (choice) {
            case 1:
            case 2:
            case 3:
                return AccountMenu.accountMenu(choice);
            case 0:
                System.exit(0);
                break;
            default:
                System.out.println("Invalid choice");
            break;
        }
        return false;
    }
}
