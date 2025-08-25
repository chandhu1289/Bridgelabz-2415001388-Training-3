import java.util.*;
class Voting {
    public static void main(String[] args) {
        int age = new Scanner(System.in).nextInt();
        System.out.println("The person's age is " + age + " and " + (age >= 18 ? "can" : "cannot") + " vote.");
    }
}
