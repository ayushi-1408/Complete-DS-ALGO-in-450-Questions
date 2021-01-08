package practice;

import java.util.Arrays;
import java.util.Scanner;

public class Practice1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	Scanner sc= new Scanner (System.in);
	int i;
	
	
	System.out.println("enter size of array 1");
	int m=sc.nextInt();
		int [] a=new int[m];
		System.out.println("enter size of array 2");
		int n=sc.nextInt();
		int [] b=new int[n];
		System.out.println("enter array 1");
		for( i=0;i<m;i++) {
			a[i]= sc.nextInt();
			
		}
		System.out.println("enter array 2");
		for( i=0;i<n;i++) {
			b[i]= sc.nextInt();
			
		}
		Arrays.sort(a);
		Arrays.sort(b);
		System.out.println("Union is ");
		int j=0,k=0;
    // union of two sorted Arrays
		 while (k < m && j < n) 
	      { 
	        if (a[k] < b[j]) 
	          System.out.print(a[k++]+" "); 
	        else if (b[j] < a[k]) 
	          System.out.print(b[j++]+" "); 
	        else
	        { 
	          System.out.print(b[j++]+" "); 
	          k++; 
	        } 
	      } 
	       
	      /* Print remaining elements of  
	         the larger array */
	      while(k < m) 
	       System.out.print(a[k++]+" "); 
	      while(j < n) 
	       System.out.print(b[j++]+" "); 
	         
	         
	    } 
		
		
		
       }
		
	
	




