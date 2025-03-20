package dummy;
import java.util.Scanner;

public class $Demo {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		if(a<0) {
			if(a%2==0) {
				System.out.println("Negative Even");
			}
			else {
				System.out.println("Negative Odd");
			}
		}
		else {
			if(a%2==0) {
				System.out.println("Positive Even");
			}
			else {
				System.out.println("Positive Odd");
			}
		}
		
	}
}
	


