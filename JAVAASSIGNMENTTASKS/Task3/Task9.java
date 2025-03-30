
// 9. Write a Java program to read the contents of a file into a byte array
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

public class Task9 {
    public static void main(String[] args) {
        String path = "TechMRavi\\asssigntask\\Task3\\Task4.java";

        File file = new File(path);

        if (file.exists() && file.isFile()) {
            try (FileInputStream fis = new FileInputStream(file)) {
                byte[] byteArray = new byte[(int) file.length()]; 
                int bytesRead = fis.read(byteArray);

                System.out.println("File read successfully. Bytes read: " + bytesRead);
                System.out.println("Byte Array Content:");
                for (byte b : byteArray) {
                    System.out.print((char) b);
                }
            } catch (IOException e) {
                System.out.println("Error reading the file: " + e.getMessage());
            }
        } else {
            System.out.println("The specified file does not exist or is not a file.");
        }
    }
}
