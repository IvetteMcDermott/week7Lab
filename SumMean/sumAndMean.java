package week7Lab.SumMean;

// import java.util.Scanner;

public class sumAndMean {

    // variables
    int[] randomNums = new int[10];

    int sum;
    int average;

    // constructor

    // sets

    // compute
    public void computeRandomNums() {
        for (int i = 0; i < randomNums.length; i++) {
            randomNums[i] = (int) (Math.random() * 10) + 1;
        }

        sum = 0;
        for (int x : randomNums) {
            sum += x;
        }

        average = sum / randomNums.length;
    }

    // get
    public int[] getRandomNums() {
        return randomNums;
    }

    public int getSum() {
        return sum;
    }

    public int getAverage() {
        return average;
    }
}
