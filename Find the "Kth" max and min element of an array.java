package practice;

import java.util.*;

public class Practice2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the n ");
		int n = sc.nextInt();
		int arr[]=new int[n];
	       System.out.println("Enter elements in array");
	       
		 for(int i=0;i<n;i++)
	       {
	         arr[i]=sc.nextInt();
	         
	       }
		 Arrays.sort(arr);
		 System.out.println("Enter The value of k");
		 int k= sc.nextInt();
		 System.out.println("The element at kth level is");
		System.out.println(arr[k]);
		
	
	}

}
