package Q2;

public class BinaryToDecimalHamza {
    private int[] binaryArray;
    public BinaryToDecimalHamza(){ //Default constructor
    }
    public BinaryToDecimalHamza(int[] myArray){ // Constructor that sets the values for an array once it's called.
        binaryArray = myArray;
    }
    public void displayArray(){ // Standard way of displaying an array using a for loop where the arguments include incrementing until the counter reaches the array length.
        System.out.print("[");
        for(int i = 0; i < binaryArray.length; i++){
            System.out.printf("%d ", binaryArray[i]);
        }
        System.out.print("\b]\n");
    }
    public int getDecimalValue(){ //Used for returning the calculated value of the decimal as a temp variable.
        int temp = 0;
        int j = 0;
        for (int i = binaryArray.length - 1; i >= 0; i--){
            temp = (int) (temp + (binaryArray[i] * Math.pow(2,j)));
            j++;
        }
        return temp;
    }
    public void doubleTheSizeZeroPadding(){ //Used to be able to double the size of an array and zero pad it. This will give us more arrays to calculate the decimal value of.
        int[] dpArray = new int[binaryArray.length*2];
        int j = 0;
        for ( int i = dpArray.length/2; i < dpArray.length; i++ ){
            dpArray[i] = binaryArray[j];
            j++;

        }
        binaryArray = dpArray;
    }
    public int[] reverseArray() { //Taking the same array after it is doubled and now performing a reverse operation on it through a for loop.
        int j = 0;
        int[] rev = new int[binaryArray.length];
        for (int i = binaryArray.length - 1; i >= 0; i--){
            rev[j] = binaryArray[i];
            j++;
        }
        return rev;
    }
    public void shuffleArray(){ //Same thing with the above and below method except, now instead of shifting to the right or reversing we are shuffling them randomly using the Math.random pre-set method.
        int j;
        int temp;
        for (int i = 0; i < binaryArray.length; i++){
            j = (int)(Math.random()*binaryArray.length);

            temp = binaryArray[i];
            binaryArray[i] = binaryArray[j];
            binaryArray[j] = temp;
        }
    }

    public void shiftRight(){ //Similiar to the last two methods, just now we are shifting it to the right using a for loop and a temp variable as a placeholder.
        int temp = binaryArray[binaryArray.length-1];
        for (int i = binaryArray.length - 2; i >= 0; i--){
            binaryArray[i+1] = binaryArray[i];
        }
        binaryArray[0] = temp;
    }
}
