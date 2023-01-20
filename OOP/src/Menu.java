public class Menu {

    public static void welcomeMenu() {
        while(true){
            System.out.println("Welcome to the GM!");
            System.out.println(" >> I'm a.");
            System.out.println("1. Buyer");
            System.out.println("2. Seller");
            System.out.println("3. Admin");
            System.out.println("0. Exit");
            System.out.println("Please enter your choice: ");

            int choice = Integer.parseInt(System.console().readLine());

            switch (choice) {
            case 1:
            case 2:
                boolean login =  accountMenu(choice);
                mainMenu(choice, login);
                break;
            case 3:
                break;
            case 0:
                System.exit(0);
                break;
            default:
                System.out.println("Invalid choice");
                break;}
        }
    }

    public static boolean accountMenu(int userType){
        int choice;
        boolean response = false;

        do{
            System.out.println("Welcome to the GM!");
            System.out.println("1. Login");
            System.out.println("2. Sign up");
            System.out.println("0. Exit");
            System.out.println("Please enter your choice: ");

            choice = Integer.parseInt(System.console().readLine());

            switch (choice) {
            case 1:
                LogIn login = new LogIn(userType);
                response = login.verifyPassword();
                break;
            case 2:
                // SignUp signup = new SignUp(userType);
                break;
            case 0:
                System.exit(0);
                break;
            default:
                System.out.println("Invalid choice");
                break;}
        }while(!response);
        
        return response;
    }

    private static void mainMenu(int userType, boolean confirm) {
        if (confirm){
            if (userType == 1)
                buyerMenu();
            else if (userType == 2)
                sellerMenu();
            else
                adminMenu();
        }
    }

    public static void adminMenu(){
        while(true){
            System.out.println("Welcome to the GM!");
            System.out.println("1. Add User");
            System.out.println("2. View Users");
            System.out.println("3. View Orders");
            System.out.println("0. Exit");
            System.out.println("Please enter your choice: ");

            int choice = Integer.parseInt(System.console().readLine());

            switch (choice) {
            case 1:
                System.out.println("Add User");
                break;
            case 2:
                System.out.println("View Users");
                break;
            case 3:
                System.out.println("View Orders");
                break;
            case 0:
                System.exit(0);
                break;
            default:
                System.out.println("Invalid choice");
                break;}
        }
    }

    public static void buyerMenu(){
        while(true){
            System.out.println("Welcome to the GM!");
            System.out.println("1. Search");
            System.out.println("2. View Cart");
            System.out.println("3. View Orders");
            System.out.println("0. Exit");
            System.out.println("Please enter your choice: ");

            int choice = Integer.parseInt(System.console().readLine());

            switch (choice) {
            case 1:
                System.out.println("Search");
                break;
            case 2:
                System.out.println("View Cart");
                break;
            case 3:
                System.out.println("View Orders");
                break;
            case 0:
                System.exit(0);
                break;
            default:
                System.out.println("Invalid choice");
                break;}
        }
    }

    public static void sellerMenu(){
        while(true){
            System.out.println("Welcome to the GM!");
            System.out.println("1. Add Listing");
            System.out.println("2. View Listings");
            System.out.println("3. View Orders");
            System.out.println("0. Exit");
            System.out.println("Please enter your choice: ");

            int choice = Integer.parseInt(System.console().readLine());

            switch (choice) {
            case 1:
                System.out.println("Add Listing");
                break;
            case 2:
                System.out.println("View Listings");
                break;
            case 3:
                System.out.println("View Orders");
                break;
            case 0:
                System.exit(0);
                break;
            default:
                System.out.println("Invalid choice");
                break;}
        }
    }

    public static void main(String[] args) {
        welcomeMenu();
    }
}
