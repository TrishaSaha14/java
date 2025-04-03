package zeroAtEnd;



import java.util.*;

public class EndZero {
    public static int[] input(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter the array: ");
        for (int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        return arr;
    }
    public static void main(String[] args) {
        int[] arr= input();
        int count1=0;
        int[] arr1 = new int[arr.length];
        int count2=0;
        int[] arr2 = new int[arr.length];
        for(int i=0;i<arr.length;i++){
            if(arr[i]==0){
                arr1[count1++]=arr[i];
            }
            else{
                arr2[count2++]=arr[i];
            }
        }

        for(int j=0;j<count1;j++){
            arr2[count2+j]=arr1[j];
        }

        for(int k=0;k<arr.length;k++){
            arr[k]=arr2[k];
        }

        System.out.println(Arrays.toString(arr));
    }
}
