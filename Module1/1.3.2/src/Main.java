import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a binary number: ");
        String binary = scanner.nextLine();

        int decimal = 0;
        boolean valid = true;

        // Check each character in the binary number
        for (int i = 0; i < binary.length(); i++) {
            char bit = binary.charAt(i);

            // Check if the character is 0 or 1
            if (bit != '0' && bit != '1') {
                valid = false;
                break;
            }

            // Convert the binary number to decimal
            decimal = decimal * 2 + (bit - '0');
        }

        // Print the result if the input is valid
        if (valid && !binary.isEmpty()) {
            System.out.println("Decimal: " + decimal);
        } else {
            System.out.println("Invalid binary number.");
        }

        // Close the Scanner
        scanner.close();
    }
}
