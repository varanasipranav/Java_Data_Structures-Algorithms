package Arrays;

import java.util.Scanner;

public class Remove_dupilcate_from_sorted_array_naive {
	public static void main(String args[]) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int[] arr=new int[n];
		for(int i=0;i<n;i++) {
			arr[i]=sc.nextInt();
			
		}
		int[] temp=new int[n];
		int result=1;
		temp[0]=arr[0];
		for(int i=1;i<arr.length;i++) {
			if(temp[result-1]!=arr[i]) {
				temp[result]=arr[i];
				result++;
			}
		}
		for(int i=0;i<result;i++) {
			arr[i]=temp[i];
			System.out.println(temp[i]);
		}
		
		System.out.println(result);
	}

}
