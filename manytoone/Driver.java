package manytoone;

public class Driver {
	public static void main(String[] args) {
		
		Bank bank = new Bank("CBI");
		
		Customer c1 = new Customer(1,"Raj",bank);
		Customer c2 = new Customer(2,"Rai",bank);
		Customer c3 = new Customer(3,"Rahul",bank);
		
		c1.display();
		c2.display();
		c3.display();
		
	}
}
