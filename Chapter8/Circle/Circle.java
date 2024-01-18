package Chapter8.Circle;

import java.text.NumberFormat;

public class Circle {
    private static NumberFormat number = NumberFormat.getNumberInstance();
    private static final double PI = 3.14;
    private double radius;

    public static void main(String[] args) {
        Circles spot = new Circles();

        spot.setRadius(5);

        System.out.println("The radius is " + spot.getRadius());
        System.out.println("The area is " + spot.area());
        System.out.println("The circumference is " + number.format(spot.circumference()));
        displayAreaFormula();
    }
     public static void displayAreaFormula(){
        System.out.println("The formula for the area of a Circle is a=Pi*r*r");

     }
}