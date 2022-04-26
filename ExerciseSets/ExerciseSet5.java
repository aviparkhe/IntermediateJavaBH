package Exercises;

import java.util.*;

public class ExerciseSet5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random rd = new Random();
        int randomNumber = rd.nextInt(100);
        System.out.print("I have a random number from 0 to 100. Try to guess it: ");
        int guess = sc.nextInt();
        int numOfGuesses = 1;
        while (guess != randomNumber) {
            if (guess > randomNumber) {
                System.out.print("Your guess was too high. Guess lower: ");
                guess = sc.nextInt();
                numOfGuesses++;
            } else {
                System.out.print("Your guess was too low. Guess higher: ");
                guess = sc.nextInt();
                numOfGuesses++;
            }
        }

        System.out.println("Great Job! You guessed the number in " + numOfGuesses + " tries!");
    }
}
