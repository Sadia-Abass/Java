import java.util.Scanner;
import java.util.Random;

public class DogGenetics {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        Random rnd = new Random();

        System.out.print("What is your dog's name? ");
        String dogName = sc.nextLine();

        System.out.println("Well then, I have this highly reliable report on " + dogName + "'s prestigious background right here.");
        System.out.println();
        System.out.println(dogName + " is:");
        System.out.println();

        //array to hold types dog breed
        String[] dogBreed = {"St. Bernard", "Chihuahua", "Dramatic RedNosed Asian Pug", "Common Cur", "King Doberman"};

        // array that holds randomly number of value that adds up to 100
        int[] percents = new int[5];
        for (int i = 0; i < 100; i++) {
            int breedPercent = rnd.nextInt(5);
            percents[breedPercent ] = percents[breedPercent ] + 1;
        }

        // goes through the dogBreed breed array length, then prints the
        for(int i = 0; i < dogBreed.length; i++){
            System.out.println(percents[i] + "% " + dogBreed[i] );
        }

        System.out.println();
        System.out.println("Wow, that's QUITE the dog!");
    }
}
