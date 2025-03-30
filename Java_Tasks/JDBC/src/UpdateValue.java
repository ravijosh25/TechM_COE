import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class UpdateValue {
    public static void main(String[] args) throws Exception {

            // 1. Establish Connection
            Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/Cars", "root", "Ravi@9876");
            System.out.println("Connection successful!");

            // 2. Create Statement
            Statement st = conn.createStatement();

            // 3. Define Update SQL Query
        String insertSQL = "INSERT INTO Cars (CarName, Model) VALUES "
                + "('Tesla Model 3', 'Model 3'), "
                + "('Ford Mustang', 'Mustang GT'), "
                + "('BMW X5', 'X5 M50i')";

        // 4. Execute Insert Query
        int rowsInserted = st.executeUpdate(insertSQL);

        // 5. Check If Insertion Was Successful
        if (rowsInserted > 0) {
            System.out.println("New records added successfully!");
        } else {
            System.out.println("No records added.");
        }


        // 5. Close Connection
            conn.close();


    }
}
