import java.util.*;

public class Nurse {
    //properties 
    String name;
    String county_of_residence;
    String id;

    //methods
    void register (){
        Scanner input = new Scanner(System.in);
        Patient list_of_patients[] = new Patient[3];

        int count = 0;
        while(count < 3){
            System.out.println("Enter your name");
            name = input.nextLine();
            System.out.println("Enter county of residence");
            county_of_residence = input.nextLine();
            System.out.println("Enter id");
            id = input.nextLine();
            Patient aPatient = new Patient(name,county_of_residence,id);
            list_of_patients[count] = aPatient;
            count++;
        }

        for(count=0; count<list_of_patients.length; count++){
            System.out.println("Name: " +list_of_patients[count].name);
            System.out.println("County_of_residence: " + list_of_patients[count].county_of_residence);
            System.out.println("id: "+list_of_patients[count].id);
        }

    }
}