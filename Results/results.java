package week7Lab.Results;

public class results {
    // variables
    private int subjects;
    private int[] results;
    private int totalResults;
    private int average;
    private String finalString;
    private String averageGrade;
    private String[] grade;

    // constructor
    public void Results() {
    }

    // set
    public void setSubjects(int subjects) {
        this.subjects = subjects;
    }

    public void setResults(int[] results) {
        this.results = results;
    }

    // compute
    public void computeResponse() {
        grade = new String[subjects];

        for (int i = 0; i < results.length; i++) {
            if (results[i] < 70) {
                grade[i] = "Fail";
            } else {
                grade[i] = "Pass";
            }
        }
        totalResults = 0;
        for (int i = 0; i < results.length; i++) {
            totalResults += results[i];
        }
        average = totalResults / subjects;

        if (average < 70) {
            averageGrade = "Fail";
        } else {
            averageGrade = "Pass";
        }
        finalString = "";
        for (int i = 0; i < grade.length; i++) {
            finalString += "Module " + (i + 1) + " " + grade[i] + "\n";
        }
    }

    // get
    public int getAverage() {
        return average;
    }

    public String[] getGrade() {
        return grade;
    }

    public String getAverageGrade() {
        return averageGrade;
    }

    public String getFinalString() {
        return finalString;
    }
}
