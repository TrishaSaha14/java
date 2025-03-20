package methods;
import java.util.*;

public class Methods {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] arr = new int[n];
		for(int j=0;j<5;j++) {
			arr[j]=sc.nextInt();
		}
		int key = sc.nextInt();
		search(arr,key);
		
	}
	public static void search(int arr[], int key) {
		int count = 0;
		for(int i=0;i<arr.length;i++) {
			
			if(arr[i]==key) {
				System.out.println("Found key");
				count = 1;
			}
			
						
		}
		
		if(count==0) {
			System.out.println("Not found key");
		}
	}
}
