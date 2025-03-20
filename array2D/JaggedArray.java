package array2D;
import java.util.Arrays;
import java.util.Scanner;

public class JaggedArray {
	public static int[][] createJagged(){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter rows: ");
		int r = sc.nextInt();
		int[][] arr = new int[r][];
		for(int i=0;i<r;i++) {
			System.out.println("Enter col" + i);
			int col = sc.nextInt();
			arr[i] = new int[col];
			for(int j=0;j<col;j++) {
				arr[i][j] = sc.nextInt();
			}
		}
		
		return arr;
	}
	
	public static void print(int[][] arr) {
		System.out.println(Arrays.deepToString(arr));
	}
	
	public static void main(String[] args) {
		int[][] arr = createJagged();
		print(arr);
		}
}
