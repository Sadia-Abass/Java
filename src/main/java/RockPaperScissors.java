import java.util.Scanner;
import java.util.Random;

public class RockPaperScissors {


    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        Random rd = new Random();

        // welcome and prompt user to enter the amount of round they want to play
        System.out.println("Welcome to Rock, Paper, Scissors Game!");
        //System.out.println("Welcome to Rock, Paper, Scissors Game!");
        System.out.println("How many rounds do wants to play; ");
        int minRound = 1;
        int maxRound = 10;

        int round =  sc.nextInt();

        if(round >= minRound && round <= maxRound){
            for(int i = 0; i <= round; i++) {
                System.out.println("********** Game Rules **********");
                System.out.println("Please choose your hand - 1 = Rock, 2 = Paper, 3 = Scissors : ");
                // users choice
                int userHand = sc.nextInt();

                // choices made by player and computer
                userChoice(userHand);
                ComputersChoice(rd);


            }

        } else{
            System.out.println("You have provided an incorrect amount of rounds, goodbye!");
        }

    }

    //method hand computer choice
    private static void ComputersChoice(Random rd) {
        // computers choice
        int randomBound = 3;
        int computerHand = rd.nextInt(randomBound) + 1;
        if (computerHand == 1) {
            System.out.println("Computers choice: Rock");
        } else if (computerHand == 2) {
            System.out.println("Computers choice: Paper");
        } else if (computerHand == 3) {
            System.out.println("Computers choice: Scissors");
        }
    }

    private static void userChoice(int userHand) {
            if (userHand == 1) {
                System.out.println("You choice: Rock");
            } else if (userHand == 2) {
                System.out.println("You choice: Paper");
            } else if (userHand == 3) {
                System.out.println("You choice: Scissors");
            }else{
                System.out.println("You have entered an incorrect hand");
                System.out.println("Please try again");
                userChoice(userHand);
            }
    }
}
