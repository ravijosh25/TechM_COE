import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class CreateDatabase {
    public static void main(String[] args) throws Exception{
        Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/","root", "Ravi@9876");
        System.out.println("Connection successful");
        Statement st=conn.createStatement();
        int rs=st.executeUpdate("create database Cars");
        System.out.println(rs==1?"Created":"Failed");
    }


}
