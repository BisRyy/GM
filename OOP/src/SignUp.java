import java.util.Random;
import java.util.Scanner;

public class SignUp {
    private int type;
    private String id;
    private String name;
    private String address;
    private String email;
    private String phoneNumber;

    private Scanner input;

    public SignUp(){
        this(1);
    }
    public SignUp(int type){
        if( type == 1 || type == 2){
            this.type = type;
            input = new Scanner(System.in);
            fillInfo();
        }
        else{
            System.out.println("Invalid Type.");
        }
    }

    public void fillInfo(){
        System.out.println("Enter your name: ");
        name = input.nextLine();
        System.out.println("Enter your Address: ");
        address = input.nextLine();
        System.out.println("Enter your Email: ");
        email = input.nextLine();
        System.out.println("Enter your PhoneNumber: ");
        phoneNumber = input.nextLine();

        Random rand =  new Random();
        int ran = rand.nextInt(0, 100);

    }
}
