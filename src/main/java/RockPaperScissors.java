import java.util.Locale;
import java.util.Scanner;
import java.util.Random;

public class RockPaperScissors {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        boolean answerYes = true;
        // call to the game's method to start the game
        game();
        System.out.println();

        //prompt for user input until values is false
        while (answerYes){
            System.out.print("Would you like to play again? Please enter y = yes or n = No: ");
            String answer = sc.nextLine().toLowerCase();
            if(answer.equals("n")){
                System.out.println("Thanks for playing!");
                answerYes = false;
            } else {
                game();
            }
        }
    }

    // Game's logic
    private static void game() {
        Scanner sc = new Scanner(System.in);
        // welcome and prompt user to enter the amount of round they want to play
        System.out.println("Welcome to Rock, Paper, Scissors Game!");
        System.out.print("How many rounds do wants to play: ");

        int minRound = 1;
        int maxRound = 10;
        int userWin = 0;
        int computerWin = 0;
        int tie = 0;

        int round = sc.nextInt();

        if (round >= minRound && round <= maxRound) {
            for (int i = 1; i <= round; i++) {
                System.out.println();
                System.out.println("********** Game Rules **********");
                System.out.print("Please choose your hand - 1 = Rock, 2 = Paper, 3 = Scissors : ");

                // users choice
                int userHand = sc.nextInt();
                // choices made by player and computer
                String user = userChoice(userHand);
                String computer = computersChoice();

                //Rules to determine the winner
                if (user.equals( computer)) {
                    System.out.println("Tie");
                    tie++;
                } else if ((user.equals("Rock") && computer.equals("Scissor"))
                        || (user.equals("Paper") && computer.equals("Rock")) || (user.equals("Scissor") && computer.equals("Paper"))) {
                    System.out.println("User win");
                    userWin++;
                } else {
                    System.out.println("Computer win");
                    computerWin++;
                }
                System.out.println();
            }
        } else {
            System.out.println("You have provided an incorrect amount of rounds, goodbye!");
        }

        //Game result
        System.out.println("Tie: " + tie + " User win: " + userWin + " Computer win: " + computerWin);
        System.out.println("Game Result");
        if (userWin > computerWin) {
            System.out.println("CongratulationS! You won!");
        } else if (userWin < computerWin) {
            System.out.println("Oh No! Computer won, better luck next time");
        } else {
            System.out.println("OH! sorry it's a tie, better luck next time");
        }
    }

    //method hand computer choice
    public static String computersChoice(){
        Random rd = new Random();
        String choice;

        // computers choice
        int randomBound = 3;
        int computerHand = rd.nextInt(randomBound) + 1;
        if (computerHand == 1) {
            System.out.println("Computers choice: Rock");
            choice = "Rock";
        } else if (computerHand == 2) {
            System.out.println("Computers choice: Paper");
            choice = "Paper";
        } else  { //if (computerHand == 3)
            System.out.println("Computers choice: Scissors");
            choice = "Scissors";
        }
        return choice;
    }

    //method hand user choice
    private static String userChoice(int userHand) {
        String choice = "";
            if (userHand == 1) {
                System.out.println("You choice: Rock");
                choice = "Rock";
            } else if (userHand == 2) {
                System.out.println("You choice: Paper");
                choice = "Paper";
            } else if (userHand == 3) {
                System.out.println("You choice: Scissors");
                choice = "Scissors";
            }else{
                System.out.println("You have entered an incorrect hand");
                System.out.println("Please try again");
                userChoice(userHand);
            }
            return choice;
    }
}
