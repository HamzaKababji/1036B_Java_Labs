package Q2;

public class RightCylinder extends Geometric3DObject implements VolumeOf3DObjectsInterface {

    // Default constructor
    public RightCylinder() {
    }

    // Constructor with two parameters: radius and height
    public RightCylinder(double r, double h) {
        // Calls the constructor of the superclass (Geometric3DObject) with two parameters: radius and height
        super(r,h);
    }

    // Overrides the getArea() method to calculate the surface area of the cylinder
    public double getArea() {
        double r = getR();
        double h = getH();
        return 2 * Math.PI * r * (r+h);
    }

    // Overrides the getVolume() method to calculate the volume of the cylinder
    public double getVolume() {
        double r = getR();
        double h = getH();
        return Math.PI * Math.pow(r,2) * h;
    }

    // Overrides the toString() method to return the object's information, volume, and surface area
    public String toString() {
        return  super.toString() + String.format("\nCylinder's Volume: %.2f cubic cm\nCylinder's surface area: %.2f sq. cm\n", getVolume(), getArea());
    }

}
