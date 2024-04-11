package basic.b7_stream.statatics;

import java.util.Random;

public record Seat(char rowMarker, int seatNumber, boolean isReseved) {
    public Seat(char rowMarker, int seatNumber) {
        this(rowMarker, seatNumber, new Random().nextBoolean());
    }
}
