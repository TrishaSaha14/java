package exceptionHandlingTask;

public class InsufficientFundException extends RuntimeException {
	//private String message;
//	public InsufficientFundException(String message) {
//		this.message=message;
//	}
	
	public InsufficientFundException(String message) {
		super(message);
	}
	
//	public String getMessage() {
//		return message;
//	}
}
