package exceptionHandlingTask;

public class Driver {
	public static void main(String[] args) {
		Atm user = new Atm();
//		try {
//			user.withdraw(4455, 3000.00);
//		} catch (InvalidPinException e) {
//			
//			System.out.println(e.getMessage());
//		} catch (InsufficientFundException e) {
//			
//			System.out.println(e.getMessage());
//		}
//		
//		try {
//			user.checkBalance(4455);
//		} catch (InvalidPinException e) {
//			
//			System.out.println(e.getMessage());
//		}
		
		user.withdraw(4455, 500);
		user.checkBalance(3455);
	}
}
