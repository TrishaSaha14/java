package regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PhoneNumberValidation {
	public static void main(String[] args) {
		//String regex = "^[6789]\\d{9}";   
		//String text = "8927616379";
		String regex = "[6789]\\d{9}";
		String text = "8927616379, 9434168544, 6568941237";
		
		Pattern pattern = Pattern.compile(regex);
		Matcher matcher = pattern.matcher(text);
		
		while(matcher.find()) {
			System.out.println(matcher.group()+"  "+matcher.start()+"  "+matcher.end());
		}
		
//		if(matcher.find()) {
//			System.out.println(matcher.group()+"  "+matcher.start()+"  "+matcher.end());
//		}
//		else {
//			System.out.println("Match not found");
//		}
	}
}
