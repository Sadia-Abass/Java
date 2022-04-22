import java.util.Scanner;

public class HealthyHearts {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        // prompt the user to enter their age
        System.out.print("What is your age? ");
        int age = sc.nextInt();

        heartRateCalculator(age);

    }

    // method to calculate Heart Rate based on age entered by the User
    private static void heartRateCalculator(int age){
        Scanner sc = new Scanner(System.in);

        int maximumHeartRate = 220 - age;
        if(age >= 1 ){
            System.out.println("Your maximum heart rate should be " + maximumHeartRate  + " beats per minute");
            System.out.println("Your target HR Zone is " + (maximumHeartRate * 50 /100)
                    + " - " + (int)Math.ceil(maximumHeartRate * 85 /100.0) + " beats per minute"); // rounds to the nearest whole number
        }
        else{
            System.out.println("You have entered an incorrect age.");
            System.out.print("Goodbye!");
        }
    }
}
