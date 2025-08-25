import java.util.*;
class CheckNumber {
    public static void main(String[] args) {
        int n = new Scanner(System.in).nextInt();
        System.out.println(n > 0 ? "positive" : n < 0 ? "negative" : "zero");
    }
}
