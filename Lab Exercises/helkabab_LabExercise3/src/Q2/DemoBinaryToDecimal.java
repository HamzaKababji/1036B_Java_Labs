package Q2;
import Lab3Q.MyMethod; //Importing a different package, so I do not have to redo everything since I am reusing the same methods.

public class DemoBinaryToDecimal {
    public static void main(String [] args){ //Driver method; where the code starts to print out my information and a description along with where it ends after everything has been called and completed in the respective order.
        MyMethod.myHeader(3,2,"This program will convert binary code to decimal values\n\n");
        int[] ar = new int[4];
        int temp;
        for (int i = 0; i < ar.length;i++ ){
            temp = (int)(Math.random()*2);
            ar [i] = temp;
        }

        BinaryToDecimalHamza tempAr1 = new BinaryToDecimalHamza(ar); //Instantiating a new object so it can have default values.
        System.out.print("The 4 bit number is: ");
        tempAr1.displayArray();
        System.out.println("The corresponding decimal value is: " + tempAr1.getDecimalValue());
        tempAr1.doubleTheSizeZeroPadding();
        System.out.print("The 8 bit number after the size is doubled and zero padded: ");
        tempAr1.displayArray();
        System.out.println("The corresponding decimal value is: " + tempAr1.getDecimalValue());
        //All of the above code is doing essentially the same thing with each method, where with the object we cal lon each method to perform the calculation which then is printed out using a normal print statement.

        ar = tempAr1.reverseArray();
        BinaryToDecimalHamza tempAr2 = new BinaryToDecimalHamza(ar); //Instantiating a new second object to perform the same thing as above.
        System.out.print("The 8 bit number after reversing the array is: ");
        tempAr2.displayArray();
        System.out.println("The corresponding decimal value is: " + tempAr2.getDecimalValue());

        tempAr2.shiftRight();
        System.out.print("The 8 bit number after the shift right operation: ");
        tempAr2.displayArray();
        System.out.println("The corresponding decimal value is: " + tempAr2.getDecimalValue());

        tempAr2.shuffleArray();
        System.out.print("The 8 bit number after shuffling operation: ");
        tempAr2.displayArray();
        System.out.println("The corresponding decimal value: " + tempAr2.getDecimalValue());
        //All of the above where the exact same as lines 14 to 21 but with a second object and now using the final couple of methods of the BinaryToDecimalHamza class and displaying the output after each method call.
        System.out.println("");
        MyMethod.myFooter(1);
    }
}
