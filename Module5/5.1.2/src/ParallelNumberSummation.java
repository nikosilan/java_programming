
import java.util.Random;

public class ParallelNumberSummation {

    public static void main(String[] args) {

        int arraySize = 100000;
        int[] numbers = new int[arraySize];

        Random random = new Random();

        // Generate random numbers
        for (int i = 0; i < arraySize; i++) {
            numbers[i] = random.nextInt(100);
        }

        // Get the number of available processor cores
        int numberOfThreads = Runtime.getRuntime().availableProcessors();

        System.out.println("Number of processor cores: " + numberOfThreads);

        // Store the sum calculated by each thread
        long[] partialSums = new long[numberOfThreads];

        Thread[] threads = new Thread[numberOfThreads];

        // Divide the array between threads
        int portionSize = arraySize / numberOfThreads;

        for (int i = 0; i < numberOfThreads; i++) {

            final int threadIndex = i;
            final int start = i * portionSize;

            final int end;

            if (i == numberOfThreads - 1) {
                end = arraySize;
            } else {
                end = start + portionSize;
            }

            threads[i] = new Thread(() -> {

                long sum = 0;

                for (int j = start; j < end; j++) {
                    sum += numbers[j];
                }

                partialSums[threadIndex] = sum;

                System.out.println("Thread " + threadIndex
                        + " calculated sum: " + sum);
            });

            threads[i].start();
        }

        // Wait for all threads to finish
        for (int i = 0; i < numberOfThreads; i++) {
            try {
                threads[i].join();
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
                return;
            }
        }

        // Calculate the total sum
        long totalSum = 0;

        for (int i = 0; i < numberOfThreads; i++) {
            totalSum += partialSums[i];
        }

        System.out.println("Total sum: " + totalSum);
    }
}
