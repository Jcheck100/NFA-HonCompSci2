package Chapter8.Circle;
import java.util.*;

class Circles {
    public Scanner userInput = new Scanner(System.in);
    private static final double PI = 3.14;
    private double radius;

    public Circles() {
        do{
        System.out.println("Please input the radius of the circle");
        radius = userInput.nextInt(); // default radius
        }while(radius < 1);
        userInput.close();
    }

    public void setRadius(double newRadius) {
        radius = newRadius;
    }

    public double area() {
        double circleArea;
        circleArea = PI * radius * radius;
        return (circleArea);
    }

    public double getRadius() {
        return (radius);
    }

    public double circumference() {
        double circumference;
        circumference = 2 * PI * radius;
        return (circumference);
    }
}