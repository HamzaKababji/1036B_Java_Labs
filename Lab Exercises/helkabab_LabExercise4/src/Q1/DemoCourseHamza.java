package Q1;

import Lab3Q.MyMethod;

public class DemoCourseHamza {

    // The main method is where the program starts executing
    public static void main(String[] args) {
        // Calling the myHeader() method from the MyMethod class to print the header of the output
        MyMethod.myHeader(4, 1, "This Program will calculate the total course grade based on literal input.");

        // Creating a new CourseAndInstructor object with four parameters: courseName, firstName, lastName, and officeLocation
        CourseAndInstructor c1 = new CourseAndInstructor("Programming Fundamentals", "Quazi", "Rahman", "TEB263");
        // Creating a new StudentInfo object with four parameters: firstName, lastName, studentID, and courseInstructor
        StudentInfo s1 = new StudentInfo("Hamza", "Elkababji", 251276422, c1);
        // Printing the student information using the toString() method of the StudentInfo class
        System.out.println(s1);
        // Printing a separator line
        System.out.println("=============================================");
        // Printing a header for the score card
        System.out.println("   Score Card (Based on the rounded Score)");
        // Printing a separator line
        System.out.println("=============================================");

        // Creating an array of lab grades and calculating the average lab grade
        double[] LabG = new double[]{15, 15, 14, 11.25, 15, 15, 15};
        GradeActivity avgLabG = new GradeActivity(LabG, 15);
        // Printing the average lab grade
        System.out.println("Lab Grade: " + avgLabG);

        // Creating an array of quiz grades and calculating the average quiz grade
        double[] quizG = new double[]{10.83, 10.67, 15};
        GradeActivity avgQuizG = new GradeActivity(quizG, 20);
        // Printing the average quiz grade
        System.out.println("Quiz Grade: " + avgQuizG);

        // Calculating the midterm grade
        GradeActivity midtermG = new GradeActivity(18.214,25);
        // Printing the midterm grade
        System.out.println("Midterm Grade: " + midtermG);

        // Calculating the final grade
        GradeActivity finalG = new GradeActivity(31.2,40);
        // Printing the final grade
        System.out.println("Final Grade: " + finalG);

        // Creating an array of final scores and calculating the course grade
        double[] finalScore = new double[]{avgLabG.getScore(), avgQuizG.getScore(), midtermG.getScore(), finalG.getScore()};
        GradeActivity courseG = new GradeActivity(finalScore, 100);
        // Printing the course grade
        System.out.println("============================================================");
        System.out.println("Course Grade: " + courseG);
        System.out.println("============================================================");

        // Calculating the average bonus grade
        GradeActivity avgBonusG = new GradeActivity(4.91,5);
        // Printing the average bonus grade
        System.out.println("Average Bonus Grade: " + avgBonusG);

        // Calculating the reported final grade
        GradeActivity reportedFinalG = new GradeActivity(avgBonusG.getScore() + courseG.getScore(), 100);
        // Printing the reported final grade using the toString() method of the GradeActivity class
        System.out.println("Reported Final Grade: " + reportedFinalG);
        System.out.println("");
        MyMethod.myFooter(1);
    }
}
