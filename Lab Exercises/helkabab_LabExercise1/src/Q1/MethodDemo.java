package Q1;

import java.util.*;

public class MethodDemo {
    /** The previous lines are the same as previous exercises and assignments
     just with different names such as "MethodDemo and Q1, while also
     importing different libraries for what we need.*/
    public static void myHeader(int labNum, int questionNum, String description) {
        System.out.println("Lab exercise: " + labNum + ", Question: " + questionNum);
        System.out.println("Program Description: " + description);
        /** This method will display the information of the program that is running and what it does exactly*/
    }
    public static double cmToInchConverter(double cm){
        double inches = cm/2.54;
        return inches;
        /** This will execute a coded that will convert cm to inches and return inches.*/
    }
    public static int myFooter(int questionNumber){
        System.out.println("*** Signing off from Question "+ questionNumber + " - Hamza Elkababji ***");
        return questionNumber;
        /** Prints out a line that says I am signing off from the variable questionNumber and states my name */
    }
    public static void main(String[] args) {
        double user;
        Scanner input = new Scanner(System.in);
        System.out.println("*****************************************");
        System.out.println("Full Name: Hamza Elkababji");
        myHeader(1, 1, "This code will convert from cm to inches then inches to feet using multiple methods to make the code look simpler and easier to understand.");
        System.out.print("*****************************************\n");
        /** THis is the driver method where I defined a scanner type variable input for the user to input in data. */

        System.out.print("Enter your Height: ");
        user = input.nextDouble(); // This will record the user's input as a double type integer

        System.out.printf("%.2f cm = %.2f inches\n", user, cmToInchConverter(user));

        double feetUnrounded = (cmToInchConverter(user) / 12);
        double inchesLeft = cmToInchConverter(user) % 12;
        int feet = (int) Math.floor(feetUnrounded);
        /** These are calculations for the unit converter */

        System.out.printf("%.2f inches = %d ft %.2f inches\n", cmToInchConverter(user), feet, inchesLeft);
        // Finally this prints out the calculations

        myFooter(1); // Outputs the method created and shows the question
    }
}
