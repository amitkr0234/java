import java.util.*;

public class flotingPoint {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter first floating point number: ");
        double num1 = scanner.nextDouble();

        System.out.print("Enter second floating point number: ");
        double num2 = scanner.nextDouble();

        // Calculate product
        double product = num1 * num2;

        // Display result
        System.out.println("Product of " + num1 + " and " + num2 + " is: " + product);
    }
}