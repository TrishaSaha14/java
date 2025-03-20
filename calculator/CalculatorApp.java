package calculator;
import java.util.Scanner;

public class CalculatorApp {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Welcome to Calculator App "); 
		int ans1;
		do{
			System.out.println("Enter add for addition \nEnter subtract for subtraction \nEnter multiply for multiplication \nEnter divide for division\n");
			String input = sc.next();
			switch(input) {
				case "add":
					Calculator.addMenu();
					break;
				case "subtract":
					Calculator.subtractMenu();
					break;
				case "multiply":
					Calculator.multiplyMenu();
					break;
				case "divide":
					Calculator.divisionMenu();
					break;
				default:
					System.out.println("Enter a valid input!");
			}
			System.out.println("Do you want to calculate again? answer in 1 for Yes or 0 for No: ");
			ans1 = sc.nextInt();
		}while(ans1 != 0);
		
		System.out.println("Thank you for using Calculator App");
	}
}
