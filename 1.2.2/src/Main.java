
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        System.out.print("Length of the first leg: ");
        double a = Double.parseDouble(scanner.nextLine());

        System.out.print("Length of the second leg: ");
        double b = Double.parseDouble(scanner.nextLine());

        // Calculate the hypotenuse using Pythagoras' theorem
        double c = Math.sqrt(a * a + b * b);


        System.out.println("The hypotenuse is " + c);

        scanner.close();
    }
}
