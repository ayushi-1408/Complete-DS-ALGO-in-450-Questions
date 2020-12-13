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
		
		int temp;
		for(int i=0;i<=arr.length-1;i++){

			   for(int j=0;j<arr.length-1;j++){

			       if(arr[j] > arr[j+1]){   // use < for Descending order

			           temp = arr[j+1];
			           

			            arr[j+1] = arr[j];

			            arr[j]=temp;

			        }

			     }
			   System.out.println(arr[i]);
	
	}
		

}
	}
