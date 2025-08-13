import java.util.Scanner;

public class Cylinder {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the radius of the cylinder: ");
        double radius = scanner.nextDouble();

        System.out.print("Enter the height of the cylinder: ");
        double height = scanner.nextDouble();
        // Calculate volume
        double volume = Math.PI * radius * radius * height;

        // Output the result
        System.out.printf("Volume of the cylinder = %.2f\n", volume);

        scanner.close();
    }
}