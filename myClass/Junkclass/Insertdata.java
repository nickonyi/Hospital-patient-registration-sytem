package myClass.Junkclass;
import java.sql.*;
import java.sql.DriverManager;

public class Insertdata {
    public static void main(String[] args){
      try {
    Class.forName("com.mysql.cj.jdbc.Driver");
    System.out.println("Connecting to the database.......");
    Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/Hospital-patient-registration-management-system","root","");
    System.out.println("You are now connected to the database");  
    System.out.println("Inserting data into the database");
    Statement stmt = conn.createStatement();
    String sql = "INSERT INTO Visitors_DB()" + "VALUES(007,'James Bond','Mombasa','Mombasa/0007/02/08/2022')";
    stmt.executeUpdate(sql);
     sql = "INSERT INTO Visitors_DB()" + "VALUES(030,'Steph Curry','Carlifonia','Carlifonia/0047/02/08/2022')";
    stmt.executeUpdate(sql);
    System.out.println("Inserted the records into the Database");
    
    } catch(Exception e){System.out.println(e);} 
    }
}
