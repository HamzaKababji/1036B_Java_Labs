package Q1;

public class Name {
    private String firstName, lastName;

    // This is the default constructor of the class
    public Name() {
    }

    // This is a parameterized constructor of the class
    public Name (String firstName, String lastName) {
        // Assigning the passed first name and last name values to the member variables of the class
        this.firstName = firstName;
        this.lastName = lastName;
    }

    // This is the overridden toString() method to return the full name
    public String toString() {
        // Returning the concatenation of the first and last names
        return firstName + " " + lastName;
    }

}
