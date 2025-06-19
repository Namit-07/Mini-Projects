import java.util.Scanner;
import java.util.Random;
import java.util.SortedMap;

class Game {
    public int guess;
    public int inputNumber;
    public int noOfGuesses = 0;

    public int getNoOfGuesses() {
        return noOfGuesses;
    }

    public void setNoOfGuesses(int noOfGuesses) {
        this.noOfGuesses = noOfGuesses;
    }

    Game() {
        Random rand = new Random();
        this.guess = rand.nextInt(100);
    }

    void takeUserInput() {
        System.out.println("Guess the number");
        Scanner sc = new Scanner(System.in);
        inputNumber = sc.nextInt();
    }

    boolean isCorrectNumber() {
        noOfGuesses++;
        if (inputNumber == guess) {
            System.out.format("You guessed the number correctly, it was %d\nYou guessed it in %d guesses\n", guess, noOfGuesses);
            return true;
        } else if (inputNumber > guess) {
            System.out.println("Too high...");
        } else if (inputNumber < guess) {
            System.out.println("Too low...");
        }
        return false;
    }
}


public class Guesstheno_Ex3 {
    public static void main(String[] args) {
        Game g = new Game();
        boolean b = false;
        while (!b) {
            g.takeUserInput();
            b = g.isCorrectNumber();
            System.out.println(b);
        }
    }
}



