/*******************************************
 Hamza Elkababji
 251276422
 2023-01-24
 This task is doen to ensure we have a basic and core understanding of arithmetic calculation's implementation into java, and how to interact with the end user.
 *********************************************/
package Q2; //Defining where the location of this java class code is.

import java.util.Scanner; //Importing an add-on to java that will help us build the program as follows.

public class SimpleMath { //Created a class called SimpleMath to allow the implementation of the following code.

    public static void main(String[] args){ //Defining a method main() under the class previously established.
        double c = 0, f = 0; // Here I have defined two variables as 0so we can initialize them, and so they can be set as that after doing any calculations or any input.
        Scanner input = new Scanner(System.in); //A library add-on to Java class that will allow us to allow the user to input data using standard input, and then for it to be saved and implemented into the code.
        System.out.println("Hello again! This is Hamza Elkababji");
        System.out.println("Student Number: 251276422");
        System.out.println("Date: 24-01-2023");
        System.out.println("----------------------------------");
        System.out.println("Let's do some mathematical calculations.");
        System.out.println("Converting a temperature from Celsius scale to Fahrenheit scale . . .");
        System.out.println("Enter temperature in Celsius: "); //Similar to question 1, all of the above statements that include a println method are used to print out sentences on the screen to prompt the user to input a temperature in Celsius for it to be converted to Fahrenheit.
        c = input.nextDouble(); // Whatever input that the user will type in, it will re-define the variable c to that value.
        f = ((c*9)/5)+32; // This will define the variable f as the equation for the conversion from Celsius to Fahrenheit.
        System.out.println(c + " degree in Celsius " + f + " degree Fahrenheit!"); //Similar to line 23, this will instead print out the value of the newly defined variable f, along with some text that is inside quotation marks.
        System.out.println("Question 2 is successfully done!");// Same code as on line 23.
   }
}
