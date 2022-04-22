public class SummativeSums {
    public static void main(String[] args){

        // arrays to be summarised
        int[] arrOne = { 1, 90, -33, -55, 67, -16, 28, -55, 15 };
        int[] arrTwo = { 999, -60, -77, 14, 160, 301 };
        int[] arrThree = { 10, 20, 30, 40, 50, 60, 70, 80, 90, 100, 110, 120, 130,
                140, 150, 160, 170, 180, 190, 200, -99 };

        // print statements that print's the summary of all the array's using the arraySum() methods.
        System.out.println("#1 Array Sum: " + arraySum(arrOne));
        System.out.println("#2 Array Sum: " + arraySum(arrTwo));
        System.out.println("#3 Array Sum: " + arraySum(arrThree));

    }

    // method to add together all the elements of the array
    private static int arraySum(int[] input){

        // variable to hold the array sum value
        int sum = 0;

        // for loop to go through each index of array
        for(int i = 0; i < input.length; i++){
            sum += input[i];
        }

        return sum;
    }
}
