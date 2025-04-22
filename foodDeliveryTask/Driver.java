package foodDeliveryTask;

public class Driver {
    public static void main(String[] args) {
        Restaurant r1 = new Restaurant("Aminia");
        r1.addMenu("Fish Fry");
        r1.addMenu("Mutton Biryani");
        r1.addMenu("Chicken Biryani");
        r1.addMenu("Chicken Chap");
        r1.addMenu("Ice-cream");
        r1.addMenu("Cold Drinks");

        r1.displayMenu();

        Customer cust1 = new Customer(r1,"Trisha",4455);
        cust1.loggin("Trisha",4455);
        cust1.placeOrder("Fish Fry");
        //cust1.placeOrder("Chicken lollipop");  //throws itemNotFoundException
        cust1.placeOrder("Mutton Biryani");
        cust1.placeOrder("Chicken Chap");
        cust1.placeOrder("Ice-cream");
        cust1.placeOrder("Cold Drinks");
        //cust1.placeOrder("Chicken Biryani");  //throws OrderLimitEcxceedException



    }
}
