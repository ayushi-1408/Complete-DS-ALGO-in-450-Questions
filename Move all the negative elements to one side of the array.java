package practice;

import java.util.Arrays;
import java.util.Scanner;

public class Practice1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	Scanner sc= new Scanner (System.in);
	int i;
	int n=sc.nextInt();
		int [] a=new int[n];
		int [] b=new int[n];
		for( i=0;i<n;i++) {
			a[i]= sc.nextInt();
			
		}
		
		
		int j = 0, temp;
        for ( i = 0; i < n; i++) {
            if (a[i] < 0) {
                if (i != j) {
                    temp = a[i];
                    a[i] = a[j];
                    a[j] = temp;
                }
                j++;
            }
        }
		
        for( i = 0; i < n; i++) {
        System.out.println(a[i]);
        }
	}
	

}


