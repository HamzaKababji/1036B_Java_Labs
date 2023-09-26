package Q1;

public class GradeActivity {

    // Instance variables
    private double[] grade; // Stores the array of grades for this GradeActivity object
    private double score; // Stores the score for this GradeActivity object
    private int outOf; // Stores the total number of points that this GradeActivity object is out of
    private double percentScore; // Stores the percentage score for this GradeActivity object

    // Default constructor
    public GradeActivity(){}

    // Constructor that takes a score and outOf value
    public GradeActivity(double score, int outOf){
        this.outOf = outOf;
        this.score = score;
    }

    // Constructor that takes an array of grades and outOf value
    public GradeActivity(double[] grade, int outOf){
        this.outOf = outOf;
        this.grade = grade;
        double sum = 0;
        // Calculates the sum of all grades in the array
        for(int i = 0; i< grade.length; i++){
            sum+= grade[i];
        }
        // Calculates the score based on the sum and outOf value
        if(outOf == 100)
            score = sum;
        else
            score = sum/ grade.length;
    }

    // Getter method for the score
    public double getScore() {
        return score;
    }

    // Method that calculates the letter grade based on the percentage score
    public String getLetterGrade(){
        percentScore = score/outOf*100;
        if(Math.round(percentScore) >=90) return "A+";
        else if(Math.round(percentScore) >=80) return "A";
        else if(Math.round(percentScore) >=70) return "B";
        else if(Math.round(percentScore) >=60) return "C";
        else if(Math.round(percentScore) >=50) return "D";
        else return "F";
    }

    // Overrides the toString method to display the score, outOf, letter grade, and percentage score
    @Override
    public String toString() {
        //The arguments of String.format() is written in the same way as the arguments of printf()
        return String.format("%.2f (out of %d), Letter Grade: %s [%d%%]", score,outOf, getLetterGrade(),Math.round(percentScore));
    }
}
