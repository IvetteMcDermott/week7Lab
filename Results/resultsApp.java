package week7Lab.Results;

import javax.swing.JOptionPane;

public class resultsApp {
    public static void main(String[] args) {
        // variables
        int subjects;
        String finalString;
        String averageGrade;
        subjects = 0;

        subjects = resultsInput.sInput(subjects);

        int[] results;
        results = new int[subjects];

        int average;

        // object
        results R = new results();

        // inputs
        results = (int[]) resultsInput.rInputs(results, subjects);

        // set
        R.setResults(results);
        R.setSubjects(subjects);

        // compute
        R.computeResponse();

        // get
        average = R.getAverage();
        averageGrade = R.getAverageGrade();
        finalString = R.getFinalString();

        // output
        JOptionPane.showMessageDialog(null, finalString, "Grades by Module",
                JOptionPane.PLAIN_MESSAGE);
        JOptionPane.showMessageDialog(null, "Average " + average + "\nFinal Result " + averageGrade,
                "Average for Semester",
                JOptionPane.PLAIN_MESSAGE);
    }
}
