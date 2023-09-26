package Q1;

public class StudentInfo extends Name{
    private int studentNumber;
    private CourseAndInstructor courseInfo;

    public StudentInfo() {
    }

    // This constructor initializes the student's name and number, as well as the course information
    public StudentInfo(String fN, String lN, int sN, CourseAndInstructor cInfo) {
        super(fN,lN);
        studentNumber = sN;
        courseInfo = cInfo;
    }

    // This method returns a string representation of the student's information, including their name, number, and course info
    public String toString() {
        return "Student Name: " + super.toString() + "\nStudent Number: " + studentNumber + "\n" + courseInfo;
    }

}
