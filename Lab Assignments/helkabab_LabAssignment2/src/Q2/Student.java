package Q2;

public class Student {
    // Declaring data types with their respective uses while keeping them only accessible in this class by making it private.
    private int studentNumber;
    private String firstName;
    private String lastName;
    private String emailAddress;
    private int yearOfBirth;

    // This is a constructor without any parameters because it is based off of my information which does not depend on a variable.
    Student(){
        studentNumber = 251276422;
        firstName = "Hamza";
        lastName = "Elkababji";
        emailAddress = "helkabab@uwo.ca";
        yearOfBirth = 2005;
    }

    // Similar to the constructor before this, except this time with parameters as it depends on the user's information.
    Student(int sn, String fName, String lName){
        studentNumber = sn;
        firstName = fName;
        lastName = lName;
    }

    /** Same thing with Question 1, we are declaring a string return type method
     * which outputs the first and last name.*/
    public String getName(){
        return firstName + " " + lastName;
    }

    /** Same thing as above except this time it is an integer return type,
     * and it is returning a student number.*/
    public int getStudentNumber() {
        return studentNumber;
    }

    /** Same as line 27 to 31, except with the email address.*/
    public String getEmailAddress() {
        return emailAddress;
    }

    /** Same thing as lines 33 to 37 but now performing an operation of
     * subtraction to calculate the age.*/
    public int getAge(){
        return 2023-yearOfBirth;
    }
}
