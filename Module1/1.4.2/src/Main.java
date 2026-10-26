import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Ask for the array size
        System.out.print("Enter the size of the array: ");
        int size = Integer.parseInt(scanner.nextLine());

        if (size <= 0) {
            System.out.println("The array size must be positive.");
            scanner.close();
            return;
        }

        int[] numbers = new int[size];

        // Read the numbers into the array
        System.out.println("Enter the integers into the array:");

        for (int i = 0; i < size; i++) {
            System.out.print("Enter integer " + (i + 1) + ": ");
            numbers[i] = Integer.parseInt(scanner.nextLine());
        }

        // Set the initial maximum sum
        int maxSum = numbers[0];
        int bestStart = 0;
        int bestEnd = 0;

        // Check each possible starting position
        for (int start = 0; start < size; start++) {
            int sum = 0;

            // Calculate sums of consecutive numbers
            for (int end = start; end < size; end++) {
                sum += numbers[end];

                // Update the maximum sum and its indices
                if (sum > maxSum) {
                    maxSum = sum;
                    bestStart = start;
                    bestEnd = end;
                }
            }
        }

        // Print the result using positions starting from 1
        System.out.println("Maximum sum: " + maxSum);
        System.out.println(
                "Integers: " + (bestStart + 1) + "-" + (bestEnd + 1)
        );


        scanner.close();
    }
}
