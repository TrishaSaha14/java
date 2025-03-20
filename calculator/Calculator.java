package calculator;
import java.util.Scanner;

public class Calculator {
	
	public static Scanner sc = new Scanner(System.in);
	
	public static void add(double a, double b) {
		System.out.print("Addition of two numbers are ");
		System.out.println(a+b);
	}
	
	public static void add(double a, double b, double c) {
		System.out.print("Addition of three numbers are ");
		System.out.println(a+b+c);
	}
	
	public static void addMenu() {
		
		System.out.println("Enter 1 for adding two no.s\nEnter 2 for adding three no.s");
		int choice = sc.nextInt();
		
		switch(choice) {
			case 1:
				double a = sc.nextDouble();
				double b = sc.nextDouble();
				add(a,b);
				break;
				
			case 2:

				double c = sc.nextDouble();
				double d = sc.nextDouble();
				double e = sc.nextDouble();
				add(c,d,e);
				break;
		}
		
	}
	
	public static void subtract(double a, double b) {
		System.out.print("Subtraction of two numbers are ");
		System.out.println(a-b);
	}
	public static void subtractMenu() {
		System.out.println("Enter two values for subtraction");
		double a = sc.nextDouble();
		double b = sc.nextDouble();
		subtract(a,b);
	}
	
	public static void multiply(double a, double b) {
		System.out.print("Multiplication of two numbers are ");
		System.out.println(a*b);
	}
	
	public static void multiply(double a, double b, double c) {
		System.out.print("Multiplication of three numbers are ");
		System.out.println(a*b*c);
	}
	
	public static void multiplyMenu() {
		System.out.println("Enter 1 for multiplying two no.s\nEnter 2 for multiplying three no.s");
		int choice = sc.nextInt();
		
		switch(choice) {
			case 1:
				double a = sc.nextDouble();
				double b = sc.nextDouble();
				multiply(a,b);
				break;
				
			case 2:
				double c = sc.nextDouble();
				double d = sc.nextDouble();
				double e = sc.nextDouble();
				multiply(c,d,e);
				break;
		}
		
	}
	
	public static void division(double a, double b) {
		if(b==0) {
			System.out.println("Arithmetic exception: Denominator is 0 which is invalid");
		}
		else {
			System.out.print("division of two numbers are ");
			System.out.println(a/b);
		}
		
	}
	public static void divisionMenu() {
		System.out.println("Enter two values for division");
		double a = sc.nextDouble();
		double b = sc.nextDouble();
		division(a,b);
	}

}
