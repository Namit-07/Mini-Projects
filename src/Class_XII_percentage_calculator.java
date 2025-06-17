import java.util.Scanner;
// Percentage Calculator Multi input use

public class Class_XII_percentage_calculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Total marks");
        int totalMarks = sc.nextInt();
        System.out.println("Marks in Physics");
        float Phy = sc.nextFloat();
        System.out.println("Marks in Chemistry");
        float Chem = sc.nextFloat();
        System.out.println("Marks in Mathematics");
        float Maths = sc.nextFloat();
        System.out.println("Marks in English");
        float Eng = sc.nextFloat();
        System.out.println("Marks in Physical Education");
        float PE = sc.nextFloat();
        System.out.println("Your percentage is");
        float percentage = (Phy+Chem+Maths+Eng+PE)*100/totalMarks;
        System.out.println(percentage);










    }
}
