package loop;
import java.util.Scanner;

public class Armstrong {
	
	public static int countDigit(int num) {
		int count=0;
		int temp = num;
		while(temp>0) {
			count++;
			temp=temp/10;
		}
		return count;
	}
	public static void armstrong(int num) {
		int count = countDigit(num);
		double pow;
		int n = num;
		int rem = 0;
		double sum = 0;
		while(n>0) {
			rem = n%10;
			pow = Math.pow(rem,count);
			sum = sum + pow;
			n=n/10;
		}
		
		if(sum==num) {
			System.out.println("Is an Armstrong number");
		}
		else {
			System.out.println("Not an Armstrong number");
		}
	}
	
	
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number: ");
		int num = sc.nextInt();
		armstrong(num);
	}
}
