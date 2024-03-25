package week7Lab.SumMean;

public class sumAndMeanApp {

    public static void main(String[] args) {

        // variables
        int sum;
        int average;
        int[] randomNums = new int[10];

        // object
        sumAndMean SM = new sumAndMean();

        // computer
        SM.computeRandomNums();

        // gets
        sum = SM.getSum();
        average = SM.getAverage();
        randomNums = SM.getRandomNums();

        // outputs
        System.err.println("\nThe array values are:");

        for (int i = 0; i < randomNums.length; i++) {
            System.out.print(randomNums[i] + "   ");
        }
        System.out.println("\n\nThe sum of all the values in the array is " + sum);
        System.out.println("The average of the sum is " + average + "\n");
    }
}
