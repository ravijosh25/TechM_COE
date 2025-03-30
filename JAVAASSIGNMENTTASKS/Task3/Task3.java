// 3. Write a Java program to check if a file or directory specified by pathname exists or not.

import java.io.File;

public class Task3 {
    public static void main(String[] args) {
        String path = "TechMRavi\\asssigntask\\Task3";


        File fileOrDirectory = new File(path);

        if (fileOrDirectory.exists()) {
            if (fileOrDirectory.isDirectory()) {
                System.out.println("The path refers to an existing directory.");
            } else if (fileOrDirectory.isFile()) {
                System.out.println("The path refers to an existing file.");
            }
        } else {
            System.out.println("The specified file or directory does not exist.");
        }
    }
}
