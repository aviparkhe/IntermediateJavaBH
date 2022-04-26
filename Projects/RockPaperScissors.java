package Other;
import java.util.*;

public class RockPaperScissors {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int maxGames = 15;
        int gamesPlayed = 0;
        int gamesWon = 0;
        int gamesTied = 0;
        int gamesLost = 0;
        System.out.print("Hello! Welcome to rock paper scissors. Would you like to play? (yes/no): ");
        String playInitiative = sc.next();
        if (playInitiative.equals("yes")) {
            String playAgain = "yes";
            while (playAgain.equals("yes") && gamesPlayed < maxGames) {
                // Generate random choice
                String[] possibleChoices = {"rock", "paper", "scissors"};
                Random rd = new Random();
                int intChoice = rd.nextInt(possibleChoices.length);
                String computerChoice = possibleChoices[intChoice];
                System.out.print("Please enter either rock, paper, or scissors: ");
                String userChoice = sc.next();

                // Win/Lose/Tie IF logic
                if ((userChoice.equals("rock") && computerChoice.equals("scissors")) ||
                        (userChoice.equals("paper") && computerChoice.equals("rock")) ||
                        (userChoice.equals("scissors") && computerChoice.equals("paper"))) {
                    System.out.println("You win!");
                    gamesWon++;
                } else if ((userChoice.equals("rock") && computerChoice.equals("paper")) ||
                        (userChoice.equals("paper") && computerChoice.equals("scissors")) ||
                        (userChoice.equals("scissors") && computerChoice.equals("rock"))) {
                    System.out.println("You lose!");
                    gamesLost++;
                } else if (userChoice.equals(computerChoice)) {
                    System.out.println("Tie!");
                    gamesTied++;
                }

                gamesPlayed++;

                System.out.print("Play again? (yes/no): ");
                if (sc.next().equals("yes")) {
                    playAgain = "yes";
                } else {
                    playAgain = "no";
                }
            }

            double winPercent = (gamesWon * 100) / 15;
            System.out.println("You reached your max limit. You played " + gamesPlayed + " games, won " + gamesWon + " games, tied " + gamesTied + " games, and lost " + gamesLost + " games. Your win percentage was " + winPercent + "%");
            if (winPercent < 25.0) {
                System.out.println("Better luck next time!");
            }
        } else {
            System.out.println("Bye!");
        }
    }
}