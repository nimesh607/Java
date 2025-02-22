package com.twoDArrays;
import java.util.*;

public class Column {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			Scanner sc=new Scanner(System.in);
			int[][] arr= new int[3][3];
			//int sum=0;
			for(int row=0;row<arr.length;row++)
			{
				for(int col=0;col<arr[row].length;col++)
				{
					arr[row][col]=sc.nextInt();
				}
			}
			for(int i=0;i<arr.length;i++)
			{
			int sum=0;
			int j=0;
					for( j=0;j<arr.length;j++)
					{
						
						sum+=arr[i][j];
					}
				
				
					System.out.println(sum);
			}
			
			
		}
	
	}
