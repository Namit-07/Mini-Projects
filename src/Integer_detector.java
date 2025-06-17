// Integer Detector
import java.util.Scanner;

public class Integer_detector {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter a number");
        boolean num = sc.hasNextInt();
        System.out.println(num);
    }
}
