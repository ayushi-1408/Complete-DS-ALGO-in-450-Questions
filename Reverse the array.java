package practice;

import java.util.Scanner;

public class Practice2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the rating ");
		int n = sc.nextInt();
		int i,j;
		int[] a= new int[n];
		for(i=0; i<n;i++ ) {
			a[i]= sc.nextInt();
			
		}
		for(i=n-1; i>=0;i--)
		{
		System.out.println(a[i]); 
		}
	
	}

}
