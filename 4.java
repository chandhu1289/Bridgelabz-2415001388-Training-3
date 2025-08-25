import java.util.*;
class NaturalSum {
    public static void main(String[] args) {
        int n = new Scanner(System.in).nextInt();
        if (n > 0)
            System.out.println("The sum of " + n + " natural numbers is " + (n * (n + 1) / 2));
        else
            System.out.println("The number " + n + " is not a natural number");
    }
}
