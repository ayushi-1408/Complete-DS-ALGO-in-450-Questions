package practice;

import java.util.Scanner;

public class Practice2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the n ");
		int n = sc.nextInt();
		int arr[]=new int[n];
	       System.out.println("Enter elements in array");
	       int min=Integer.MAX_VALUE;
	       int max=Integer.MIN_VALUE;
		 for(int i=0;i<n;i++)
	       {
	         arr[i]=sc.nextInt();
	         if(arr[i]<min)
	           {
	           min=arr[i];
	           }
	         if(arr[i]>max)
	         {
	           max=arr[i];
	         }
	       }
		System.out.println(min + " "+max);
		
	
	}

}
