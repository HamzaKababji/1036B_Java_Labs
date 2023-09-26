package Q2;

import Lab3Q.MyMethod;
import java.io.*;
import java.util.Scanner;

public class WorkingWithFilesAndArrays {
        public static void main(String[] args) throws IOException { // Driver Method with an input Exception
            MyMethod.myHeader(4,2,"Attempting to use a file compatibly with arrays in Java by reading it, using it as a sort of setter and updating it with new information.\n");
            double[] array = new double[7]; //Instantiating a new object of double array type size 7.
            // Using the pre-set "File" class to access a file that is under a certain directory.
            File myFile = new File("C:\\Users\\hamza\\OneDrive - The University of Western Ontario\\Documents\\University\\ENGSCI 1036B\\Lab Assignments\\helkabab_LabAssignment4\\Datafile_LabAssignment4.txt");
            Scanner input = new Scanner(myFile);

            // used to populate the array one by one using a for loop.
            for (int i = 0; i < array.length; i ++){
                array[i] = input.nextDouble();
            }
            input.close();

            WeeklySaleDataHamza a1 = new WeeklySaleDataHamza(array); // New object populated by the constructor in the WeeklySaleDataHamza class.
            System.out.println("Reading the file...");
            System.out.println("Here is this week's sale-data...");
            a1.displaySaleData(); // Calling the method that displays the array.

            // With the help of all the methods in the WeeklySaleDataHamza class, we are able to perform all operations at the same time as printing it out in a neat format using a printf statement.
            System.out.printf("\nHighest weekly Sale: %.2f\n", a1.getHighestSale());
            System.out.printf("Lowest weekly Sale: %.2f\n", a1.getLowestSale());
            System.out.printf("Average weekly Sale: %.2f\n", a1.getAverageSale());
            System.out.printf("Standard Deviation of Weekly Sale: %.2f\n", a1.getStandardDeviation());
            System.out.println("\n..Updating the file with the above info...");

            // This will update the file information. Then, the rest of the lines does pretty much the same exact thing as lines 26 to 31 except it overwrites the current data in the file.
            FileWriter fw = new FileWriter("C:\\Users\\hamza\\OneDrive - The University of Western Ontario\\Documents\\University\\ENGSCI 1036B\\Lab Assignments\\helkabab_LabAssignment4\\Datafile_LabAssignment4.txt",true);
            PrintWriter writeMyFile = new PrintWriter(fw);
            writeMyFile.printf("\nHighest weekly Sale: %.2f\n", a1.getHighestSale());
            writeMyFile.printf("Lowest weekly Sale: %.2f\n", a1.getLowestSale());
            writeMyFile.printf("Average weekly Sale: %.2f\n", a1.getAverageSale());
            writeMyFile.printf("Standard Deviation of Weekly Sale: %.2f\n", a1.getStandardDeviation());
            writeMyFile.close();
            System.out.println("\nClosed the file.....\n");

            MyMethod.myFooter(2); // Calling the footer method we made from other lab assignments.
        }
    }
