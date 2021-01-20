

import java.util.*;
import java.lang.*;
import java.io.*;

class GFG {
	public static void main (String[] args) {
		  Scanner sc = new Scanner(System.in);

int t= sc.nextInt();
int min;
while(t-- >0){
    int n=  sc.nextInt();
    int a[]= new int[n];
    for(int i=0;i<n;i++){
        a[i]=sc.nextInt();
        
    }
    int m=  sc.nextInt();
    
           Arrays.sort(a);
            
         min = Integer.MAX_VALUE;
           for(int i=0;i+m-1<n;i++){
               int diff= a[i+m-1]- a[i];
               min =Math.min(min ,diff);
           }
          System.out.println(min);
           
}
	}
}
