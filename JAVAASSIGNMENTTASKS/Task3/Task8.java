// 8. Write a Java program to get the file size in bytes, KB, MB.

import java.io.File;

public class Task8 {
    public static void main(String[] args) {
        String path = "TechMRavi\\asssigntask\\Task3\\Task4.java";

        File file = new File(path);
        if (file.exists() && file.isFile()) {
            long bytes = file.length();
            double kilobytes = bytes / 1024.0;
            double megabytes = kilobytes / 1024.0;

            System.out.println("File size:");
            System.out.println("Bytes: " + bytes + " B");
            System.out.printf("Kilobytes: %.2f KB%n", kilobytes);
            System.out.printf("Megabytes: %.2f MB%n", megabytes);
        } else {
            System.out.println("The specified file does not exist or is not a file.");
        }
    }
}
