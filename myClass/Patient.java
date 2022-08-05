package myClass;
import java.sql.*;
import java.sql.DriverManager;

public class Patient {
   
    public boolean checkExist(String regNumber){
        boolean isAvailable = false;
       try {
        Class.forName("com.mysql.cj.jdbc.Driver");
        Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/Hospital-patient-registration-management-system","root","");
        Statement stmt = conn.createStatement();
        String sql = "SELECT * FROM Patients WHERE serialization = '"+regNumber +"' ";
        ResultSet res = stmt.executeQuery(sql);
          if(res.next()){
            isAvailable = true;
          } else {
            isAvailable = false;
          }
         
       } catch(Exception e){System.out.println(e);} 

       return isAvailable;
       
    }
    
}
