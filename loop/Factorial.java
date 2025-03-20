package loop;
import java.util.Scanner;

public class Factorial {
	  public static void factorial(int n) {
		  int fact = 1;
		  if(n==0) {
			  System.out.println("Factorial is:");
			  System.out.println(fact);
		  }
		  else {
			  for(int i=n;i>=1;i--) {
				  fact = fact*i;
			  }
			  System.out.println("Factorial is:");
			  System.out.println(fact);
			  
		  }
	  }
	  
	  public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number:");
		int n = sc.nextInt();
		factorial(n);
	}
}