import java.util.Scanner;

public class LogIn {
    private int type;
    private String id;
    private String password;
    private final Scanner input = new Scanner(System.in);


    LogIn(){
        getID();
        getPassword();
    }

    LogIn(int type){
        getID();
        getPassword();
    }
    LogIn(int type, String id){
        getPassword();
    }

    private void getID() {
        type = 1;
        System.out.println("Enter your ID: ");
        id = input.nextLine();
    }

    private void getPassword(){
        System.out.println("Enter your Password: ");
        password = input.nextLine();
    }

    private boolean verifyPassword(){
        return false;
    }
}