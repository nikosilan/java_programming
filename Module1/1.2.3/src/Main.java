
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        final double GRAMS_PER_LUOTI = 13.28;


        System.out.print("Weight (g): ");
        double grams = Double.parseDouble(scanner.nextLine());


        double totalLuoti = grams / GRAMS_PER_LUOTI;

        int leiviska = (int) (totalLuoti / (20 * 32));


        double remainingLuoti = totalLuoti - leiviska * 20 * 32;


        int naula = (int) (remainingLuoti / 32);


        double luoti = remainingLuoti - naula * 32;


        System.out.printf(
                "%.0f grams is %d leiviskä, %d naula, and %.2f luoti.%n",
                grams, leiviska, naula, luoti
        );

        scanner.close();
    }
}
