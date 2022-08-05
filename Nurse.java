import java.util.Scanner;
import myClass.Patient;
import java.sql.*;
import java.sql.DriverManager;

public class Nurse extends User {
    
//methods
void register(String regNumber){
Patient patient1 = new Patient();
    if(patient1.checkExist(regNumber)){
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            System.out.println("Connecting to the database.........");
            Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/Hospital-patient-registration-management-system","root","");
            Statement stmt = conn.createStatement();
            String sql= "SELECT * FROM Visitors_DB WHERE serialization = '"+regNumber+"'";
            ResultSet res = stmt.executeQuery(sql);
            System.out.println("Patient present in the system");
            System.out.println("Displaying data.....");
            res.next();
            System.out.println(res.getString(1)+" "+res.getString(2)+" "+res.getString(3)+" "+res.getString(4));
        } catch(Exception e){System.out.println(e);} 
    } else {
System.out.println("Enter Name");
Scanner input = new Scanner(System.in);
String enteredName = input.nextLine();
System.out.println("Enter county of residence");
String county = input.nextLine();
System.out.println("Enter date");
String date = input.nextLine();
System.out.println("Enter Serial number");
String enteredNumber = input.nextLine();
System.out.println("Enter id");
int enteredId = input.nextInt(); 


try {
    Class.forName("com.mysql.cj.jdbc.Driver");
    System.out.println("Connecting to the database......");
    Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/Hospital-patient-registration-management-system","root","");
    System.out.println("Connected to the database");
    Statement stmt = conn.createStatement();
    String sql = "INSERT INTO Visitors_DB()"+"VALUES('"+enteredId+"','"+enteredName+"','"+county+"','"+enteredNumber+"')";
    stmt.executeUpdate(sql);
    sql = "INSERT INTO Patients()"+"VALUES('"+enteredName+"','"+county+"','"+enteredNumber+"','"+date+"')";
    stmt.executeUpdate(sql);
    System.out.println("Data inserted successfully");
    sql = " SELECT * FROM Visitors_DB";
    ResultSet res = stmt.executeQuery(sql);
    res.next();
    System.out.println(enteredId+" "+ enteredName+" "+ county+" "+ enteredNumber);
} catch(Exception e){System.out.println(e);} 
}
}
}

