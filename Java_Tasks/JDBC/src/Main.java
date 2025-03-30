//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.ResultSet;
public class Main {
    public static void main(String[] args) {
        String url = "jdbc:mysql://localhost:3306/company"; // Replace with your DB URL
        String user = "root"; // Replace with your DB username
        String password = "Ravi@9876"; // Replace with your DB password

        try {
            // Load MySQL JDBC Driver (for Java 8 and older)
            Class.forName("com.mysql.cj.jdbc.Driver");

            // Establish connection
            Connection conn = DriverManager.getConnection(url, user, password);
            System.out.println("Connected to the database successfully!");

            // Create statement
            Statement st = conn.createStatement();
            ResultSet rs = st.executeQuery("SELECT * FROM Employees"); // Replace with your table name

            // Process results
            while (rs.next()) {
                System.out.println("Employee ID: " + rs.getInt("EmployeeID") + ", Name: " + rs.getString("FirstName"));
            }

            // Close resources
            rs.close();
            st.close();
            conn.close();
        } catch (Exception e) {
            System.out.println("Connection failed!");
            e.printStackTrace();
        }
    }


}