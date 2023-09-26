package Q1;

import java.util.Scanner;

public class CircleInfoHamza {
    public static void main(String[] args) {
        // Declaring everything I will use in this code(Variables and objects) at the top of my method.
        double r;
        Scanner scan = new Scanner(System.in);
        Circle newCircle = new Circle();
        // Calling the header method below
        myHeader(2, 1, "In this program, we find the characteristics of a circle with a given radius input from a user.");
        // Prompting the user to input data for the radius of a circle
        System.out.print("Enter the radius: ");
        r = scan.nextDouble(); // Scans the user's input
        Circle r =
        // With the circle object I set r as my radius
        newCircle.setRadius(r);
        System.out.println("\nCircle Info: ");
        System.out.printf("Radius: %.3f cm\nArea: %.3f sq-cm\nDiameter: %.3f cm\nCircumference: %.3f cm\n\n",
                newCircle.getRadius(), newCircle.getArea(), newCircle.getDiameter(), newCircle.getCircumference());
        // Regular printf statement to print out all the calculated data from the other class
        myFooter(1);
        // Calling the footer method below
    }

    public static void myHeader(int labNum, int questionNum, String description){
        System.out.println("***********************************************************\nName: Hamza Elkababji\n"
                + "Lab Exericse: " + labNum + ", Question: " + questionNum + "\nDescription: " + description
                +"\n***********************************************************");
        /** Same concept as the method below(myFooter) but in this case it is the header and
         * has 3 parameters instead of 1.*/
    }

    public static void myFooter(int questionNumber){
        System.out.println("*** Signing off from Question " + questionNumber + " -  Hamza ***");
        /** This is another void return type method that is used as a footer for the end of my code,
         * where the parameter it receives is the question number, and it prints out
         * myself signing off.*/
    }

}
