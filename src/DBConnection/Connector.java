
package DBConnection;

import com.mysql.jdbc.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;


public class Connector {
    
     public static java.sql.Connection getConnection() {
        java.sql.Connection c = null;
        try {
            Class.forName("com.mysql.jdbc.Driver");
             c = DriverManager.getConnection("jdbc:mysql://localhost/HotelData", "root", "");
        } catch (ClassNotFoundException ex) {
            System.out.println(ex.getMessage());
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        }
        return c;
     }
    
     public static void main(String[] args) {
        getConnection();
    }
     
}
