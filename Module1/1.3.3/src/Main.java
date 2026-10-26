import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter start: ");
        int start = Integer.parseInt(scanner.nextLine());

        System.out.print("Enter end: ");
        int end = Integer.parseInt(scanner.nextLine());

        // Check if the range is valid
        if (start >= end || start < 1) {
            System.out.println("Invalid range.");
        } else {
            System.out.println("Prime numbers:");

            // Check each number in the range
            for (int number = start; number <= end; number++) {
                boolean isPrime = number > 1;

                // Check if the number has a divisor
                for (int divisor = 2;
                     divisor * divisor <= number;
                     divisor++) {
                    if (number % divisor == 0) {
                        isPrime = false;
                        break;
                    }
                }

                // Print the number if it is prime
                if (isPrime) {
                    System.out.println(number);
                }
            }
        }


        scanner.close();
    }
}
