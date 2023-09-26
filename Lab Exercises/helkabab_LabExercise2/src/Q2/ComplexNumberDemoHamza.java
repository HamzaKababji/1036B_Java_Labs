package Q2;
import java.util.Scanner;
import Q1.StudentGradesByHamza;
public class ComplexNumberDemoHamza {
    public static Scanner input = new Scanner(System.in); // This initializes the Scanner type variable globally so that it can be used anywhere in any method in this class

    public static int counter = 0; // Same as the scanner, this variable could be used anywhere in any method or class

    // The following links back to the object we created by reading the user's input and increasing the counter by 1 each time.
    public static ComplexNumber dataEntry(){
        double real, imaginary;
        counter++;
        System.out.println("Complex number " + counter + " data......");

        System.out.print("Enter the real term: ");
        real = input.nextDouble();


        System.out.print("Enter the imaginary term: ");
        imaginary = input.nextDouble();
        System.out.println("");

        ComplexNumber cn = new ComplexNumber(real, imaginary);
        return cn;
    }

    /** This adds up the user inputs and finds the method we made and uses the getters to calculate
     * the final value and set it as the sum variable.*/
    public static ComplexNumber complexAdder(ComplexNumber x, ComplexNumber y){
        double real = x.getReal() + y.getReal();
        double imag = x.getImaginary() + y.getImaginary();

        ComplexNumber sum = new ComplexNumber(real, imag);

        return sum;
    }

    // This is the exact same thing as above except now with the variable multi not sum.
    public static ComplexNumber complexMultiplier(ComplexNumber x, ComplexNumber y){
        double real = ((x.getReal() * y.getReal()) - (x.getImaginary() * y.getImaginary()));
        double imag = ((x.getImaginary() * y.getReal()) + (x.getReal() * y.getImaginary()));

        ComplexNumber multi = new ComplexNumber(real, imag);

        return multi;
    }

    public static void main(String[] args){ // Driver Method
        System.out.println("***************************************************************");
        System.out.println("Full name: Hamza Elkababji");
        StudentGradesByHamza.myHeader(2, 2, "Accepts complex numbers which then does a series of calculations and outputs it.");
        System.out.println("***************************************************************\n");
        // The above is the exact same way we created the header in Q1.

        // Creates a reference variable for the object and records it from dataEntry into the constructor.
        ComplexNumber x = new ComplexNumber();
        x = dataEntry();

        ComplexNumber y = new ComplexNumber();
        y = dataEntry();

        // Printing out all of the information we have calculated.
        System.out.println("You have entered the following two complex numbers x and y: ");
        System.out.print("x"); x.displayRecForm();
        System.out.println("");
        System.out.print("y"); y.displayRecForm();
        System.out.println("");

        // Almost the exact same as the lines 55 to 60 except now with different values.
        ComplexNumber addRes = new ComplexNumber();
        addRes = complexAdder(x,y);

        ComplexNumber mulRes = new ComplexNumber();
        mulRes = complexMultiplier(x,y);
        System.out.println("");

        // Formatting the outputs of the code and calculations using a print f statement for optimization.
        System.out.println("Here are the results of the arithmetic operations: ");
        System.out.printf("x + y"); addRes.displayRecForm(); System.out.printf(", Magnitude: %.2f, Angle: %.2f degrees\n", addRes.getMagnitude(), addRes.getAngle());
        System.out.printf("x * y"); mulRes.displayRecForm(); System.out.printf(", Magnitude: %.2f, Angle: %.2f degrees\n\n", mulRes.getMagnitude(), mulRes.getAngle());

        StudentGradesByHamza.myFooter(2);
    }
}
