package Q1;

import java.util.*;
        // Importing all libraries with the * in case we need to use anything other than the Scanner.
public class MathBugs {
        // Followed the lab instructions and named the public class as MathBugs.
    public static void main(String [] args){
        System.out.println("****************************************************\nFull Name: Hamza Elkababji \nStudent Number:251276422 \nDate:2023-02-01 \nBrief description of the task: In this task we are\ntaking a four digit number and splitting it up into\n4 parts to be able to calculate the root mean squared\nvalue of it. \n*****************************************************\n\n");
              // The above statement is printing out my information and a brief summary of what the following goal of the code is.
        Scanner input = new Scanner(System.in);
              // The above line of code allows us to initialize the use of the scanner and take in any data that the user inputs in.
        System.out.println("Please enter a four digit number that is between 1111 and 9999 without any zeroes: ");
        int number = input.nextInt();
             // Assigning the input that the user puts in to a variable called number.
        int onesDigit = number%10;
        System.out.println("Ones Digit: "+onesDigit);
        int tensDigit = number/10 %10;
        System.out.println("Tens Digit: "+tensDigit);
        int hundredsDigit = number/100 %10;
        System.out.println("Hundreds Digit: "+hundredsDigit);
        int thousandsDigit = number /1000;
        System.out.println("Thousands Digit: "+thousandsDigit);
              /** Throughout the lines 14 to 21, I repeat the pattern of dividing a number by a multiple of 10 to get rid of the digits on the right hand side,
                * then mod it by 10 to get rid of the values on the left hand side, and that works because the values are integers, and it would turn it into a
                * whole number instantly. */
        double rms = Math.sqrt((Math.pow(onesDigit, 2.0) + Math.pow(tensDigit, 2.0) + Math.pow(hundredsDigit, 2.0) + Math.pow(thousandsDigit,2.0))/4.0);
        System.out.printf("The Root MeanSquared Value of the four numbers above is: %.2f ",rms);
             // Above I used a printf statement to reference a variable while limiting the number of decimal places the program shows.
        System.out.println("\n*****************************************************");
    }
}
