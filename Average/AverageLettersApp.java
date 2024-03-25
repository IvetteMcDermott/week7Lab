package week7Lab.Average;

import java.util.Scanner;

public class AverageLettersApp {
    public static void main(String[] args) {
        // scanner
        Scanner sc = new Scanner(System.in);

        // vars
        int qtySubject;
        String gradeL;
        String averageL;
        int grade;
        double grades;
        double average;

        // object
        Average Ave;
        Ave = new Average();

        // input
        System.err.println("How many subjects: ");
        qtySubject = sc.nextInt();
        sc.nextLine(); // Consume new line, avoid duplicate print bug. nextInt

        grade = 0;
        grades = 0;
        averageL = "";

        for (int x = 1; x <= qtySubject; x++) {
            System.out.println("Enter the grade: (Alpha)");
            gradeL = sc.nextLine();

            grade = (int) AverageLetterInput.gradeValue(gradeL);
            grades = grades + grade;
        }

        // set
        Ave.setQtySubject(qtySubject);
        // brings the grades total, without it would just consider the last entry
        Ave.setGrades(grades);

        // compute
        Ave.computeAverage();
        Ave.computeAverageL();

        // get
        average = Ave.getAverage();
        averageL = Ave.getAverageL();

        // output
        System.out.println("\nThe average of your grades is: " + averageL + "\n");

        // close scanner
        sc.close();
    }

}
