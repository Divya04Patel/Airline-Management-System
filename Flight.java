public class Flight {
    private final String flightId;
    private final String source;
    private final String destination;
    private int seatsAvailable;

    public Flight(String flightId, String source, String destination, int seatsAvailable) {
        this.flightId = flightId;
        this.source = source;
        this.destination = destination;
        this.seatsAvailable = seatsAvailable;
    }

    // Getters and Setters

    public String getFlightId() { return flightId; }
    public String getSource() { return source; }
    public String getDestination() { return destination; }
    public int getSeatsAvailable() { return seatsAvailable; }

    public void bookSeat() {
        if (seatsAvailable > 0) {
            seatsAvailable--;
        }
    }

    @Override
    public String toString() {
        return flightId + ": " + source + " -> " + destination + " | Seats: " + seatsAvailable;
    }
}