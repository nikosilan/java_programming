
import java.util.Scanner;

public class MultiThreadedNumberPrinting {

    private static final Object lock = new Object();
    private static int currentNumber = 1;
    private static int maxNumber;

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the maximum number: ");
        maxNumber = scanner.nextInt();

        Thread oddThread = new Thread(() -> {
            while (true) {
                synchronized (lock) {
                    if (currentNumber > maxNumber) {
                        break;
                    }

                    if (currentNumber % 2 != 0) {
                        System.out.println("Odd Thread: " + currentNumber);
                        currentNumber++;
                        lock.notifyAll();
                    } else {
                        try {
                            lock.wait();
                        } catch (InterruptedException e) {
                            Thread.currentThread().interrupt();
                            break;
                        }
                    }
                }
            }
        });

        Thread evenThread = new Thread(() -> {
            while (true) {
                synchronized (lock) {
                    if (currentNumber > maxNumber) {
                        lock.notifyAll();
                        break;
                    }

                    if (currentNumber % 2 == 0) {
                        System.out.println("Even Thread: " + currentNumber);
                        currentNumber++;
                        lock.notifyAll();
                    } else {
                        try {
                            lock.wait();
                        } catch (InterruptedException e) {
                            Thread.currentThread().interrupt();
                            break;
                        }
                    }
                }
            }
        });

        oddThread.start();
        evenThread.start();

        try {
            oddThread.join();
            evenThread.join();
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }

        System.out.println("Printing complete.");

        scanner.close();
    }
}
