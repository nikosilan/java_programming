
import java.util.Random;

class Theater {

    private int availableSeats;

    public Theater(int availableSeats) {
        this.availableSeats = availableSeats;
    }

    // Only one customer can reserve seats at a time
    public synchronized void reserveSeats(int customerId, int tickets) {

        if (tickets <= availableSeats) {
            availableSeats -= tickets;

            System.out.println("Customer " + customerId
                    + " reserved " + tickets + " tickets.");
        } else {
            System.out.println("Customer " + customerId
                    + " couldn't reserve " + tickets + " tickets.");
        }
    }
}

public class TicketReservationSystem {

    public static void main(String[] args) {

        int totalSeats = 10;
        int numberOfCustomers = 15;

        Theater theater = new Theater(totalSeats);

        Thread[] customers = new Thread[numberOfCustomers];

        Random random = new Random();

        // Create one thread for each customer
        for (int i = 0; i < numberOfCustomers; i++) {

            final int customerId = i + 1;
            final int tickets = random.nextInt(4) + 1;

            customers[i] = new Thread(() -> {
                theater.reserveSeats(customerId, tickets);
            });

            customers[i].start();
        }

        // Wait for all customers to finish
        for (int i = 0; i < numberOfCustomers; i++) {
            try {
                customers[i].join();
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
                return;
            }
        }

        System.out.println("Ticket reservation process complete.");
    }
}
