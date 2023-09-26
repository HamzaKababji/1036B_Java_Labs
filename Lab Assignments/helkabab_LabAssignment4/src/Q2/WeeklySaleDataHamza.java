package Q2;

public class WeeklySaleDataHamza {
    private double[] sale;

    public WeeklySaleDataHamza(){ // This is a 0 parameter constructor that gives the default value of null to the sale field defined in the same class but outside the method.
        this.sale = null;
    }

    public WeeklySaleDataHamza(double[] sale){ // This constructor acts as a setter since it takes in a double and sets the field in the class equal to that parameter value.
        this.sale = sale;
    }

    public double getAverageSale(){ // Getter that calculates the average of the sales, using a for loop to include all quantities in the array without hard coding the size of the array.
        double total = 0;
        for (int i = 0; i < sale.length; i++){
            total += sale[i];
        }
        return total/sale.length;
    }

    public double getHighestSale(){ // Same exact setup as the getter above except this time, we single out the highest score using an if statement nested in the for loop.
        double temp = sale[0];
        for (int i = 0; i < sale.length; i++){
            if(sale[i] > temp){
                temp = sale[i];
            }
        }
        return temp;
    }

    public double getLowestSale(){ // Same thing as lines 22 to 30 except the opposite; now we are looking for the lowest number to single out.
        double temp = sale[0];
        for (int i = 0; i < sale.length; i++){
            if(sale[i] < temp){
                temp = sale[i];
            }
        }
        return temp;
    }

    public void displaySaleData(){ // Once this is called, we print out the array in a neat way using a printf statement.
        System.out.print("[");
        for (int i = 0; i < sale.length; i++){
            System.out.printf("%.2f, ", sale[i]);
        }
        System.out.println("\b\b]");
    }

    public double getStandardDeviation(){ //Calculated the standard deviation the same way the equation is given to us in the hand out.
        double loop = 0;
        double mean = getAverageSale();
        double standDev;
        for (int N = 0; N < sale.length; N++){
            loop += (Math.pow((sale[N]-mean),2));
        }
        standDev = Math.sqrt(loop/sale.length);
        return standDev;
    }
}
