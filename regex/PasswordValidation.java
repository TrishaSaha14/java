package regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PasswordValidation {
	public static boolean isValidPass(String password) {
		String regex = "^(?=.*[0-9])(?=.*[a-z])(?=.*[A-Z])(?=.*[@#$%^&+=!])(?=\\S+$).{8,20}$";
		
		Pattern pattern = Pattern.compile(regex);
		Matcher matcher = pattern.matcher(password);
		
		return matcher.matches();
	}
	
	public static void main(String[] args) {
		String pass1 = "Strong@123";
		String pass2 = "Weakpass";
		
		System.out.println("Pass1 valid? "+isValidPass(pass1));
		System.out.println("Pass2 valid? "+isValidPass(pass2));
	}
}
