package Arrays;

import java.util.Scanner;

public class Rotate_Array_Left_By_one {
	public static void main(String args[]) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int[] arr=new int[n];
		for(int i=0;i<n;i++) {
			arr[i]=sc.nextInt();
			
		}
		int temp=arr[0];
		for(int i=1;i<arr.length;i++) {
			arr[i-1]=arr[i];
			
		}
		arr[n-1]=temp;
		
		for(int i=0;i<arr.length;i++) {
			System.out.print(arr[i]);
		}
	}

}
