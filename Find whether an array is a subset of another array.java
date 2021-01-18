/*package whatever //do not write package name here */

import java.util.*;
import java.lang.*;
import java.io.*;

class GFG {
	public static void main (String[] args) {
	Scanner sc= new Scanner(System.in);
	int t= sc.nextInt();
	while(t-- >0){
    int i,j;
    int c=0;
	    int m= sc.nextInt();
	    int n= sc.nextInt();
	    int a[]= new int[m];
	    int b[]= new int[n];
	    for( i=0;i<m;i++){
	        a[i]= sc.nextInt();
	    }
	    for( i=0;i<n;i++){
	        b[i]= sc.nextInt();
	    }
	    for( i=0;i<m;i++){
	        for(j=0;j<n;j++){
	            if(b[j] ==a[i] )
	            {
	                c++;
	            }
	        }
	    }
	    if(c== n){
	        System.out.println("Yes");
	    }
	    else{
	        System.out.println("No");
	    }
	}
	}
}
