import java.util.*;

class Circles {
    public Scanner userInput = new Scanner(System.in);
    private static final double PI = 3.14;
    private double radius;

    public Circles() { //runs if there is no value assigned to radius in the constructor in the main method
        do {
            System.out.println("Please input the radius of the circle");
            radius = userInput.nextInt(); // default radius
        } while (radius < 1);
        userInput.close();

    }

    public Circles(double r) { //overloaded constructor, runs if there is a value assigned to the radius from the start in the constructor in the main method
        radius = r;
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
