package abstractionTask;

import java.util.Scanner;

public class Driver {
	public static void main(String[] args) {
//		Payment p = new CreditCardPayment(600,"TXN12345");
//		p.processPayment();
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter 1 for Credit Card Payment \nEnter 2 for PayPal Payment \nEnter 3 to exit");
		int choice=scan.nextInt();
		
		switch(choice) {
			case 1:
				
				System.out.println("Enter amount: ");
				double am = scan.nextDouble();
				scan.nextLine();
				System.out.println("Enter transId: ");
				String ti = scan.nextLine();
				Payment p = new CreditCardPayment(am,ti);
				p.processPayment();
				break;
				
			case 2:
				System.out.println("Enter amount: ");
				double am2 = scan.nextDouble();
				System.out.println("Enter transId: ");
				scan.nextLine();
				String ti2 = scan.nextLine();
				Payment pay = new PayPalPayment(am2,ti2);
				pay.processPayment();
				break;
				
			default:
				System.out.println("Invalid Choice!");
				break;
		}
	}
}
