import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class CreateTable {
    public static void main(String[] args) {
        // Database credentials
        String url = "jdbc:mysql://localhost:3306/Cars";
        String user = "root";
        String password = "Ravi@9876";

        try {
            // 1. Establish Connection
            Connection conn = DriverManager.getConnection(url, user, password);
            System.out.println("Connection successful!");

            // 2. Create Statement
            Statement st = conn.createStatement();

            // 3. Define Correct SQL Query
            String createTableSQL = "CREATE TABLE IF NOT EXISTS Cars ("
                    + "CarID INT PRIMARY KEY AUTO_INCREMENT, "
                    + "CarName VARCHAR(50) NOT NULL, "
                    + "Model VARCHAR(100) UNIQUE"
                    + ")"; // Closing parenthesis added

            // 4. Execute SQL Statement
            st.executeUpdate(createTableSQL);
            System.out.println("Table 'Cars' created successfully!");

            // 5. Close Connection
            conn.close();

        } catch (SQLException e) {
            System.out.println("Database connection error!");
            e.printStackTrace();
        }
    }
}
