package Q1;

public class InstructorInfo extends Name {
    private String officeLocation;

    // Constructor with no parameters.
    public InstructorInfo() {
    }

    // Constructor with parameters 'fN' (first name), 'lN' (last name), and 'oL' (office location).
    public InstructorInfo(String fN, String lN, String oL) {
        // Calling the constructor of the superclass (Name) with parameters 'fN' and 'lN'.
        super(fN, lN);
        // Assigning the value of 'oL' to the instance variable 'officeLocation'.
        officeLocation = oL;
    }

    // Overriding the toString() method of the Object class to return a string representation of this object.
    public String toString() {
        // Returning the concatenated string of the superclass's toString() method and the 'officeLocation' instance variable.
        return "Name: " + super.toString() + "\nOffice Location: " + officeLocation;
    }
}
