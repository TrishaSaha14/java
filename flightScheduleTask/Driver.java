package flightScheduleTask;

import java.time.LocalTime;
import java.util.List;

public class Driver {
    public static void main(String[] args) {
        Flight df = new DomesticFlight(121,LocalTime.parse("10:30"),LocalTime.parse("12:30"),3,48);
        Flight inf = new InternationalFlight(252,LocalTime.parse("13:00"),LocalTime.parse("22:15"),3,97);

        df.bookSeats();
        boolean isa = df.isAvailable();
        System.out.println("Is seats available in Domestic Flight? "+isa);
        df.getFlightInfo();

        inf.bookSeats();
        boolean isa1 = inf.isAvailable();
        System.out.println("Is seats available in Domestic Flight? "+isa1);
        inf.getFlightInfo();

        FlightScheduleManager fsm = new FlightScheduleManager();
        fsm.addFlight(df);
        fsm.addFlight(inf);
        boolean bdf = fsm.bookFlight(121,1);
        boolean bif = fsm.bookFlight(252,1);
        System.out.println("Domestic Ticket booked: "+bdf);
        System.out.println("International Ticket booked: "+bif);

        List<Flight> lf = fsm.getAvailableFlight(LocalTime.parse("10:30"),LocalTime.parse("23:00"));
        System.out.println(lf);
    }
}
