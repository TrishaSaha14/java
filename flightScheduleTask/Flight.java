package flightScheduleTask;

import java.time.LocalTime;

public class Flight {
    private int flightid;

    public int getAvailableSeats() {
        return availableSeats;
    }

    public int getFlightid() {
        return flightid;
    }

    private LocalTime departureTime;

    public LocalTime getDepartureTime() {
        return departureTime;
    }

    public LocalTime getArrivalTime() {
        return arrivalTime;
    }

    private LocalTime arrivalTime;
    private int availableSeats;

    public Flight(int flightid, LocalTime departureTime,LocalTime arrivalTime,int availableSeats){
        this.flightid=flightid;
        this.departureTime= departureTime;
        this.arrivalTime= arrivalTime;
        this.availableSeats=availableSeats;
    }

    public void bookSeats(){
        if(availableSeats != 0){
            availableSeats --;
            System.out.println("Seat booked");
            return;
        }
        System.out.println("No more seats are available");
    }

    @Override
    public String toString() {
        return "Flight{" +
                "flightid=" + flightid +
                ", departureTime=" + departureTime +
                ", arrivalTime=" + arrivalTime +
                ", availableSeats=" + availableSeats +
                '}';
    }

    public boolean isAvailable(){
        if(availableSeats!=0){
            return true;
        }
        return false;
    }

    public void getFlightInfo(){
        System.out.println("Flight Id: "+flightid+" Departure time is: "+departureTime+" Arrival Time is: "+arrivalTime+" Available seats: "+availableSeats);
    }


}
