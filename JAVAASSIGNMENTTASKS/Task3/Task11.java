// 11. Write a Java program to read a plain text file.

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

public class Task11 {
    public static void main(String[] args) {
        String path = "TechMRavi\\asssigntask\\Task3\\Task4.java";

        try{
            List<String> lineList = Files.readAllLines(Paths.get(path));
            System.out.println("File content:");
            for (String line : lineList) {
                System.out.println(line);
            }
        } catch (IOException e) {
            System.out.println("Error reading the file: " + e.getMessage());
        }
    }
}
