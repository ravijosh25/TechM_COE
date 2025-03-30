// 2. Write a Java program to get specific files with extensions from a specified folder

import java.io.File;
import java.io.FilenameFilter;

public class Task2 {
    public static void main(String[] args) {
        String path = "TechMRavi\\asssigntask\\Task3";
        String extension = ".txt";

        File directory = new File(path);

        if(directory.isDirectory()){
            FilenameFilter filter = new FilenameFilter() {
                @Override
                public boolean accept(File dir, String name) {
                    return name.endsWith(extension);
                }
            };
            filter.accept(directory, extension);

            String [] files =  directory.list(filter);

            if(files != null && files.length > 0){
                System.out.println("The Files and Directory present in this path \""+path+"\" with extension \" "+extension+"\" are : ");
                for(String file : files){
                    System.out.println(file);
                }
            }else{
                System.out.println("No files with '" + extension + "' extension found.");
            }
        }else{
            System.out.println("The given path is not a directory.");
        }
    }
}
