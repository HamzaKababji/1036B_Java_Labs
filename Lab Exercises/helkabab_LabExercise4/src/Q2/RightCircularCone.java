package Q2;

// Define a class RightCircularCone which extends Geometric3DObject class and implements VolumeOf3DObjectsInterface interface
public class RightCircularCone extends Geometric3DObject implements VolumeOf3DObjectsInterface {

    // Define a default constructor
    public RightCircularCone() {
    }

    // Define a parameterized constructor which accepts radius and height
    public RightCircularCone(double r, double h) {
        super(r, h); // Call the constructor of the superclass Geometric3DObject and pass radius and height as parameters
    }

    // Define a method to calculate the surface area of the cone
    public double getArea() {
        double area;
        double r = getR(); // Get the radius of the cone from the superclass Geometric3DObject
        double h = getH(); // Get the height of the cone from the superclass Geometric3DObject
        return Math.PI * r *(r + (Math.sqrt(Math.pow(h,2) + Math.pow(r,2)))); // Calculate and return the surface area of the cone
    }

    // Define a method to calculate the volume of the cone
    public double getVolume() {
        double r = getR(); // Get the radius of the cone from the superclass Geometric3DObject
        double h = getH(); // Get the height of the cone from the superclass Geometric3DObject
        return (Math.PI * (Math.pow(r,2)) * h)/3; // Calculate and return the volume of the cone
    }

    // Define a method to return a string representation of the cone object
    public String toString() {
        // Call the toString() method of the superclass Geometric3DObject and append volume and surface area of the cone
        return super.toString() + String.format("\nCone's Volume: %.2f cubic cm\nCone surface area: %.2f sq. cm\n", getVolume(), getArea());
    }
}
