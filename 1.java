import java.util.*;
class DivisibleBy5 {
    public static void main(String[] args) {
        int n = new Scanner(System.in).nextInt();
        System.out.println("Is the number " + n + " divisible by 5? " + (n % 5 == 0));
    }
}
