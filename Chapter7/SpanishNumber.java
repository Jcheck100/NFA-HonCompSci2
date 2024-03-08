public class SpanishNumber {
    public static void spanishCounting(int i) {
        switch (i) {
            case 1:
                System.out.println("Uno 1");
                break;
            case 2:
                System.out.println("Dos 2");
                break;
            case 3:
                System.out.println("Tres 3");
                break;
            case 4:
                System.out.println("Cuatro 4");
                break;
            case 5:
                System.out.println("Cinco 5");
                break;
            case 6:
                System.out.println("Seis 6");
                break;
            case 7:
                System.out.println("Siete 7");
                break;
            case 8:
                System.out.println("Ocho 8");
                break;
            case 9:
                System.out.println("Nueve 9");
                break;
            case 10:
                System.out.println("Diez 10");
                break;
        }
    }

    public static void main(String[] args) {

        for (int j = 1; j <= 10; j++) {
            spanishCounting(j);

        }
    }
}