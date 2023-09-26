package Q1;
import Lab3Q.MyMethod; //Importing a different package, so I do not have to redo everything since I am reusing the same methods.

public class SimulateJudgesScoreHamza {

    public static void populateArray(double[] hamza){ //Just like regular, we are populating an array but instead of through user input or hardcoded values, we are not doing it through a random number generator using the Math.random method with a certain range.
        for(int i = 0; i < hamza.length; i++ ){
            hamza[i] = Math.random()*3+7;
        }
    }

    public static void displayArray(double[] hamza){ //Once called, this method will display the array we populated above by using a for loop adn a counter that goes until it reaches the array length/size.
        System.out.print("[");
        for (int i = 0; i < hamza.length; i++){
            System.out.printf("%.2f, ",hamza[i]);
        }
        System.out.print("\b\b]\n");
    }
    public static double finalScore(double[] hamza) {
        /**This entire method starts off by finding the maximum and minimum values of the elements inside an array, then continues to set those equal to 0.
         * Then, it takes the values left in the array, and it sums them up. After that, it takes the sum and divides it by the number of non zero values
         * there are which outputs teh final score of the array.*/

        double[] hamham = new double[hamza.length];
        for (int i = 0; i < hamza.length; i++) {
            hamham[i] = hamza[i];
        }
        double max = hamham[0];
        for (int i = 1; i < hamham.length; i++) {
            if (hamham[i] > max) {
                max = hamham[i];
            }
        }

        double min = hamham[0];
        for (int i = 1; i < hamham.length; i++) {
            if (hamham[i] < min) {
                min = hamham[i];
            }
        }

        System.out.printf("\tHighest Score is: %.2f\n", max);
        System.out.printf("\tLowest Score is: %.2f\n", min);

        for (int i = 0; i < hamham.length; i++) {
            if (hamham[i] == max) {
                hamham[i] = 0;
            }
            if (hamham[i] == min) {
                hamham[i] = 0;
            }
        }
        System.out.println("Here are the scores after discarding the highest and the lowest scores:");
        displayArray(hamham);
        double average = 0;
        double temp = 0;
        int j = 0;

        for(int i = 0; i < hamham.length; i++){
            temp = temp + hamham[i];
            j++;
        }
        average = temp/(j-2); //Subtract 2 since we are removing the max and min always, so there always be 2 values removes, thus, making it two less than the array length.
        return average;
    }

    public static void main(String [] args){ //Driver method which is like always used to start/initiate the code and end on it with a footer to sign off on the question.
        MyMethod.myHeader(3,1,"Finding the maximum and minimum in arrays and altering the values ");

        double[] ham = new double[5];
        populateArray(ham);
        System.out.println("Here are the scores from the 5 judges: ");
        displayArray(ham);
        System.out.printf("\tThe final score is: %.2f\n\n",finalScore(ham));
        MyMethod.myFooter(1);
    }
}
