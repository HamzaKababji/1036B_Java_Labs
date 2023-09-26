package Q1;

public class CourseAndInstructor extends InstructorInfo{ // Giving this class the attributes and fields of the InstructorInfo Class

    // Declaring a private String variable called "courseName"
    private String courseName;

    // Default constructor
    public CourseAndInstructor() {
    }

    // Constructor with four parameters: courseName, firstName, lastName, and officeLocation
    public CourseAndInstructor(String cN, String fN, String lN, String oL) {
        // Calls the constructor of the superclass (InstructorInfo) with three parameters: firstName, lastName, and officeLocation
        super(fN, lN, oL);
        // Assigns the value of cN (the first parameter) to the courseName variable
        courseName = cN;
    }

    // Overriding the toString() method to return the instructor's information and the course name
    public String toString() {
        return "Instructor's Info: \n" + super.toString() + "\nCourse Name: " + courseName;
    }
}
