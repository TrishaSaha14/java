package flightScheduleTask;

import java.time.LocalTime;

public class InternationalFlight extends Flight{
    private int countryCode;

    public InternationalFlight(int flightid, LocalTime departureTime, LocalTime arrivalTime, int availableSeats, int countryCode){
        super(flightid,departureTime,arrivalTime,availableSeats);
        this.countryCode=countryCode;
    }

    public void getFlightInfo(){
        super.getFlightInfo();
        System.out.print(" Country code is: "+countryCode);
    }
}
