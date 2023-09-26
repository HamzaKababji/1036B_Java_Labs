package Lab3Q;
import java.util.Scanner;
public class DemoMyMethodsHamza{
    final public static Scanner input = new Scanner(System.in);

    public static void main(String[] args){
        System.out.println("***************************************************************");
        System.out.println("Full name: Hamza Elkababji");
        MyMethod.myHeader(3,1,"Using an interactive menu, it will allow the user to choose what operation they want to perform, and then it will do that operation for them based on the user's inputs.");
        System.out.println("***************************************************************");
        System.out.println("Testing Mathematical Functions: \n");

        char choice; // Initializing the variable that will hold whatever the user chooses.

        /** The following an infinite while loop that will keep prompting the user if they
         * enter an invalid letter(default choice); or complete one of the options until
         * the user inputs e, which in that case it will break out of the loop.*/
        while(true){
            System.out.println("======MENU========");
            System.out.println("a: Power Function");
            System.out.println("b: Factorial Function");
            System.out.println("c: Sine Function");
            System.out.println("d: Cosine Function");
            System.out.println("e: exit");
            System.out.println("==================");

            System.out.print("\nEnter a letter: ");
            choice = input.next().charAt(0);

            /** The following switch statement with all the cases adn breaks acts like an if statement,
            * where it prints out the respective values for what the user inputs for the respective letter they choose from the menu.*/
            switch (MyMethod.myToLowerCase(choice)){
                case ('a'):
                    System.out.println("\nPOWER FUNCTION: Calculating x to the power of y.");
                    System.out.print("Enter x: ");
                    double x = input.nextDouble();

                    System.out.print("Enter y: ");
                    int y = input.nextInt();
                    input.nextLine();

                    double pow = MyMethod.myPow(x,y);
                    System.out.printf("%.2f^%d = %.2f\n\n",x,y,pow);
                    break;

                case ('b'):
                    System.out.println("\nFACTORIAL FUNCTION: Calculating factorial(n).");
                    System.out.print("Enter n: ");
                    int n = input.nextInt();
                    input.nextLine();

                    if (n<=0){
                        while (n<=0){
                            System.out.print("n has to be >= 0; enter again: ");
                            n = input.nextInt();
                        }
                    }

                    double factorial = MyMethod.myFactorial(n);
                    System.out.printf("%d! = %.2e\n\n",n,factorial);
                    break;

                case ('c'):
                    System.out.println("\nSINE FUNCTION: Calculating sin(k) degree.");
                    System.out.print("Enter k in degrees: ");
                    double k = input.nextDouble();
                    input.nextLine();

                    double sine = Math.sin(MyMethod.myDegreeToRadian(k));
                    System.out.printf("sin(%.2f) degree = %.2f\n\n",k,sine);
                    break;

                case ('d'):
                    System.out.println("\nCOSINE FUNCTION: Calculating cos(m) degree.");
                    System.out.print("Enter m in degrees: ");
                    double m = input.nextDouble();
                    input.nextLine();

                    double cos = MyMethod.myCos(MyMethod.myDegreeToRadian(m));
                    System.out.printf("sin(%.2f) degree = %.2f\n\n",m,cos);
                    break;

                case ('e'):
                    break;

                default:
                    System.out.println("\nInvalid Choice!\n");
            }

            if(MyMethod.myToLowerCase(choice) == 'e'){ // Double checks that the user inputted e, so the code will break out of the while loop if it is true.
                System.out.println("");
                break;
            }
        }
        MyMethod.myFooter(1);
    }
}
