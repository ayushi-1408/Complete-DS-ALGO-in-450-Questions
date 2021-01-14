
import java.util.*;
import java.lang.*;
import java.io.*;
import java.math.BigInteger;

class GFG 
{
    static BigInteger factorial(int n)
    {
        BigInteger f;
        f = BigInteger.valueOf(1);
        for(int i=2;i<=n;i++)
        {
            f = f.multiply(BigInteger.valueOf(i));
        }
        return f;
    }
	public static void main (String[] args) 
	{
         int n,t;
         Scanner s = new Scanner(System.in);
         t = s.nextInt();
         for(int i=0;i<t;i++)
         {
             n = s.nextInt();
             System.out.println(factorial(n));
         }
	}
}
