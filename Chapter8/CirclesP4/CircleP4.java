package Chapter8.CirclesP4;

public class CircleP4 {
    public static void main(String[] args) {
        Circles c = new Circles(3);
        Circles d = new Circles(4);
        if (c.equals(d)) {
            System.out.println("Objects are equal.");
        } else {
            System.out.println("Objects are not equal.");
        }
        System.out.println(c);
        System.out.println(d);
    }
    
}
