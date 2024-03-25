package week7Lab.Average;

// import java.util.Scanner;

public class Average {

    // vars
    private int qtySubject;
    private double grad;
    private String gradeL;
    private double grades;
    private double average;
    private String averageL;

    // constructor

    // set
    public void setQtySubject(int qtySubject) {
        this.qtySubject = qtySubject;
    }

    public void setGrades(double grades) {
        this.grades = grades;
    }

    public void setGrade(double grad) {
        this.grad = grad;
    }

    // compute
    // for numeric grades
    public void computeAverage() {
        average = grades / qtySubject;
    }

    // for alpha grades
    public void computeAverageL() {
        averageL = AverageLetterInput.gradeValueL(average);

    }

    public void computeGradeL(Double grad) {
        if (grad <= 60) {
            gradeL = "F";
        } else if (grad <= 70) {
            gradeL = "D";
        } else if (grad <= 80) {
            gradeL = "C";
        } else if (grad <= 90) {
            gradeL = "B";
        } else if (grad <= 100) {
            gradeL = "A";
        }
    }

    // get
    public double getAverage() {
        return average;
    }

    public String getAverageL() {
        return averageL;
    }

    public String getGradeL() {
        return gradeL;
    }

}
