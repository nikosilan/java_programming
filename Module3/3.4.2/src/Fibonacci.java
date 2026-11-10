
import java.io.FileWriter;
import java.io.IOException;

public class Fibonacci {

    public static void main(String[] args) {

        long first = 0;
        long second = 1;

        try {
            FileWriter writer = new FileWriter("fibonacci.csv");

            writer.write("Number,Fibonacci\n");

            for (int i = 1; i <= 60; i++) {

                writer.write(i + "," + first + "\n");

                long next = first + second;
                first = second;
                second = next;
            }

            writer.close();

            System.out.println("60 Fibonacci numbers saved!");
            System.out.println("File: fibonacci.csv");

        } catch (IOException e) {
            System.out.println("An error occurred: " + e.getMessage());
        }
    }
}
