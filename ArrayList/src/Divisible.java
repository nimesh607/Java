import java.util.*;

//Write a program that returns the list of elements that are present in the given list and are divisible by 5 and 7.
public class Divisible {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn=new Scanner(System.in);
		int N=scn.nextInt();
		ArrayList<Integer> arr=new ArrayList<>(N);
		for(int i =0;i<N;i++)
		{
			arr.add(scn.nextInt());
		}
	for(int i=0;i<N;i++)
		{
			if(arr.get(i)%5==0 && arr.get(i)%7==0)
			{
				System.out.println(arr.get(i));
			}
			
		}
		
		
	}

	
}
