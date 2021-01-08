package practice;

import java.util.Scanner;

public class Practice1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	Scanner sc= new Scanner (System.in);
	int i;
	
	
	System.out.println("enter size of array 1");
	int m=sc.nextInt();
		int [] a=new int[m];
		
		
		System.out.println("enter array 1");
		for( i=0;i<m;i++) {
			a[i]= sc.nextInt();
			
		}
		int temp= a[m-1];
		 for (i = m -1; i > 0; i--) {
		        a[i] = a[i-1]; 
		   
		    } 
		 a[0] = temp; 
		
		
		for( i=0;i<m;i++) {
		System.out.println(	a[i]);
			
		}
		
	
		
		
		
	    } 
		
		
		
       }
		
	
	




