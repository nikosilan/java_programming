
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the size of the array: ");
        int size = Integer.parseInt(scanner.nextLine());

        if (size <= 0) {
            System.out.println("The array size must be positive.");
            scanner.close();
            return;
        }

        int[] numbers = new int[size];

        System.out.println("Enter the integers into the array:");

        for (int i = 0; i < size; i++) {
            System.out.print("Enter integer " + (i + 1) + ": ");
            numbers[i] = Integer.parseInt(scanner.nextLine());
        }

        // Initialize the maximum sum
        int maxSum = numbers[0];
        int bestStart = 0;
        int bestEnd = 0;

        // numbers with the largest sum
        for (int start = 0; start < size; start++) {
            int sum = 0;

            for (int end = start; end < size; end++) {
                sum += numbers[end];

                if (sum > maxSum) {
                    maxSum = sum;
                    bestStart = start;
                    bestEnd = end;
                }
            }
        }

        // Print the maximum sum and the indices
        System.out.println("Maximum sum: " + maxSum);
        System.out.println("Integers: " + (bestStart + 1) + "-" + (bestEnd + 1));

        scanner.close();
    }
}
