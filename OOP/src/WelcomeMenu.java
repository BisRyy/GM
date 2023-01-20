import java.util.Scanner;

public class WelcomeMenu {
    private static final Scanner scanner = new Scanner(System.in);
    public static int userType() {
        System.out.println("Welcome to the Grain Market and Delivery System");
        System.out.println(" >> I'm a.");
        System.out.println("1. Buyer");
        System.out.println("2. Seller");
        System.out.println("3. Admin");
        System.out.println("0. Exit");
        System.out.println("Please enter your choice: ");

        int choice = scanner.nextInt();

        return choice;
    }
}
