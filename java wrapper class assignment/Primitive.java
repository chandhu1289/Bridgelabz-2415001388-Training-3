import java.util.Scanner;

public class Primitive {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // Take integer input from user
        System.out.print("Enter an integer value: ");
        int num = sc.nextInt();
        // Convert primitive int to Integer object
        Integer obj = Integer.valueOf(num);
        // Display both values
        System.out.println("Primitive value: " + num);
        System.out.println("Wrapper (Integer object) value: " + obj);
        sc.close();
    }
}