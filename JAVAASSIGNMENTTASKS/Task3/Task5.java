// 5. Write a Java program to check if the given pathname is a directory or a file.

import java.io.File;

public class Task5 {
    public static void main(String[] args) {
        String path1 = "TechMRavi\\asssigntask\\Task3";
        String path = "TechMRavi\\asssigntask\\Task3\\Task4.java";

        File fileOrDirectory = new File(path);
        if(fileOrDirectory.exists()){
            if(fileOrDirectory.isDirectory()){
                System.out.println("The File Path mentioned Above is Directory");
            }
            if(fileOrDirectory.isFile()){
                System.out.println("The File Path mentioned Above is A File!");
            }
        }
        else{
            System.out.println("No Directory Exists");
        }
    }
}
