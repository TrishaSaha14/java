package genericsTask;

public class Driver {
    public static void main(String[] args) {
        Flight economy = new Flight("A123");

        Passenger pass = new Passenger("John");
        economy.addPassenger(pass);
        //economy.addPassenger(new Passenger("Trisha"));

        Flight vip = new Flight("B456");
        VipPassenger vpass = new VipPassenger("Alice");
        vip.addPassenger(vpass);
        //vip.addPassenger(new VipPassenger("Shreyanshi"));

        System.out.println("List of economy passengers are: ");
        economy.showPassengers();
        System.out.println("List of vip passengers are: ");
        vip.showPassengers();
    }
}
