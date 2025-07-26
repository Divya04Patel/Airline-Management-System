public class Booking {
    private String bookingId;
    private Customer customer;
    private Flight flight;

    public Booking(String bookingId, Customer customer, Flight flight) {
        this.bookingId = bookingId;
        this.customer = customer;
        this.flight = flight;
    }

    @Override
    public String toString() {
        return "Booking ID: " + bookingId + " | Customer: " + customer.getName() + " | Flight: " + flight.getFlightId();
    }
}