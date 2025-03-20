package loop;

import java.util.Scanner;

public class Prime {
	public static void prime(int n) {
		int count = 0;
		for(int i=2;i<n;i++) {
			if(n%i==0) {
				count++;
			}
				
		}
		if(count==0) {
			System.out.println("Is a Prime number");
		}
		else {
			System.out.println("Not a Prime number");
		}
	}
	
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number:");
		int n = sc.nextInt();
		prime(n);
	}
}
