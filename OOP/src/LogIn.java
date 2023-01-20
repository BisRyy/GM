import java.util.Scanner;

public abstract class LogIn {
    public String id;
    public String password;
    public final Scanner input = new Scanner(System.in);

    public void getID() {
        System.out.println("Enter your ID: ");
        id = input.nextLine();
    }

    public void getPassword(){
        System.out.println("Enter your Password: ");
        password = input.nextLine();
    }

    public boolean verifyPassword(){
        return true;
    }
}
