package array2D;
import java.util.Scanner;
import java.util.Arrays;

public class Array {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter rows: ");
		int row = sc.nextInt();
		System.out.println("Enter columns: ");
		int column = sc.nextInt();
		
		int[][] arr = new int[row][column];
		System.out.print("Enter elements: ");
		for(int i = 0;i<row;i++) {
			for(int j = 0;j<column;j++) {
				arr[i][j] = sc.nextInt();
			}
		}
		System.out.println("Printing the array: ");
//		for(int i = 0;i<row;i++) {
//			for(int j = 0;j<column;j++) {
//				
//				System.out.print( arr[i][j] + " ");
//			}
//			System.out.println("");
//		}
		//System.out.println(Arrays.deepToString(arr));
		
		for(int[] k:arr) {
			for(int l:k) {
				System.out.println(l);
			}
		}
		
	}
}
