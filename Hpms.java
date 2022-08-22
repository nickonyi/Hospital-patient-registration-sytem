import java.util.Scanner;

public class Hpms {
    public static void main(String[] args){
       Scanner input = new Scanner(System.in);
        System.out.println("Enter your name");
        String name = input.nextLine();
        System.out.println("Enter password");
        String password = input.nextLine();
        String cPassword = "12345";

        if(password.equals(cPassword)){
            Nurse nurse1 = new Nurse();
            nurse1.register();
        } else {
            System.out.println("Wrong pasword");
        }
   
       

    }
}
