package week7Lab.MaxRandom;

import java.util.Scanner;

public class maxRandomApp {
    // https://www.geeksforgeeks.org/how-to-print-colored-text-in-java-console/
    public static final String ANSI_RESET = "\u001B[0m";
    public static final String ANSI_RED = "\u001B[31m";
    public static final String ANSI_GREEN = "\u001B[32m";

    public static void main(String[] args) {

        // open scanner
        Scanner sc = new Scanner(System.in);
        // variables
        int[] randomNums = new int[10];
        int max;
        String start;

        // constructor
        max = 0;

        // object
        maxRandom MX = new maxRandom();

        // input start the app
        System.out.println("Do you to run the app? Yes/No");
        start = sc.nextLine();

        // compute
        if (start.equalsIgnoreCase("yes")) {
            MX.computeRandomNums();
        } else if (start.equalsIgnoreCase("no")) {
            System.out.println("OK then, another time will be");
            System.exit(0);
        } else {
            System.out.println("Invalid Input");
            System.exit(0);
        }

        // get
        max = MX.getMax();
        randomNums = MX.getRandomNums();

        // output
        System.err.println("\nThe array values are:");

        for (int i = 0; i < randomNums.length; i++) {
            System.out.print(ANSI_GREEN + randomNums[i] + "   " + ANSI_RESET);
        }
        System.out.println("\n\nThe max number in the array is " + ANSI_RED + max + ANSI_RESET + "\n");

    }
}
