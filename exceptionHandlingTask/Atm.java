package exceptionHandlingTask;

public class Atm {
	
	private int pin = 4455;
	private double balance=2500;
	
//	public Atm(int pin,double balance) {
//		this.pin=pin;
//		this.balance=balance;
//	}
	
	public void withdraw(int pin,double amount) {  //throws InvalidPinException,InsufficientFundException {
		if(this.pin==pin) {
			if(amount>=balance) {
				throw new InsufficientFundException("The fund is insufficient. Hence, cannot withdraw.");
			}
			else {
				balance -= amount;
				System.out.println("The amount is withdrawn");
			}
			
		}
		else {
			throw new InvalidPinException("The pin is invalid.");
		}
		
	}
	
	public void checkBalance(int pin) {//throws InvalidPinException{
		if(this.pin==pin) {
			System.out.println(balance);
		}
		else {
			throw new InvalidPinException("The pin is invalid.");
		}
	}

}
