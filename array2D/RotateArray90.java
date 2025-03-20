package array2D;

import java.util.Arrays;
import java.util.Scanner;

public class RotateArray90 {
	public static int[][] input(){
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
		
		return arr;
	}
	public static void trans(int[][] arr) {
		int[][] arr1= new int[arr.length][arr[0].length];
		for(int i = 0;i<arr.length;i++) {			
			for(int j = 0;j<arr[i].length;j++) {
				arr1[i][j]=arr[j][i];			
			}
			
		}
		
		int[][] arr2= new int[arr.length][arr[0].length];
		for(int i = 0;i<arr.length;i++) {			
			for(int j = 0;j<arr[i].length;j++) {
				arr2[i][j]=arr1[i][arr.length-1-j];			
			}
			
		}
		
		System.out.println("Rotated Array is: ");
		System.out.println(Arrays.deepToString(arr2));
	}
	public static void main(String[] args) {
		int[][] arr = input();
		trans(arr);
	}
}
