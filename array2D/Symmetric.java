package array2D;

import java.util.Arrays;
import java.util.Scanner;

public class Symmetric {
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
	public static void symm(int[][] arr) {
		int[][] arr1= new int[arr.length][arr[0].length];
		for(int i = 0;i<arr.length;i++) {			
			for(int j = 0;j<arr[i].length;j++) {
				arr1[i][j]=arr[j][i];			
			}
			
		}
		if(Arrays.deepEquals(arr,arr1)){
			System.out.println("Symmetric");
		}
		else {
			System.out.println("Not Symmetric");
		}
	}
//	public static void symm(int[][] arr) {
//		boolean flag = true;
//		for(int i = 0;i<arr.length;i++) {			
//			
//			for(int j = 0;j<arr[i].length;j++) {
//				if(arr[i][j]!=arr[j][i]) {
//					flag=false;
//					break;
//				}
//		}
//			if(!flag) {
//				break;
//			}
//		}
//		if(flag) {
//			System.out.println("Symmetric");
//		}
//		else {
//			System.out.println("Not Symmetric");
//		}
//	}
	
	public static void main(String[] args) {
		int[][] arr=input();
		symm(arr);
	}
}
