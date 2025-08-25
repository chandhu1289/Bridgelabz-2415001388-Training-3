import java.util.*;
class SumNaturalCompare {
    public static void main(String[] args) {
        int n = new Scanner(System.in).nextInt();
        if (n > 0) {
            int sum = 0, i = 1;
            while (i <= n) sum += i++;
            int formula = n * (n + 1) / 2;
            System.out.println("Sum by loop: " + sum + ", by formula: " + formula + ", Match? " + (sum == formula));
        } else System.out.println("Not a natural number");
    }
}
