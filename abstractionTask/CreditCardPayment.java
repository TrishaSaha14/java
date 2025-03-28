package abstractionTask;

import java.util.Scanner;

public class CreditCardPayment extends Payment{
	

	public CreditCardPayment(double amount, String transactionId) {
		super(amount, transactionId);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void processPayment() {
		// TODO Auto-generated method stub
		double a = super.getAmount();
		double discount = 0.0d;
		if(a>500.00) {
			discount = (0.1)*a;
		}
		System.out.println("Processing Credit card Payment..");
		System.out.println("Original Amount: "+a);
		System.out.println("Transaction ID: "+super.getTransactionId());
		System.out.println("Discount Applied: "+discount);
		
		double fee = 0.02*a;
		System.out.print("Transaction Fee: "+fee);
		
		double payableAmount = (a-discount)+fee;
		System.out.print("\nFinal Payable Amount: ");
		System.out.println(payableAmount);
		System.out.println("Credit Card Payment Successful!");
	}

}
