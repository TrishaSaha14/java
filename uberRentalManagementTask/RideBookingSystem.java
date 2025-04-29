package uberRentalManagementTask;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class RideBookingSystem {
    List<Customer> customers = new ArrayList<>();
    List<Driver> drivers = new ArrayList<>();
    List<Ride> rides = new ArrayList<>();

    public void registerCustomer(Customer customer){
        customers.add(customer);
    }

    public void registerDriver(Driver driver){
        drivers.add(driver);
    }

    public Ride bookRide(Customer customer){
        Optional<Driver> availableDriver = drivers.stream().filter(n -> n.isAvailable()==true).findFirst();
        if(availableDriver.isPresent()){
            Driver driver = availableDriver.get();
            Ride ride = new Ride(customer,driver);
            driver.setAvailable(false);
            rides.add(ride);
            System.out.println("Ride booked.");
            return ride;

        }
        else {
            throw new InvalidRideException("No driver is available");
        }
    }

    public void saveRides() throws IOException {
        String path = "C:\\New folder\\rides.txt";
        File file = new File(path);
        file.createNewFile();
        FileWriter fw = new FileWriter(file,true);
        BufferedWriter bw = new BufferedWriter(fw);
        for(Ride ride:rides){
            String details = ride.ridedetails();
                bw.write(details);
                bw.newLine();
        }
        fw.flush();
        bw.close();
        fw.close();

    }

    public void loadDriversFromFile() {
        String path = "C:\\DriversList\\list.txt";
        File file = new File(path);
        //FileReader fr = new FileReader(file);
        try (BufferedReader br = new BufferedReader(new FileReader(file))) {
            String line;
            while ((line = br.readLine()) != null) {
                String[] parts = line.split(" ", 2);
                if (parts.length == 2) {
                    String id = parts[0];
                    String name = parts[1];
                    Driver driver = new Driver(id, name);
                    this.registerDriver(driver);
                }
            }
            System.out.println("Drivers loaded");

        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }

    public void saveDriversToFile(){
        String path = "C:\\New folder\\drivers.txt";
        File file = new File(path);

        try (BufferedWriter bw = new BufferedWriter(new FileWriter(file))) {
            file.createNewFile();
            for(Driver driver:drivers){
                bw.write("Id: "+driver.getId()+" Name: "+driver.getName());
                bw.newLine();
            }

        }
        catch (IOException e){
            System.out.println(e.getMessage());
        }
    }

    public void showAllDrivers(){
        for (Driver driver:drivers){
            driver.showProfile();
        }
    }
}
