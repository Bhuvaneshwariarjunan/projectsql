import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
public class project1 {
    public static void main(String[] sgd){
        String URL="jdbc:mysql://localhost:3306/Demol";
        String USER="root";
        String PASSWORD="seeni@2005";
        try {
            Connection con=DriverManager.getConnection(URL,USER,PASSWORD);
             System.out.println("Success");
             Statement selectStatement=con.createStatement();
             String createTableSQL="CREATE TABLE Employee("+"id INT AUTO_INCREMENT PRIMARY KEY,"
        +"F_Name VARCHAR(20)NOT NULL,"
        +"L_NAME VARCHAR(18)NOT NULL,"
        +"Email VARCHAR(30)NOT NULL,"
        +"Joining_date DATE NOT NULL"+")";
        selectStatement.executeUpdate(createTableSQL);
        System.out.println("Table create successfully");
        }
        
        catch(SQLException e){
        System.out.println(e);
        
        }
               }
    }
