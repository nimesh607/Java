import java.util.*;
import java.io.*;

public class Arrays {
	public static void main(String[] args) {

		Scanner scn = new Scanner(System.in);
		//int N=scn.nextInt();//5
	//	int[] arr= new int[N];
	/*	for(int i=0;i<arr.length;i++)
		{
			arr[i]=scn.nextInt();		
			}
		*/
		
		/*!----------------Q1
		 * //int[] arr= {1,2,3,4,5};
		int[] arr = new int[N];
		for(int i=0;i<N;i++)
		{
			arr[i]=scn.nextInt();
		}
		for(int i =arr.length-1;i>=0;i--)
		{
			System.out.print(arr[i]);
		}*/
	
		/*Q-2 Insertion
		 * int A[]= new int[N];//arr=5;
		for(int i=0;i<N;i++)
		{
			A[i]=scn.nextInt();
		}
		System.out.println("Enter a postion number");
		int X=scn.nextInt();
		System.out.println("Enter element ");
		int Y=scn.nextInt();
		int[] array=new int[N+1];
		for(int i=0;i<X-1;i++)
		{
			array[i]=A[i];
		}
		for(int i=0;i<array.length;i++)
		{
			System.out.println(array[i]);
		}
		
		array[X-1]=Y;
		for(int i=0;i<array.length;i++)
		{
			System.out.println(array[i]);
		}
		//System.out.println(array[X-1]);
		
		for(int i =X;i<array.length;i++)
		{
			array[i]=A[i-1];
		}
		for(int i=0;i<array.length;i++)
		{
			System.out.println(array[i]);
		}
		
		 * */
		
		
		
		// System.out.println(maxElement(arr));
		// System.out.println(minElement(arr));
		//System.out.println(Sum(arr));
		//	outArr(arr,5);
		//System.out.println(search(arr,9));
		//System.out.println(freq(arr,2));
		//System.out.println( sort(arr));
		//System.out.println(consecutiveduplicate(arr));
		//remove(arr,2);
		//Negative(arr);
		
		
		
		
	
	
	
	}
	


static int maxElement(int[] array)
{
	int max=array[0];
	for(int i=1;i<array.length;i++)
	{
		if(array[i]>max)
		{
			max=array[i];
		}
		
		
	}
	return max;
}
	static int minElement(int[] ar)
	{
		int min=ar[0];
		for(int i=1;i<ar.length;i++)
		{
			if(ar[i]<min)
			{
				min=ar[i];
			}
			
		}
		return min;
		
	
}
	
	static int Sum(int[]array)
	{
		int sum=0;
		for(int i=0;i<array.length;i++)
		{
			sum+=array[i];
		}
		return sum;
	}
	
	static void outArr(int[]A,int B)
	{
		int[] res=new int[5];
		for(int i=0;i<A.length;i++)
		{
			res[i]=A[i]+B;
		}
		
		for(int i=0;i<A.length;i++)
		{
			System.out.println(res[i]);
			
		}
		
	}
	static int search(int[] arr,int B)
	{
		for(int i=0;i<arr.length;i++)
		{
			if(B==arr[i])
				return 1;
		}
		return 0;
	}
	static int freq(int[] arr,int B)
	{
		int count=0;
		for(int i=0;i<arr.length;i++)
		{
			if(B==arr[i])
				count++;
		}
		return count;
	}
	static int sort(int[]arr)
	{
		int result=arr[0];
		for(int i =1;i<arr.length;i++)
		{
			if(result<=arr[i])
				result=arr[i];
			else
			{
				return 0;
			}
		}
		return 1;
		
	}
	static boolean consecutiveduplicate(int[]arr)
	{
		int result=arr[0];
		for(int i =1;i<arr.length;i++)
		{
			
			
			if(result==arr[i])
			{
				return true  ;
			}
			else {
				result=arr[i];
			}
				
				
			
		}	
		return false;
	}
	static void remove(int[]arr,int pos)
	{
		int[]newarr=new int[arr.length-1];
		for(int i =0;i<pos-1;i++)
		{
			newarr[i]=arr[i];
		}
		for(int i=pos;i<arr.length;i++)
		{
			newarr[i-1]=arr[i];
		}
		for(int i=0;i<newarr.length;i++)
		{
			System.out.println(newarr[i]);
		}
	}
	static void Negative(int[]arr)
	{
		//int[] array=new int[arr.length];
		for(int i =0;i<arr.length;i++)
		{
			if(arr[i]<0)
			{
				//array[i]=arr[i];
				System.out.println(arr[i]);
				
			}
			
		}
		/*for(int i=0;i<array.length;i++)
		{
			System.out.println(array[i]);
		}*/
	}
	
	
}


