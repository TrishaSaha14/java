package manytoone;

public class Customer {
	
	int id;
	String customerName;
	Bank bank;
	
	public Customer(int id,String name,Bank bank) {
		this.id = id;
		this.customerName = name;
		this.bank = bank;
	}
	
	public void display() {
		System.out.println(this.id+" "+this.customerName+" "+this.bank.bankName);
	}
}