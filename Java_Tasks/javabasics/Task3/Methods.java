import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Methods {

    public static void BufferReaderMethod() throws Exception {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("Enter the Input (By BufferReader): ");
        String str = bf.readLine();
        System.out.println("The Entered Text: " + str);
    }

    public static void ScannerMethod() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the input string:");
        String s1 = sc.nextLine();
        System.out.println("You entered string: " + s1);

        System.out.println("Enter the input integer:");
        int a = sc.nextInt();
        System.out.println("You entered integer: " + a);

        System.out.println("Enter the input float:");
        float f = sc.nextFloat();
        System.out.println("You entered float: " + f);
    }
}
