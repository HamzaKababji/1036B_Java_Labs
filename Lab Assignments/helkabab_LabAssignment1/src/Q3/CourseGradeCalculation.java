package Q3;

/*******************************************************
 
 */

import java.util.*;
public class CourseGradeCalculation {
    public static void main(String [] args){
        System.out.println("****************************************************\nFull Name: Hamza Elkababji \nStudent Number:251276422 \nDate:2023-02-01 \nBrief description of the task: Similar to Questions 1\nand 2, but this time we use a different weight for\neach grade to calculate the official final grade.  \n*****************************************************\n\n");
        Scanner input = new Scanner(System.in);
        double GRD1_WGT = 0.2;
        double GRD2_WGT = 0.3;
        double GRD3_WGT = 0.5;
                // Assigned each weight of the grade to a certain variable, so I can easily reference it in my grade calculation.
        System.out.println("Input the first grade: ");
        double grade1 = input.nextDouble();
        System.out.println("Input the second grade: ");
        double grade2 = input.nextDouble();
        System.out.println("Input the third grade: ");
        double grade3 = input.nextDouble();
        double finalgrade = grade1*GRD1_WGT + grade2*GRD2_WGT + grade3*GRD3_WGT;
        System.out.printf("The course grade is %.2f",finalgrade);
            /** Everything that has been done above is done the exact same order and concept
              * as in Questions 1 and 2, but this time with different variables and a different
              * calculation*/
        System.out.println("\n*****************************************************");
    }
}
