import java.util.ArrayList;

public class Bus {
    private ArrayList<Seat> seats;
    private String destination;

    public Bus(String destination, int seats) {
        this.destination = destination;
        this.seats = new ArrayList<>();
    }

    public Seat getSeatInfo() {
        return null;
    }
}
