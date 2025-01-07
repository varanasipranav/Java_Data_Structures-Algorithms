package Arrays;

import java.util.Scanner;

public class Rotate_an_array_Left_by_D {
	public static void main(String args[]) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int[] arr=new int[n];
		for(int i=0;i<n;i++) {
			arr[i]=sc.nextInt();
			
		}
		int d=sc.nextInt();
		int[] temp=new int[d];
		
		for(int i=0;i<d;i++) {
			temp[i]=arr[i];
		}
		for(int i=d;i<n;i++) {
			arr[i-d]=arr[i];
			
		}
		for(int i=0;i<d;i++) {
			arr[n-d+i]=temp[i];
		}
		for(int i=0;i<temp.length;i++) {
			System.out.println(temp[i]);
		}
		for(int i=0;i<arr.length;i++) {
			System.out.print(arr[i]);
		}
	}

}
