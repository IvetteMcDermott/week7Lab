package week7Lab.NumCount;

import java.util.Scanner;

public class numCountApp {

    public static void main(String[] args) {

        // variables
        int num;
        int counter;
        int[] randomNums = new int[10];

        // scanner
        Scanner sc = new Scanner(System.in);

        // object
        numCount NC = new numCount();

        // input
        System.out.println("Guess a number to find");
        num = sc.nextInt();

        // computer
        NC.computeRandomNums();
        NC.computeCounter(num);

        // gets
        randomNums = NC.getRandomNums();
        counter = NC.getCounter();

        // outputs
        System.err.println("\nThe array values are:");

        for (int i = 0; i < randomNums.length; i++) {
            System.out.print(randomNums[i] + "   ");
        }
        System.out.println("\n\nThe " + num + " appears in the array " + counter + " times\n");

        // closer scanner
        sc.close();

    }
}
