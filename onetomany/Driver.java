package onetomany;
import java.util.Scanner;

public class Driver {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter array size: ");
		int size = sc.nextInt();
		
		Bank bank = new Bank(size,"SBI");
		boolean flag = true;
		
		while(flag) {
			
			System.out.println("Enter 1 for adding customer:\nEnter 2 for displaying customers\nEnter 3 to exit");
			int choice = sc.nextInt();
			switch(choice) {
				case 1:
					sc.nextLine();
					System.out.println("Enter customer name: ");
					String cuname = sc.nextLine();
					Customer c = new Customer(cuname);
					bank.addCustomer(c);
					break;
				case 2:
					bank.displayCustomer();
					break;
				case 3:
					flag = false;
					break;
			}
			
		}
	}
}
