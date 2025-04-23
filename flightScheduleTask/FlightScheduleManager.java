package flightScheduleTask;

import java.time.LocalTime;
import java.util.ArrayList;
import java.util.List;

public class FlightScheduleManager {
    private List<Flight> flights;

    public FlightScheduleManager(){
        flights=new ArrayList<>();
    }

    public void addFlight(Flight flight){

        flights.add(flight);
    }

    public boolean bookFlight(int id, int count){
        for(Flight fl:flights){

//            if(!fl.isAvailable()){
//               // System.out.println("No more seats are available");
//                return false;
//            }
            while(fl.getFlightid()==id && count<=fl.getAvailableSeats()){
                fl.bookSeats();
                count--;
                if(count==0){
                    return true;
                }

            }
        }

        return false;

    }

    public List<Flight> getAvailableFlight(LocalTime start, LocalTime end){
        List<Flight> gfl = new ArrayList<>();
        for(Flight fl:flights){
            if(fl.getDepartureTime().compareTo(start)>=0 && fl.getArrivalTime().compareTo(end)<=0 && fl.isAvailable()){
                gfl.add(fl);
            }
        }
        return gfl;
    }
}
