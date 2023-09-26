package Lab3Q;

public class MyMethod {

    final public static double PI = 3.141592653589793; // A variable that does not change because it is the constant PI.

    // The following method will determine whether the power of is a positive, negative or 0 using an if statement to perform the respective calculation.
    public static double myPow(double x, int y) {
        double ans = 1;

        if (y < 0)
            for (int i = 0; i > y; i--)
                ans = (ans) * (1 / x);
        else
            for (int i = 0; i < y; i++)
                ans = ans * (x);
        return ans;
    }

    // The following method uses a for loop to perform the necessary calculation of a factorial.
    public static double myFactorial(int n) {
        double fact = 1;
        for (int i = 2; i <= n; i++)
            fact = fact * i;
        return fact;
    }

    /** The following sin and cos methods both perform the same thing. Take
     * in a radian value of x and then uses the previous factorial and power
     * methods to return the respective value.*/
    public static double mySin(double x){
        double ans = 0;
        double factorial = 0;
        double powX = 0;
        for (int i = 0; i < 20; i++){
            factorial = myFactorial(2*(i)+1);
            powX = myPow(x,(2*i+1));
            ans = ans + (((myPow(-1.0,i))/factorial)*(powX));
        }
        return ans;
    }

    public static double myCos(double x){
        double ans = 0;
        double factorial = 0;
        double powX = 0;
        for (int i = 0; i < 20; i++){
            factorial = myFactorial(2*(i));
            powX = myPow(x,(2*i));
            ans = ans + (((myPow(-1.0,i))/factorial)*(powX));
        }
        return ans;
}

    // The following method converts from degrees to radians through multiplying by PI/180 (PI from the final variable we declared previously).
    public static double myDegreeToRadian(double degree){
        double radians = (degree)*(PI/180);
        return radians;
    }

    // Method returning uppercase letters into lowercase letters.
    public static char myToLowerCase(char c){
        char lowerCase = 'a';
        if (c >= 'A' && c <= 'Z')
            lowerCase = (char) (c + ('a' - 'A'));
        else
            lowerCase = c;
        return lowerCase;
    }

    // Method for a header for ease of use and the next one is for the footer.
    public static void myHeader(int labNum, int questionNum, String description){
        System.out.println("Lab Assigment: " + labNum + ", Question: " + questionNum);
        System.out.println("Program Description: " + description);
    }

    public static void myFooter(int questionNumber){
        System.out.println("*** Signing off from Question " + questionNumber + " - Hamza Elkababji ***");
    }
}
