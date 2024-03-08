package Chapter8.CirclesP4;

import java.util.*;

class Circles {
    public Scanner userInput = new Scanner(System.in);
    private static final double PI = 3.14;
    private double radius;

    public Circles(double r) {
        radius = r;
    }

    public double getRadius() {
        return (radius);
    }

    @Override
    public boolean equals(Object c) {
        Circles testObj = (Circles) c;
        if (testObj.getRadius() == radius) {
            return (true);
        } else {
            return (false);
        }
    }
    @Override
    public String toString() {
        String circleString;
        circleString = "Circle has radius " + radius;
        return (circleString);
    }
}
