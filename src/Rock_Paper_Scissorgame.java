import java.util.Scanner;
import java.util.Random;

public class Rock_Paper_Scissorgame {
    public static void main(String[] args) {
        // 0 for Rock
        // 1 for Paper
        // 2 for Scissor

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 0 for Rock, 1 for Paper, 2 for Scissor " );
        int userInput = sc.nextInt();

        Random random = new Random();
        int computerInput = random.nextInt(3);

        if (userInput==computerInput){
            System.out.println("Draw");
        }
        else if(userInput==0 && computerInput==1 || userInput==2 && computerInput==1 ||
                userInput==1 && computerInput==0){
            System.out.println("You win");
        }
        else if(userInput>=3){
            System.out.println("Invalid input");
        }
        else{
            System.out.println("Computer win");
        }

    }
}
