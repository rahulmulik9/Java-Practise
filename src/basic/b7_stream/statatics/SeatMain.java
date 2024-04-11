package basic.b7_stream.statatics;

import java.util.Arrays;

public class SeatMain {
    public static void main(String[] args) {
        Seat[] seats = new Seat[100];
        Arrays.setAll(seats,i->new Seat((char)('A'+i/10),i%10+1));
        Arrays.asList(seats).forEach(System.out::println);

        long reservationCOunt = Arrays.stream(seats)
                .filter(Seat::isReseved)
                .count();
        System.out.println(reservationCOunt);

        boolean hasBooking  = Arrays.stream(seats)
                .anyMatch(Seat::isReseved);
        System.out.println(hasBooking);

        boolean hasAllBooking  = Arrays.stream(seats)
                .allMatch(Seat::isReseved);
        System.out.println(hasAllBooking);


        boolean hasNoneBooking  = Arrays.stream(seats)
                .noneMatch(Seat::isReseved);
        System.out.println(hasNoneBooking);



    }
}
