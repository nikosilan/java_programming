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

        // Read the numbers entered by the user
        System.out.println("Enter the integers into the array:");

        for (int i = 0; i < size; i++) {
            System.out.print("Enter integer " + (i + 1) + ": ");
            numbers[i] = Integer.parseInt(scanner.nextLine());
        }

        // Create an array for unique numbers
        int[] unique = new int[size];
        int uniqueCount = 0;

        // Check each number in the original array
        for (int i = 0; i < size; i++) {
            boolean found = false;

            // Check if the number is already in the new array
            for (int j = 0; j < uniqueCount; j++) {
                if (numbers[i] == unique[j]) {
                    found = true;
                    break;
                }
            }

            // Add the number if it is not already there
            if (!found) {
                unique[uniqueCount] = numbers[i];
                uniqueCount++;
            }
        }

        // Print the array without duplicates
        System.out.println("The array without duplicates:");

        for (int i = 0; i < uniqueCount; i++) {
            System.out.print(unique[i] + " ");
        }

        System.out.println();
        scanner.close();
    }
}
