import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;
 
public class Konek {
    public static Connection con;
    public static Statement stm;
    
    public static Connection config() throws SQLException{
        try {
            con=DriverManager.getConnection("jdbc:mysql://localhost/DIM", "root", "");
            stm = con.createStatement();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "koneksi gagal "+e.getMessage());
        }return con; 
    }
}