package regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class EmailValidation {
	public static void main(String[] args) {
		String regex = "^[a-zA-Z0-9._%+-]+@[a-zA-Z0-9.-]+\\.[a-zA-z]{2,6}$";
		
		String mail = "rohit.jay+@gmail.com";
		
		Pattern pattern = Pattern.compile(regex);
		Matcher matcher = pattern.matcher(mail);
		
		if(matcher.find()) {
			System.out.println(matcher.group()+"  "+matcher.start());
		}
		else {
			System.out.println("Match not found");
		}
	}
}
