import java.util.Scanner;

public class AccountMenu {
    private static final Scanner scanner = new Scanner(System.in);
    static int choice;

    public static int menuChoice(int userType) {
        boolean response = false;

        System.out.println("Welcome to the GM!");
        System.out.println("1. Login");
        System.out.println("2. Sign up");
        System.out.println("0. Exit");
        System.out.println("Please enter your choice: ");

        choice = scanner.nextInt();

        return choice;
    }

    public static void createAccount(int userType){
        SignUp signup = new SignUp();

        signup.createAccount(userType);
    }
}
