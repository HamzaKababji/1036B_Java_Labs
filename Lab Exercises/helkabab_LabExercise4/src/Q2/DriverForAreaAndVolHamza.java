package Q2;

import Lab3Q.MyMethod;
import java.util.Scanner;
public class DriverForAreaAndVolHamza {

    // Creating a scanner object for user input
    public static Scanner input = new Scanner(System.in);

    // Function to populate the arrays with random values for cylinders and cones
    public static void populateArrays(Geometric3DObject[] x, int y) {
        double r,h;
        if (y == 1) {
            // Generating random values for cylinder
            for (int i = 0; i < x.length; i++) {
                r = (Math.random()*1)+2;
                h = (Math.random()*2)+4;
                x[i] = new RightCylinder(r,h);
            }
        }
        else {
            // Generating random values for cone
            for (int i = 0; i < x.length; i++) {
                r = (Math.random()*1)+2;
                h = (Math.random()*2)+4;
                x[i] = new RightCircularCone(r,h);
            }
        }
    }

    // Function to print the arrays
    public static void printArrays(Geometric3DObject[] x, int y) {
        if(y==1) {
            // Printing details of cylinders
            int counter = 1;
            for (int i = 0; i < x.length; i++) {
                System.out.printf("Cylinder %d: \n", counter);
                System.out.println("-------------");
                System.out.println(x[i].toString());
                counter++;
            }
        }
        else {
            // Printing details of cones
            int counter = 1;
            for (int i = 0; i < x.length; i++) {
                System.out.printf("Cone %d: \n", counter);
                System.out.println("-------------");
                System.out.println(x[i].toString());
                counter++;
            }
        }
    }

    // Function to find the maximum volume
    public static void maxVolume(Geometric3DObject[] x) {
        double maxCyl = 0, maxCone = 0;
        if (x[0] instanceof RightCylinder) {
            // Checking if the object is a cylinder and storing its volume as maxCyl
            maxCyl = ((RightCylinder)x[0]).getVolume();
        }
        else {
            // Checking if the object is a cone and storing its volume as maxCone
            maxCone = ((RightCircularCone)x[0]).getVolume();
        }

        for (int i = 1; i < x.length; i++) {
            if (x[i] instanceof RightCylinder) {
                // Comparing volumes of all cylinders to find the maximum
                if (((RightCylinder)x[i]).getVolume() > maxCyl) {
                    maxCyl = ((RightCylinder)x[i]).getVolume();
                }
            }
            else {
                // Comparing volumes of all cones to find the maximum
                if (((RightCircularCone)x[i]).getVolume() > maxCone) {
                    maxCone = ((RightCircularCone) x[i]).getVolume();
                }
            }
        }

        if (x[0] instanceof RightCylinder) {
            // Printing the details of the cylinder with the maximum volume
            System.out.printf("The cylinder with the maximum volume is: %.2f cubic cm\n", maxCyl);
        }
        else {
            // Printing the details of the cone with the maximum volume
            System.out.printf("The cone with the maximum volume is: %.2f cubic cm\n", maxCone);
        }
    }

    // Main Driver Method
    public static void main(String[] args) {
        MyMethod.myHeader(4,2,"Calculating the Volumes and Surface Areas of a Number of 3D Objects.");
        int length = 0;
        System.out.print("How many Cylindrical objects you need to measure: ");
        length = input.nextInt();
        Geometric3DObject[] geo1 = new RightCylinder[length];
        populateArrays(geo1,1);
        printArrays(geo1, 1);
        maxVolume(geo1);
        System.out.println("=====================================================");

        System.out.print("How many Conical objects you need to measure: ");
        length = input.nextInt();
        Geometric3DObject[] geo2 = new RightCircularCone[length];
        populateArrays(geo2,2);
        printArrays(geo2, 2);
        maxVolume(geo2);
        System.out.println();
        MyMethod.myFooter(2);
    }
}
