package Arrays;

import java.util.Scanner;

public class Leaders_in_an_Array_Efficient {
	public static void main(String args[]) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int[] arr=new int[n];
		for(int i=0;i<n;i++) {
			arr[i]=sc.nextInt();
			
		}
		int curr_leader=arr[n-1];
		for(int i=n-1;i>=0;i++ ) {
			if(curr_leader<arr[i]) {
				System.out.println(arr[i]);
				curr_leader=arr[i];
			}
		}
		
	}

}
