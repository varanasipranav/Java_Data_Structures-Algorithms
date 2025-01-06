package Arrays;

import java.util.Scanner;

public class Arrange_Zeros_To_The_LeftEnd {
	public static void main(String args[]) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int[] arr=new int[n];
		for(int i=0;i<n;i++) {
			arr[i]=sc.nextInt();
			
		}
		for(int i=0;i<arr.length;i++) {
			if(arr[i]==0) {
				for(int j=0;j<i;j++) {
					if(arr[j]!=0) {
						int temp=arr[j];
						arr[j]=arr[i];
						arr[i]=temp;
					}
				}
			}
		}
		for(int i=0;i<arr.length;i++) {
			System.out.println(arr[i]);
		}
	}



}
