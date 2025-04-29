package uberRentalManagementTask;

public class Ride {
    private Customer customer;
    private Driver driver;
    private String status;

    public Driver getDriver() {
        return driver;
    }

    public Ride(Customer customer, Driver driver){
        this.customer=customer;
        this.driver=driver;
        this.status="Booked";
    }

    public Customer getCustomer() {
        return customer;
    }

    public void completeRide(){
        this.status="Completed";
        driver.setAvailable(true);
    }

    public String getStatus(){
        return status;
    }

    public String ridedetails(){
        return "Customer name: "+customer.getName()+" Driver name: "+driver.getName()+" Current status: "+status;
    }

}
