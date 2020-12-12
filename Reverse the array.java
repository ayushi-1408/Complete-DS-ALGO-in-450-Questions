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

// If Characters Array

package practice;

import java.util.Scanner;

public class Practice2 {

	public static void main(String[] args) {
		 Scanner s = new Scanner(System.in);
	      System.out.println("First add some characters without spaces and pressing enter");
	      char[] a = s.next().toCharArray();
	      System.out.println("Elements = ");
	      for (int i = 0; i < a.length; i++) 
	         System.out.println(a[i]);
	
	}

}

