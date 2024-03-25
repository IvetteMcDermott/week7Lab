package week7Lab.Average;

public class AverageLetterInput {

    // to convert the alpha to numeric and run average of them
    public static int gradeValue(String gradeL) {

        // variable
        int grade;

        grade = 0;

        // conditional to find the numeric value of
        if (gradeL.equalsIgnoreCase("a")) {
            grade = 100;
        } else if (gradeL.equalsIgnoreCase("b")) {
            grade = 90;
        } else if (gradeL.equalsIgnoreCase("c")) {
            grade = 80;
        } else if (gradeL.equalsIgnoreCase("d")) {
            grade = 70;
        } else if (gradeL.equalsIgnoreCase("f")) {
            grade = 60;
        } else if (gradeL != "") {
            // validate that the input is just valid grades or exit the program
            System.out.println("Wrong Input, please start again.");
            System.exit(0);
        }
        return grade;

    }

    // to convert the numeric average to the alpha one
    public static String gradeValueL(double average) {

        // variable
        String gradeL;

        // initialize the variable
        gradeL = "";

        // conditional to find the alpha value of
        if (average <= 60) {
            gradeL = "F";
        } else if (average <= 70) {
            gradeL = "D";
        } else if (average <= 80) {
            gradeL = "C";
        } else if (average <= 90) {
            gradeL = "B";
        } else if (average <= 100) {
            gradeL = "A";
        }
        return gradeL;

    }
}