package variablesAndDatatypes;
import java.util.*;
//import java.lang.*;


public class ArrPalin {
	public static void main(String[] args) {
		
		
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] arr = new int[n];
		for(int i = 0;i<n;i++) {
			arr[i]=sc.nextInt();
		}
		sc.close();
		for(int j=0;j<n;j++) {
			int num = arr[j];
			int sum = 0;
			while(num>0) {
				int rem = num % 10;
				sum = sum*10+rem;
				num = num/10;
			}
			if(sum == arr[j]) {
				System.out.println(arr[j]);
			}
		}
	}

}
