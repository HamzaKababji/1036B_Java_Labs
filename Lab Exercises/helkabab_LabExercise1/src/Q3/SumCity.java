package Q3;

import java.util.*;

import Q1.MethodDemo;

/** Exact same thing as Q2 */
public class SumCity {
    public static double sumValues(double num1,double num2){
        double sum = num1 + num2;
        return sum;
    }
    public static char sumValues(char char1,char char2){
        char sum2;
        sum2 = (char) (char1 + char2);
        return sum2;
    }
    public static String sumValues(String str1,String str2){
        String sumName;
        sumName = str1 + str2;
        return sumName;
    }
    /** The last three methods have the same use, where they sum
     * up values, and then they return that value to the user.*/
    public static void main(String[] args) {

        double realNum1,realNum2;
        char charOne,charTwo;
        String stringOne,stringTwo;

        Scanner input = new Scanner(System.in);
        System.out.println("*****************************************");
        System.out.println("Full Name: Hamza Elkababji");
        MethodDemo.myHeader(1,3,"Similar to the past two questions, suing multiple methods, we sum up numbers, characters and string type variables");
        System.out.print("*****************************************\n\n");

        /** Same process, we initialize variables to certain variable types, and Scanners.
         * Then, printing out my information, the same way as Q1 and Q2.*/

        System.out.print("Enter a Real Number: ");
        realNum1 = input.nextDouble();

        System.out.print("Enter a second Real Number: ");
        realNum2 = input.nextDouble();

        System.out.printf("the sum of %.2f and %.2f is %.2f",realNum1,realNum2,sumValues(realNum1,realNum2));

        System.out.print("\nEnter a character: ");
        charOne =  input.next().charAt(0);

        System.out.print("Enter a second character: ");
        charTwo = input.next().charAt(0);

        /** All of the above are prompting the user to input a value,
         * then using the scanner it assigns each input to a variable.*/

        int sum2 = charOne + charTwo;
        System.out.printf("the sum of %c and %c is %c, whose equivalent integer value is %d\n",charOne,charTwo,sumValues(charOne,charTwo),sum2);

        System.out.print("Enter your Full Name: ");
        stringOne = input.next();
        stringTwo = input.nextLine();
        System.out.printf("My name is %s\n",sumValues(stringOne,stringTwo));

        /** Finally, printing out the data calculated using print f statements.*/



        MethodDemo.myFooter(3);

    }
}
