package flightScheduleTask;

import java.time.LocalTime;

public class DomesticFlight extends Flight{
    private int stateCode;

    public DomesticFlight(int flightid, LocalTime departureTime,LocalTime arrivalTime, int availableSeats, int stateCode){
        super(flightid,departureTime,arrivalTime,availableSeats);
        this.stateCode=stateCode;
    }

    public void getFlightInfo(){
        super.getFlightInfo();
        System.out.print(" State code is: "+stateCode);
    }
}
