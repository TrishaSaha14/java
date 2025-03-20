package array;
//import java.util.Arrays;
import java.util.Scanner;

public class BinarySearch {
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
	public static int binarySearch(int[] arr,int target) {
		int start = 0;
		int end = arr.length-1;
		
		while(start<=end) {
			int mid = (start+end)/2;
			if(arr[mid]==target) {
				return mid;
				
			}
			else if(target > arr[mid]) {
				start = mid + 1;
			}
			else if(target < arr[mid]) {
				end = mid - 1;
			}
			
		}
		return -1;
	}
	
	public static void main(String[] args) {
//		int[] arr = {1,4,45,67,78};
//		int target = 45;
//		System.out.println(Arrays.binarySearch(arr, target));
//		
//		for(int i:Arrays.copyOfRange(arr,0,3)) {
//			System.out.println(i);
		int[] arr = input();
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the target: ");
		int target = s.nextInt();
		System.out.println(binarySearch(arr,target));
	}
}
