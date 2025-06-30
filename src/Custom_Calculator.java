import java.util.Scanner;

class InvalidInputException extends Exception {
    @Override
    public String toString() {
        return "I am toString()";
    }
    @Override
    public String getMessage() {
        return "I am getMessage()";
    }
}
class CustomCalculator {
    double add(double a, double b) throws InvalidInputException{
        if (a==8 || b==9) {
            throw new InvalidInputException();
        }
        if (a>100000 || b>100000) {
            throw new InvalidInputException();
        }
        return a + b;
    }
    double subtract(double a, double b) throws InvalidInputException {
        if (a>100000 || b>100000) {
            throw new InvalidInputException();
        }
        return a - b;
    }
    double multiply(double a, double b) throws InvalidInputException {
        if (a>100000 || b>100000) {
            throw new InvalidInputException();
        }
        return a * b;
    }
    double divide(double a, double b) throws InvalidInputException, ArithmeticException {
        if (a>100000 || b>100000) {
            throw new InvalidInputException();
        }
        if(b==0){
            throw new ArithmeticException("Cannot divide by zero");
        }
        return a / b;
    }
}
public class Custom_Calculator {
    public static void main(String[] args) throws InvalidInputException {
        boolean flag = true;
        while (flag) {
            System.out.println("1. Addition");
            System.out.println("2. Subtraction");
            System.out.println("3. Multiplication");
            System.out.println("4. Division");
            System.out.println("Choose between the following operations: ");

            Scanner sc = new Scanner(System.in);
            int cc = sc.nextInt();

            if (cc == 1) {
                System.out.println("Enter two numbers to add: ");
                int a1 = sc.nextInt();
                int b1 = sc.nextInt();

                if (a1 == 8 && b1 == 9) {
                    try {
                        int i = a1 + b1;
                        throw new InvalidInputException();
                    } catch (Exception e) {
                        System.out.println("Cannot add 8 and 9");
                    }
                } else {
                    System.out.println("The sum is: " + (a1 + b1));
                }
            } else if (cc == 2) {
                System.out.println("Enter two numbers to subtract: ");
                int a2 = sc.nextInt();
                int b2 = sc.nextInt();
                System.out.println("The difference is: " + (a2 - b2));
            } else if (cc == 3) {
                System.out.println("Enter two numbers to multiply: ");
                int a3 = sc.nextInt();
                int b3 = sc.nextInt();
                System.out.println("The product is: " + (a3 * b3));
            } else if (cc == 4) {
                System.out.println("Enter two numbers to divide: ");
                int a4 = sc.nextInt();
                int b4 = sc.nextInt();
                if (b4 == 0) {
                    try {
                        throw new ArithmeticException();
                    } catch (ArithmeticException e) {
                        System.out.println("Cannot divide by zero");
                    }
                } else {
                    System.out.println("The quotient is: " + (a4 / b4));
                }
            }if (cc>=5){
                System.out.println("Invalid operation. Please choose a valid option.");
            }
        }
    }
}
















