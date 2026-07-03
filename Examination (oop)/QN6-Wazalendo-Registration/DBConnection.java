import java.sql.Connection;
import java.sql.DriverManager;
import javax.swing.JOptionPane;

public class DBConnection {

    public static void main(String[] args) {

        try {
            Class.forName("net.ucanaccess.jdbc.UcanaccessDriver");

            Connection con = DriverManager.getConnection(
                "jdbc:ucanaccess://C:/Database/Wazalendo.accdb"
            );

            JOptionPane.showMessageDialog(null,
                    "Database connected successfully.");

            con.close();

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
    }
}