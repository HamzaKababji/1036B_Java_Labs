package Q1;

public class Circle{
    public double radius; // Declaring radius as a public double type data, so it can be accessed from other classes

    public void setRadius(double rad){ // Void return type method to set a parameter of double type called rad
        radius = rad; //setting radius as parameter
    }
    /** All the following methods have been made to link parameters from different classes
     * and to allow the return of a double type variable after doing the respective
     * calculation to its name.*/
    public double getRadius(){
        return radius; // Returning the radius variable
    }

    public double getArea(){
        return Math.PI*(Math.pow(radius, 2)); //returning a calculation of area using radius
    }

    public double getDiameter(){
        return radius*2; //returning radius * 2 (to find diameter)
    }

    public double getCircumference() {
        return 2 * Math.PI * radius; //returning a calculation of circumference using radius
    }
        public Circle(double r){
            radius = r;
        }
}
