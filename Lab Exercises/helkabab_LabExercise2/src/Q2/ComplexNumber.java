package Q2;

public class ComplexNumber{

    // Made this variable "real" so it can be accessed only as a placeholder for the constructor in this class.
    private double real;
    private double imaginary;

    // A constructor to default to 0 values.
    public ComplexNumber(){
        real = 0;
        imaginary = 0;
    }

    // Constructor that splits up what the user inputted into real and imaginary parts.
    public ComplexNumber(double re, double im){
        real = re;
        imaginary = im;
    }

    // All of the following methods will return a type of data that is respective to what it is getting.
    public double getReal(){
        return real;
    }

    public double getImaginary(){
        return imaginary;
    }


    public double getMagnitude(){
        return Math.sqrt((Math.pow(imaginary,2)) + (Math.pow(real,2)));
    }

    public double getAngle(){
        return Math.toDegrees(Math.atan2(imaginary,real));
    }

    // Displays the object with special formatting using a printf statement.
    public void displayRecForm(){
        System.out.printf(" = %.2f + %.2fi", real, imaginary);
    }
}
