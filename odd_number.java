package Array;
import java.util.*;
public class odd_number {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] list=odd_number(50);
		for(int i=0;i<50;i++)
		{
		System.out.println(list[i]);
		}
	}
	public static int[] odd_number(int x)
	{
	    int[] arr=new int[50];
	    int count=0;
	/*	for(int i=1;i<=100;i++)
		{
		    if(i%2!=0)
		    {
		        arr[count]=i;
		        count++;
		    }
		}*/  // OR
		int i=1;
		while(count<50)
		{
		    if(i%2!=0)
		    {
		        arr[count]=i;
		        count++;
		    }
		    i++;
		}
		return arr;
	}
}
