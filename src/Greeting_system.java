import java.util.Scanner;
// Greeting System

public class Greeting_system {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your name");
        String name = sc.nextLine();
        System.out.println("Hello " + name + " have a good day");

    }
}
