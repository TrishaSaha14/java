package uberRentalManagementTask;

public class Customer extends User{


    public Customer(String id, String name) {
        super(id, name);
    }

    @Override
    void showProfile() {
        System.out.println("The name of the customer is: "+getName());
    }
}
