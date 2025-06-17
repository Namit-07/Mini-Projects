import java.util.Scanner;
// Marks Input Review System

public class Marks_Input_Review_System {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your marks");
        int marks = sc.nextInt();
        if(marks>=90){
            System.out.println("You have passed");
        }
        else{
            System.out.println("You have failed");
        }

    }
}
