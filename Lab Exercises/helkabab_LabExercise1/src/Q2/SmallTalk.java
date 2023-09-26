package Q2;

import Q1.MethodDemo;

import java.util.*;

/** Exact same thing as before, but this time we also imported the methods from the previoud programming
    using the code written on line 3.*/
public class SmallTalk {

    public static double celsiusToFahrenheit (double celsius) {
        double f;
        f = 9*(celsius/5)+32;
        return f;
        /** This will reference the calculation for celsius to Fahrenheit to a
            double variable f. THen, it will return that variable to the user */
    }
    public static double fahrenheitToCelsius (double fahrenheit){
        double c;
        c = 5*(fahrenheit-32)/9;
        return c;
        /** The same thing as above but now the other way around (Fahrenheit to celsius */
    }
    public static void main(String[] args) {

        double user,userOne,userTwo;
        Scanner input = new Scanner(System.in);
        System.out.println("*****************************************");
        System.out.println("Full Name: Hamza Elkababji");
        MethodDemo.myHeader(1,2, "This is how to convert from celsius to fahrenheit and back again also using multiple methods for simplicity.");
        System.out.print("*****************************************\n");

        System.out.print("What is the outdoor temperature now? ");
        user = input.nextDouble();
        System.out.printf("     I know you're used to Fahrenheit scale. %.2f deg-C is %.2f deg-F\n",user,celsiusToFahrenheit(user));

        System.out.print("I am cold what is the indoor temperature? ");
        userOne = input.nextDouble();
        System.out.printf("     %.2f deg-C is %.2f deg-F\n",userOne,celsiusToFahrenheit(userOne));

        System.out.println("I see. Would you crank up the temperature?");
        System.out.print("      Ok I'll! What temperature should I set the thermostat to? ");
        userTwo = input.nextDouble();
        System.out.printf("     Oh, you mean %.2f deg Fahrenheit! Here you go.\n",userTwo);
        System.out.printf("     By the way, %.2f deg-F is %.2f deg-C.\n",userTwo,fahrenheitToCelsius(userTwo));
        System.out.println("Thank you! It is very nice of you.");
/** Then the rest of the code is similar to previous assignments and exercises,
 *  where we use printf, println, and variables to do what we need to do.*/

        MethodDemo.myFooter(2);






    }
}
