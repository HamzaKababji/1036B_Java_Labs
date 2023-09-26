package Q1;

import Lab3Q.MyMethod;
import java.util.Scanner;
// Importing libraries that I will use along with the class from previous lab assignments to cut down on having to rewrite the same methods.


public class TwoDArrayMultiplicationHamza {

    /**This will populate any 2D Array with any length and populate it with numbers between
       2 and 5; along with using a nested for loop to populate the rows AND the columns.*/
    public static void populate2DArrays (int[][] ma){
        int i;
        for (int row = 0; row < ma.length; row++){
            for (int col = 0; col < ma[row].length; col++){
                i = (int)((Math.random()*4)+2);
                ma[row][col] = i;
            }
        }
    }

    /** The following will print out the matrix in the correct formatting and alignment
        using a printf statement.*/
    public static void display2DArray (int[][] ma){
        for (int row = 0; row < ma.length; row++){
            for (int col = 0; col < ma[row].length; col++){
                System.out.printf("%3d ", ma[row][col]);
            }
            System.out.println();
        }
        System.out.println();
    }


    /** The following uses 3 nested for loops that are used to automate the process of matrix multiplication.
     * It multiplies the rows by the columns and returns the new matrix which is and ixj matrix.*/
    public static int[][] multiplyArrays (int[][] a, int [][] b){
        int[][] result = new int[a.length][b[0].length];
        for (int i = 0; i < result.length; i++){
            for (int j = 0; j < result[i].length; j++){
                for (int k = 0; k < b.length; k++){
                    result[i][j] += a[i][k] * b[k][j];
                }
            }
        }
        return result;
    }

    public static void main(String[] args){ //Driver Method
        MyMethod.myHeader(4,1,"Based on user input, this program will set the matrix to that size adn then populate it randomly; and then multiply both matrices and print out the product.");
        Scanner input = new Scanner(System.in);
        int row1, col1, row2, col2;

        System.out.println("\nMultiplying two 2D Arrays: ");
        System.out.println("Enter array1 info: ");
        System.out.print("\tEnter row-size: ");
        row1 = input.nextInt();// This will set whatever the user inputs as the variable for the first matrix row size.
        System.out.print("\tEnter column-size: ");
        col1 = input.nextInt();// This will set whatever the user inputs as the variable for the first matrix column size.
        int[][] arr1 = new int[row1][col1];// Based on line 57 and 59, we take the user inputs, and we instantiate a new object with those dimensions.

        // The following does the same as lines 56 - 60, however there is an extra step to verify user input for the second matrix row equaling the first matrix column so the multiplication is possible.
        System.out.println("\nEnter array2 info: ");
        System.out.print("\tEnter row-size: ");
        row2 = input.nextInt();
        while(row2 != col1){// This is how we verify what I mentioned in line 62; using a while loop.
            System.out.println("\tRow size of the 2nd matrix has to be equal to the column size of first matrix!");
            System.out.print("\tEnter again: ");
            row2 = input.nextInt();
        }
        System.out.print("\tEnter column-size: ");
        col2 = input.nextInt();
        int[][] arr2 = new int[row2][col2];
        System.out.println();

        // The following 2 lines will populate both arrays randomly between 2 and 5.
        populate2DArrays(arr1);
        populate2DArrays(arr2);

        // The following will simply print out all the data we have gathered with the help of other methods to calculate the product of the two matrices from user input.
        System.out.printf("Elements of Array 1, size[%d x %d]: \n", row1, col1);
        display2DArray(arr1);
        System.out.printf("Elements of Array 2, size[%d x %d]: \n", row2, col2);
        display2DArray(arr2);

        System.out.println("\nMultiplying tow arrays [Array1 x Array 2]..");
        System.out.printf("The resultant size is [%d x %d].\n", row1, col2);
        int[][] result = multiplyArrays(arr1,arr2);
        System.out.println("\nThe elements are...");
        display2DArray(result);

        MyMethod.myFooter(1); // Calling the footer method we made from other lab assignments.
    }
}
