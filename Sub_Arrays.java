package Array;
import java.util.*;
public class Sub_Arrays {
	public static void main(String[] args) {
	    int[] a={1,2,0,1};
	    int[] b={0,1,0,0,0,0,0,1,1};
	    SubArray(a);
	/*    SubArray(a,3);
	    System.out.println();
	    kdistinct(a, 4);
	    System.out.println();
		maxLength(b);*/
	}
/*	public static int[] convertToArray(ArrayList<Integer> list){
	    int[] a=new int[list.size()];
	    for(int i=0;i<list.size();i++){
	        a[i]=list.get(i);
	    }
	    return a;
	}*/
	public static int distinctElement(int[] arr){
	    Arrays.sort(arr);
	    int count=0;
	    for(int i=0;i<arr.length-1;i++){
	        if(arr[i]!=arr[i+1]){
	           count++;
	        }
	    }
	    return count+1;
	}
	public static void SubArray(int[] a){
	    for(int i=0;i<a.length;i++)
	    {
	        for(int j=i;j<a.length;j++)
	        {
	           for(int k=i;k<=j;k++)
	           {
	             System.out.print(a[k]+" ");
	           }
	           System.out.println();
	        }
	    }
	}
/*	public static void SubArray(int[] a, int sum){
	    int count=0;
	    for(int i=0;i<a.length;i++)
	    {
	        for(int j=i;j<a.length;j++)
	        {
	            int s=0;
	           for(int k=i;k<=j;k++)
	           {
	               s+=a[k];
	           }
	           if(s==sum)
	           count++;
	        }
	    }
	    System.out.print(count);
	}*/
	public static void SubArray(int[] a, int sum){
	    for(int i=0;i<a.length;i++)
	    {
	        for(int j=i;j<a.length;j++)
	        {
	            int s=0;
	           for(int k=i;k<=j;k++)
	           {
	               s+=a[k];
	           }
	           if(s==sum)
	           System.out.print("{"+i+","+j+"} ");	           
	        }
	    }
	}
	public static void kdistinct(int[] a, int k){
	    int[] b=new int[k];
	    for(int i=0;i<((a.length-k)+1);i++){
	        int l=0;
	        for(int j=i;j<k+i;j++){
	            b[l++]=a[j];
	        }
	        int count=distinctElement(b);
	        System.out.print(count+" ");
	    }
	}
	public static void maxLength(int[] a){
	    int max=0;
	    int n=a.length;
	    for(int i=0;i<n;i++)
	    {
	        if(a[i]==0)
	        a[i]=-1;
	    }
	    for(int i=0;i<n;i++){
	        int sum=0;
	        for(int j=i;j<n;j++){
	            sum+=a[j];
	            if(sum==0){
	                max=(max>(j-i+1))?max:(j-i+1);
	            }
	        }
	    }
	    System.out.print(max);
	}
}
