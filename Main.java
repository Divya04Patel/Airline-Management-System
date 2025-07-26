import java.util.Scanner;
import java.util.UUID;

public class Main {
    public static void main(String[] args) {
        AirlineSystem system = new AirlineSystem();
        Scanner sc = new Scanner(System.in);

        // Sample flights
        system.addFlight(new Flight("FL101", "Delhi", "Mumbai", 10));
        system.addFlight(new Flight("FL102", "Bangalore", "Chennai", 5));

        while (true) {
            System.out.println("\n--- Airline Management System ---");
            System.out.println("1. Show Flights");
            System.out.println("2. Book Ticket");
            System.out.println("3. Show Bookings");
            System.out.println("4. Exit");
            System.out.print("Choose: ");
            int choice = sc.nextInt();
            sc.nextLine(); // Consume newline

            switch (choice) {
                case 1:
                    system.showAllFlights();
                    break;
                case 2:
                    System.out.print("Enter your name: ");
                    String name = sc.nextLine();
                    System.out.print("Enter flight ID: ");
                    String flightId = sc.nextLine();
                    Customer customer = new Customer(UUID.randomUUID().toString().substring(0, 8), name);
                    system.bookTicket(customer, flightId);
                    break;
                case 3:
                    system.showBookings();
                    break;
                case 4:
                    System.out.println("Thanks for using Airline System!");
                    return;
                default:
                    System.out.println("Invalid choice!");
            }
        }
    }
}