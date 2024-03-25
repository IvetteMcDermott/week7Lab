package week7Lab.NumCount;

// import java.util.Scanner;

public class numCount {

    // variables
    private int[] randomNums = new int[5];
    private int num;
    private int counter;

    // constructor

    // sets
    public void setNum(int num) {
        this.num = num;
    }

    // compute
    public void computeRandomNums() {
        for (int i = 0; i < randomNums.length; i++) {
            randomNums[i] = (int) (Math.random() * 10) + 1;
        }
    }

    public void computeCounter(int num) {
        counter = 0;
        for (int x = 0; x < randomNums.length; x++) {
            if (num == randomNums[x]) {
                counter++;
            }
        }
    }

    // get
    public int[] getRandomNums() {
        return randomNums;
    }

    public int getCounter() {
        return counter;
    }
}
