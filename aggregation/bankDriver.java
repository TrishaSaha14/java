package aggregation;

public class bankDriver {
	public static void main(String[] args) {
		Customer c = new Customer("Trisha");
		Bank b = new Bank("SBI",c);
		b.display();
	}
}
