package genericsTask;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Flight<T> {
    private String flightNumber;
    private List<T> passengers =new ArrayList<T>();;

    public Flight(String flightNumber,List<T> passengers){
        this.flightNumber=flightNumber;
        this.passengers=new ArrayList<T>();
    }

    public Flight(String flightNumber){
        this.flightNumber=flightNumber;
    }

    public void addPassenger(T passenger){

        this.passengers.add(passenger);
        System.out.println("Passenger added!");
    }

    public void showPassengers(){
        Iterator<T> itr = passengers.iterator();
        while (itr.hasNext()){
            System.out.print(itr.next()+" ");
        }
        System.out.println();
//        for (T i:passengers){
//            System.out.println(i);
//        }
    }
}
