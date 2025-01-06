package Arrays;

import java.util.Scanner;

public class Arrange_Zeros_To_The_RightEnd_Efficient {
	public static void main(String args[]) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int[] arr=new int[n];
		for(int i=0;i<n;i++) {
			arr[i]=sc.nextInt();
			
		}
		int c=0;
		for(int i=0;i<arr.length;i++) {
			if(arr[i]!=0) {
				int temp=arr[c];
				arr[c]=arr[i];
				arr[i]=temp;
				c++;
			}
			
		}
		for(int i=0;i<arr.length;i++) {
			System.out.println(arr[i]);
		}
	}

}
