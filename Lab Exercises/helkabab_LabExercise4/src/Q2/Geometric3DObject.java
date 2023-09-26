package Q2;

// Defining an abstract class named Geometric3DObject
public abstract class Geometric3DObject {

    // Declaring instance variables r and h as private
    private double r,h;

    // Creating a default constructor
    protected Geometric3DObject() {
    }

    // Creating a constructor that initializes the values of r and h
    protected Geometric3DObject(double r, double h) {
        this.r = r;
        this.h = h;
    }

    // Creating an abstract method named getArea
    public abstract double getArea();

    // Creating a method named getR that returns the value of r
    public double getR() {
        return r;
    }

    // Creating a method named getH that returns the value of h
    public double getH() {
        return h;
    }

    // Creating a method named toString that returns a formatted string
    public String toString() {
        return String.format("Given: Radius = %.2f cm, Height = %.2f cm", r, h);
    }
}

