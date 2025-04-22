package regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegexDemo {
	public static void main(String[] args) {
		String str = "12Hello World\n ,today is _22 \n bye.";
		String regex = ".";
		String regex1 = "[abc]";
		String regex2 = "[^abc]";
		String regex3 = "[a-z\\d]";
		String regex4 = "[\\w\\s]";
		String regex5 = "^12";
		
		String str1 = "adam plucked an apple and gave it to aram";
		String regex6 = "a*";
		String str2 = "the";
		String regex7 = "a+";
		
		String str3 = "aaaa aa aaa aaaaaa";
		String regex9 = "a{3}";
		String regex10 = "a{2,4}";
		
		Pattern pattern = Pattern.compile(regex);
		Matcher matcher = pattern.matcher(str);
		
		while(matcher.find()) {
			System.out.print(matcher.group());
		}
		
		System.out.println();
		Pattern pattern1 = Pattern.compile(regex1);
		Matcher matcher1= pattern1.matcher(str);
		
		while(matcher1.find()) {
			System.out.print(matcher1.group());
		}
		
		System.out.println();
		Pattern pattern2 = Pattern.compile(regex2);
		Matcher matcher2= pattern2.matcher(str);
		
		while(matcher2.find()) {
			System.out.print(matcher2.group());
		}
		
		System.out.println();
		Pattern pattern3 = Pattern.compile(regex3);
		Matcher matcher3= pattern3.matcher(str);
		
		while(matcher3.find()) {
			System.out.print(matcher3.group());
		}
		
		System.out.println();
		Pattern pattern4 = Pattern.compile(regex4);
		Matcher matcher4= pattern4.matcher(str);
		
		while(matcher4.find()) {
			System.out.print(matcher4.group());
		}
		
		System.out.println();
		Pattern pattern5 = Pattern.compile(regex5);
		Matcher matcher5= pattern5.matcher(str);
		
		while(matcher5.find()) {
			System.out.print(matcher5.group());
		}
		
		System.out.println();
		Pattern pattern6 = Pattern.compile(regex6);
		Matcher matcher6= pattern6.matcher(str1);
		
		while(matcher6.find()) {
			System.out.print(matcher6.group());
		}
		
		System.out.println();
		Pattern pattern7 = Pattern.compile(regex6);
		Matcher matcher7= pattern7.matcher(str2);
		
		while(matcher7.find()) {
			System.out.print(matcher7.group());
		}
		
		System.out.println();
		Pattern pattern8 = Pattern.compile(regex7);
		Matcher matcher8= pattern8.matcher(str1);
		
		while(matcher8.find()) {
			System.out.print(matcher8.group());
		}
		
		System.out.println();
		Pattern pattern9 = Pattern.compile(regex9);
		Matcher matcher9= pattern9.matcher(str3);
		
		if(matcher9.find()) {
			System.out.print(matcher9.group());
		}
		
		
		System.out.println();
		Pattern pattern10 = Pattern.compile(regex10);
		Matcher matcher10= pattern10.matcher(str3);
		
		while(matcher10.find()) {
			System.out.print(matcher10.group());
		}
	}
}
