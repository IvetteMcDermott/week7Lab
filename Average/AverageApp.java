package week7Lab.Average;

import java.util.Scanner;

public class AverageApp {
    public static void main(String[] args) {
        // scanner
        Scanner sc = new Scanner(System.in);

        // vars
        int qtySubject;
        double[] grade;
        String averageL;
        String gradeL;
        double grades;
        double average;

        // object
        Average Ave;
        Ave = new Average();

        // input
        System.err.println("How many subjects: ");
        qtySubject = sc.nextInt();
        // the array is takng the length from the input
        grade = new double[qtySubject];

        grades = 0;

        // loop for take in the grades as many times as subject value was enter
        for (int x = 0; x < qtySubject; x++) {
            System.out.println("Enter the grade: ");
            grade[x] = sc.nextInt();
            // adding all the grades to a total
            grades = grades + grade[x];
        }

        // set
        Ave.setQtySubject(qtySubject);
        Ave.setGrades(grades);

        // compute
        Ave.computeAverage();

        // get
        average = Ave.getAverage();
        averageL = Ave.getAverageL();

        // output
        System.out.println("\n" + "This is the report for your grades: \n");
        // loop by the grade array to find their alpha grade
        for (int i = 0; i < grade.length; i++) {
            // assign value from the array[index]
            Double grad = grade[i];
            // the compute with that value
            Ave.computeGradeL(grad);
            // get it back
            gradeL = Ave.getGradeL();

            System.out.println(grade[i] + " = " + gradeL);
        }
        // compute the average alpha
        Ave.computeAverageL();
        // gwt it back
        averageL = Ave.getAverageL();
        System.out.println(
                "\nThe average of your grades is: " + String.format("%.2f", average) + " = " + averageL + "\n");

        sc.close();
    }

}
