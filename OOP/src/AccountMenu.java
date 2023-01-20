import java.util.Scanner;

public class AccountMenu {
    private static Scanner scanner = new Scanner(System.in);

    public static boolean accountMenu(int userType) {
        int choice;
        boolean response = false;

        System.out.println("Welcome to the GM!");
        System.out.println("1. Login");
        System.out.println("2. Sign up");
        System.out.println("0. Exit");
        System.out.println("Please enter your choice: ");

        choice = scanner.nextInt();

        switch (choice) {
            case 1 -> {
                return  logIn(userType);
            }
            case 2 -> {
                return signUp(userType);
            }
            case 0 -> System.exit(0);
            default -> System.out.println("Invalid choice");
        }

        return response;
    }

    public static boolean logIn(int userType){
        LogIn login = new LogIn(userType);

        return login.verifyPassword();
    }

    public static boolean signUp(int userType){
        SignUp signup = new SignUp();

        return signup.createAccount(userType);
    }
}
