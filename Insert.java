import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class Insert {
    public static void main(String[] args) {
        String URL = "jdbc:mysql://localhost:3306/Tourist";
        String USER = "root";
        String PASSWORD = "seeni@2005";

        try {
            Connection con = DriverManager.getConnection(URL, USER, PASSWORD);

            
            String insertSQL = "INSERT INTO Tourist (Id, TouristF_Name, TouristL_Name, TEmail, TVisiting_date) VALUES (?, ?, ?, ?, ?)";

            PreparedStatement insertStatement = con.prepareStatement(insertSQL);
            insertStatement.setInt(1, 101); 
            insertStatement.setString(2, "Bhuvan"); 
            insertStatement.setString(3,"Seeni"); 
            insertStatement.setString(4, "Bhuvana@gmail.com"); 
            insertStatement.setString(5, "2024-08-19"); 

            insertStatement.executeUpdate();
            System.out.println("Insert operation completed successfully");
        } catch (SQLException ex) {
            System.out.println(ex);
        }
    }
}

