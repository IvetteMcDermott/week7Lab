package week7Lab.Results;

import javax.swing.JOptionPane;

public class resultsInput {
    // Joption to get the subjects input and return it for use it in other methods
    public static int sInput(int subjects) {
        String sTemp;
        Boolean valid;
        sTemp = "";
        valid = false;
        while (valid == false) {
            sTemp = JOptionPane.showInputDialog(null, "Enter the number of subjects", "Subjects",
                    JOptionPane.PLAIN_MESSAGE);
            if (!sTemp.isEmpty()) {
                valid = true;
            }
        }

        while (sTemp != null && !sTemp.isEmpty()) {
            subjects = Integer.parseInt(sTemp);
            return subjects;
        }

        return subjects;
    }

    // loop with joption to get the results for each subject/module
    public static int[] rInputs(int[] results, int subjects) {
        String temp;
        int iTemp;
        iTemp = 0;
        temp = "";
        // inputs
        for (int i = 0; i < subjects; i++) {
            // take the input as string so can be validate is not empty or null
            temp = JOptionPane.showInputDialog(null, "Enter the results for module " + (i + 1),
                    "Entry of results", JOptionPane.PLAIN_MESSAGE);
            // check if not empty
            if (temp != null && !temp.isEmpty()) {
                // convert the input to integer to perform the assign to the results
                iTemp = Integer.parseInt(temp);
                // if the input is in range
                if (iTemp > 0 && iTemp <= 100) {
                    results[i] = iTemp;
                } else {
                    JOptionPane.showMessageDialog(null, "Input Out of Range\nStart again please", "Alert!",
                            JOptionPane.WARNING_MESSAGE);
                    System.exit(0);
                }
            } else {
                JOptionPane.showMessageDialog(null, "Invalid Input\nStart again please", "Alert!",
                        JOptionPane.WARNING_MESSAGE);
                System.exit(0);
            }
        }

        return results;

    }
}
