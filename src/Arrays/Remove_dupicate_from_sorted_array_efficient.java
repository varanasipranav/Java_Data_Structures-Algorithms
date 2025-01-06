package Arrays;

import java.util.Scanner;

public class Remove_dupicate_from_sorted_array_efficient {
	public static void main(String args[]) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int[] arr=new int[n];
		for(int i=0;i<n;i++) {
			arr[i]=sc.nextInt();
			
		}
		int result=1;
		for(int i=0;i<arr.length;i++) {
		if(arr[result]!=arr[i]) {
			arr[result]=arr[i];
			result++;
			
		}
		
		}
		for(int i=0;i<arr.length;i++) {
		System.out.println(arr[i]);
		
		}
		System.out.println("the size of the new non duplicate array"+result);
	}
	

}
