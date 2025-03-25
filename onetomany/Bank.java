package onetomany;


public class Bank {
	String bankName;
	Customer[] customer;
	static int count = 0;
	
	public Bank(int size,String bankName) {
		this.customer = new Customer[size];
		this.bankName = bankName;
	}
	
	public void addCustomer(Customer c) {
		if(count<customer.length) {
			customer[count++]=c;
			System.out.println("customer added");
		}
		else {
			System.out.println("Cannot add customers, the array is full");
		}
	}
	
	public void displayCustomer() {
		for(int i=0;i<count;i++) {
			System.out.println(customer[i].name);
		}
	}
}
