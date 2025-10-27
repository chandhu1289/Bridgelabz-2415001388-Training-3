import static java.lang.Math.*;  // static import of all Math methods

public class StaticImportDemo {
    public static void main(String[] args) {
        double a = 25, b = 10;

        System.out.println("Square Root of 25: " + sqrt(a));
        System.out.println("Power (10^2): " + pow(b, 2));
        System.out.println("Max: " + max(a, b));
        System.out.println("Min: " + min(a, b));
        System.out.println("Absolute of -10: " + abs(-10));
    }
}

