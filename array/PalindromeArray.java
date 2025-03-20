package array;
import java.util.Scanner;

public class PalindromeArray {
	public static int[] input(){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of an array: ");
		int n = sc.nextInt();
		int[] arr = new int[n];
		System.out.println("Enter the elements in an array: ");
		for(int i=0;i<n;i++) {
			arr[i]=sc.nextInt();
		}
		return arr;
	}
	
	public static void isPal(int[] arr) {
		for(int j=0;j<arr.length;j++) {
			int num = arr[j];
			int sum = 0;
			while(num>0) {
				int rem = num % 10;
				sum = sum*10+rem;
				num = num/10;
			}
			if(sum == arr[j]) {
				System.out.println(arr[j] + " is Palindrome");
			}
		}
	}
	
	public static void main(String[] args) {
		int[] arr = input();
		isPal(arr);
		
	}
	
}
