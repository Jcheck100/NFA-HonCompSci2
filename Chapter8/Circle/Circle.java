
/**
 * Circle class.
 */
public class Circle {
    private static final double PI = 3.14;
    private double radius;

    public Circle() {
        radius = 1; // default radius
    }

    public void setRadius(double newRadius) {
        radius = newRadius;
    }

    public double getCircumference(){
        double circleCircumference;
        circleCircumference = 2 * PI * radius;
        return (circleCircumference);
    }

    
    //Calculates the area of the circle.
    public double area() {
        double circleArea;
        circleArea = PI * radius * radius;
        return (circleArea);
    }


     //Returns the radius of the circle.
    public double getRadius() {
        return (radius);
    }
}