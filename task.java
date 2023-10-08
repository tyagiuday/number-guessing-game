import java.util.Random;
import java.util.Scanner;

public class task {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        int lowerBound = 1;
        int upperBound = 100;
        int randomNumber = random.nextInt(upperBound - lowerBound + 1) + lowerBound;

        int maxAttempts = 10;
        int attemptsLeft = maxAttempts;
        int userGuess;
        boolean hasGuessedCorrectly = false;

        System.out.println("TASK 1- NUMBER GUESSING GAME ~UDAY VEER SINGH");
        System.out.println("Welcome to the Number Guessing Game!");
        System.out.println("I've selected a number between 1 and 100. You have " + maxAttempts + " attempts to guess it.");

        while (attemptsLeft > 0) {
            System.out.print("Enter your guess: ");
            userGuess = scanner.nextInt();

            if (userGuess < lowerBound || userGuess > upperBound) {
                System.out.println("Please enter a number between 1 and 100.");
                continue;
            }

            attemptsLeft--;

            if (userGuess == randomNumber) {
                hasGuessedCorrectly = true;
                break;
            } else if (userGuess < randomNumber) {
                System.out.println("Try a higher number. Attempts left: " + attemptsLeft);
            } else {
                System.out.println("Try a lower number. Attempts left: " + attemptsLeft);
            }
        }

        if (hasGuessedCorrectly) {
            int userScore = maxAttempts - attemptsLeft;
            System.out.println("Congratulations! You've guessed the number " + randomNumber + " correctly.");
            System.out.println("Your score is: " + userScore);
        } else {
            System.out.println("Sorry, you've run out of attempts. The correct number was " + randomNumber + ".");
        }

        scanner.close();
    }
}