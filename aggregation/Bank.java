package aggregation;

public class Bank {
	String bankName;
	Customer c;
	public Bank(String bankName, Customer c) {
		this.bankName = bankName;
		this.c=c;
		
	}
	public void display() {
		System.out.println(this.bankName+"\n"+this.c.name);
	}
}
