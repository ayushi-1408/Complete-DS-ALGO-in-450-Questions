// { Driver Code Starts
//Initial Template for Java

//Initial Template for Java

import java.util.*;
import java.lang.*;
import java.io.*;

class GFG {
	public static void main(String[] args) throws IOException
	{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine().trim());
        while(t-->0)
        {
            StringTokenizer stt = new StringTokenizer(br.readLine());
            
            long n = Long.parseLong(stt.nextToken());
            long m = Long.parseLong(stt.nextToken());
            // int n = Integer.parseInt(br.readLine().trim());
            long a[] = new long[(int)(n)];
            String inputLine[] = br.readLine().trim().split(" ");
            for (int i = 0; i < n; i++) {
                a[i] = Long.parseLong(inputLine[i]);
            }
            
            Compute obj = new Compute();
            System.out.println(obj.sb(a, n, m));
        }
	}
}

// } Driver Code Ends


//User function Template for Java


class Compute {

    public static long sb(long a[], long n, long x) {
        // Your code goes here 
    long sum=0,min=n+1;
    long start=0,end=0;
    while(end<n){
        while(sum<=x && end<n){
            sum= sum+a[(int)end++];
            while(sum> x && start<n){
                if(end - start < min){
                    min=end-start;
                }
            sum= sum-a[(int)start++];
                
            }
        }
    }
    return min;
    }
}

