package Array;
import java.util.*;
public class prime_number_sieve_method {
	public static void main(String[] args) {
	    Scanner sc=new Scanner(System.in);
	    System.out.print("enter a no. = ");
	    int N=sc.nextInt();
	    boolean[] A=new boolean[N+1];
		isPrime(A,N);
	}
	public static void isPrime(boolean[] a, int N)
	{
	    for(int i=2;i*i<N+1;i++)
	    {
	        if(a[i]==false)
	        {
	            for(int j=i;i*j<N+1;j++)
	            {
	                a[i*j]=true;
	            }
	        }
	    }
	    for(int i=2;i<N+1;i++)
	    {
	        if(a[i]==false)
	        System.out.print(i+" ");
	    }
	}
}
