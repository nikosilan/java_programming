import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a: ");
        double a = Double.parseDouble(scanner.nextLine());

        System.out.print("Enter b: ");
        double b = Double.parseDouble(scanner.nextLine());

        System.out.print("Enter c: ");
        double c = Double.parseDouble(scanner.nextLine());

        // Check a = zero
        if (a == 0) {
            System.out.println("Coefficient a must not be zero.");
        } else {
            // Calculate the discriminant
            double d = b * b - 4 * a * c;

            if (d < 0) {
                // No real roots if d is negative
                System.out.println("No real roots");
            } else if (d == 0) {
                // One root if d is zero
                double x = -b / (2 * a);
                System.out.println("Root: " + x);
            } else {
                // Two roots if d is positive
                double x1 = (-b + Math.sqrt(d)) / (2 * a);
                double x2 = (-b - Math.sqrt(d)) / (2 * a);

                System.out.println("Roots: " + x1 + " and " + x2);
            }
        }


        scanner.close();
    }
}
