package uberRentalManagementTask;

import java.io.IOException;
import java.util.Optional;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        RideBookingSystem rbs = new RideBookingSystem();
        rbs.loadDriversFromFile();
        boolean flag = true;
        while(flag){
            System.out.println("Enter 1 to register a customer.\nEnter 2 to register a driver.\nEnter 3 to book a ride.\nEnter 4 to show all Drivers.\nEnter 5 to save data and Exit.\nEnter 6 to exit.");
            int choice = sc.nextInt();
            switch (choice){
                case 1:
                    sc.nextLine();
                    System.out.println("Enter customer id: ");
                    String id = sc.nextLine();
                    System.out.println("Enter customer name: ");
                    String name = sc.nextLine();
                    Customer customer = new Customer(id,name);
                    rbs.registerCustomer(customer);
                    break;
                case 2:
                    sc.nextLine();
                    System.out.println("Enter driver id: ");
                    String id1 = sc.nextLine();
                    System.out.println("Enter driver name: ");
                    String name1 = sc.nextLine();
                    Driver driver = new Driver(id1,name1);
                    rbs.registerDriver(driver);
                    break;
                case 3:
                    sc.nextLine();
                    System.out.println("Enter customer id: ");
                    String id3 = sc.nextLine();
                    Optional<Customer> customer1 = rbs.customers.stream().filter(n -> n.id.equals(id3)).findFirst();
                    if(customer1.isPresent()){
                        Customer customer2 = customer1.get();
                        rbs.bookRide(customer2);
                        break;
                    }
                    else{
                        System.out.println("Invalid customer Id is entered");
                        break;
                    }

                case 4:
                    rbs.showAllDrivers();
                    break;
                case 5:
                    rbs.saveDriversToFile();
                    try{
                        rbs.saveRides();
                    }
                    catch (IOException e){
                        System.out.println(e.getMessage());
                    }
                    flag = false;
                    break;

                default:
                    System.out.println("Invalid choice");
            }
        }
    }
}
