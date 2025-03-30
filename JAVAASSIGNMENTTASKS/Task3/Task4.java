// 4. Write a Java program to check if a file or directory has read and write permissions.

import java.io.File;

public class Task4 {
    public static void main(String[] args) {
        String path = "TechMRavi\\asssigntask\\Task3"; 

        File fileOrDirectory = new File(path);

        if (fileOrDirectory.exists()) {
            System.out.println("Read permission: " + (fileOrDirectory.canRead() ? "Yes" : "No"));
            System.out.println("Write permission: " + (fileOrDirectory.canWrite() ? "Yes" : "No"));
        } else {
            System.out.println("The specified file or directory does not exist.");
        }
    }
}
