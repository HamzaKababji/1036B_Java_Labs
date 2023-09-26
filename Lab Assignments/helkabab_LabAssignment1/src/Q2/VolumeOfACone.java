package Q2;

import java.util.*;
public class VolumeOfACone{
        public static void main(String [] args){
                System.out.println("****************************************************\nFull Name: Hamza Elkababji \nStudent Number:251276422 \nDate:2023-02-01 \nBrief description of the task: In this task we are\ntaking two values inputted from the user that\nrepresent the radius and height of a cone and outputting\nthe volume of that cone with those specifications. \n*****************************************************\n\n");
                double height = 0, radius = 0;
                        // Initializing two variables to use later on by setting them equal to 0.
                Scanner input = new Scanner(System.in);
                System.out.println("Please enter the height of the cone: ");
                height = input.nextDouble();
                System.out.println("Please enter the radius of the cone: ");
                radius = input.nextDouble();
                        /** The lines from 10 to 13 prompt the user to input a value using the scanner
                          * function for the height and radius of the cone they are trying to find the
                          * volume for, then it assigns each one to their respective variables.*/
                double volume = ((Math.PI*Math.pow(radius, 2)*height)/3);
                        /** Assigning the calculation that needs to be done to find the volume to its
                          *  respective variable so it can be referenced to when printing out the result.*/
                System.out.printf("The volume of a cone with a radius of %.2f cm and a height of %.2f cm is: %.2f cubic cm.", radius, height, volume);
                        /**Using printf in a similiar way to Q1 but now we are referencing multiple
                          * variables, adn to do so, they have to be in order of the order that you
                          * place them in at the end*/
                System.out.println("\n*****************************************************");
        }
}
