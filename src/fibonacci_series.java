import java.util.Scanner;

public class fibonacci_series {
    static int fibonacci(int n){
        if(n==0) {
            return 0;
        }
        else if (n==1) {
            return 1;
        }
        else {
            return fibonacci(n - 1) + fibonacci(n - 2);
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the term in Fibonacci Series");
        int a = sc.nextInt();
        System.out.println("The " +fibonacci(a)+ " is the " +a+ " term in fibonacci Series");

    }
}
