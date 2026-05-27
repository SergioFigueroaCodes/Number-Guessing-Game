import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args){

        Scanner input = new Scanner(System.in);
        Random random = new Random();

        int secretNumber = random.nextInt(100) + 1;
        int guess = 0;
        int attempts = 0;

        System.out.println("Welcome to the Guessing Game!");
        System.out.println("Guess a number between 1 and 100");

        while (guess != secretNumber) {

            System.out.print("Enter your guess:  ");

            while (!input.hasNextInt()) {
                System.out.println("Invalid input. Please enter a number");
                input.next(); // Removes invalid input.
            }

            guess = input.nextInt();

            if (guess < 0) {
                System.out.println("Please enter a positive number.");
                continue;

            }

            attempts++;

            if (guess < secretNumber) {
                System.out.println("Guess is too low!");

            } else if (guess > secretNumber) {
                System.out.println("Guess is too high!");

            } else {
                System.out.println("Correct!");
                System.out.println("You guessed the number in " + attempts + " attempts!");

            }
        }
        input.close();
    }
}