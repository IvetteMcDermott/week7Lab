package week7Lab.Guessing;

import javax.swing.JOptionPane;

public class GuessingGameInput {

    public static int GuessNumber() {

        String input;
        int num;
        int play;

        num = 0;

        GuessingGame GG = new GuessingGame();

        // takes a String so to validate that is not empty entry
        input = JOptionPane.showInputDialog(null, "Guess what number I got? From 1 to 10");
        // validates not empty or null value is enter
        if (input != null && !input.isEmpty()) {
            // pass the input to int
            num = Integer.parseInt(input);
            // validates the value is in range
            if (num < 1 || num > 10) {
                JOptionPane.showMessageDialog(null, "Invalid input! Your lost!");
            }
        } else if (input == null) {
            JOptionPane.showMessageDialog(null, "BOO");
        } else {
            // if its empty gives a message
            JOptionPane.showMessageDialog(null, "Input can not be empty!");
        }
        return num;
    }

    public static int PlayAgain() {
        int play;

        play = JOptionPane.showConfirmDialog(null, "Do you want to play again?", "Time to decide...",
                JOptionPane.YES_NO_OPTION);

        return play;
    }
}
