import java.util.Scanner;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        // Lists of first names and last names
        String[] firstNames = {
                "Matti", "Mikko", "Juhani", "Aleksi", "Elias",
                "Anna", "Sofia", "Emilia", "Aino", "Liisa"
        };

        String[] lastNames = {
                "Korhonen", "Virtanen", "Mäkinen", "Nieminen", "Mäkelä",
                "Hämäläinen", "Laine", "Heikkinen", "Koskinen", "Järvinen"
        };

        System.out.print("How many names should be generated? ");
        int count = Integer.parseInt(scanner.nextLine());

        // Generate and print random full names
        for (int i = 0; i < count; i++) {
            int firstIndex = random.nextInt(firstNames.length);
            int lastIndex = random.nextInt(lastNames.length);

            String fullName =
                    firstNames[firstIndex] + " " + lastNames[lastIndex];

            System.out.println(fullName);
        }


        scanner.close();
    }
}
