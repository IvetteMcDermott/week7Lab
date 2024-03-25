package week7Lab.MaxRandom;

public class maxRandom {
    // variables
    private int[] randomNums = new int[10];
    private int max;

    // constructor

    // set

    // compute
    public void computeRandomNums() {

        for (int i = 0; i < randomNums.length; i++) {
            randomNums[i] = (int) (Math.random() * 10) + 1;
        }

        max = randomNums[0];
        for (int x = 0; x < randomNums.length; x++) {
            if (max > randomNums[x]) {
            } else {
                max = randomNums[x];
            }
        }
    }

    // gets
    public int[] getRandomNums() {
        return randomNums;
    }

    public int getMax() {
        return max;
    }
}
