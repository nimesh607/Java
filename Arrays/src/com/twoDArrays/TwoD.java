package com.twoDArrays;

import java.util.Scanner;

public class TwoD {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		int N=scn.nextInt();
		int M=scn.nextInt();
		int[][] arr=new int[N][M];
		for(int row=0;row<arr.length;row++)
		{
			for (int col=0;col<arr[row].length;col++)
			{
				arr[row][col]=scn.nextInt();
			}
			
		}
		for(int row=0;row<arr.length;row++)
		{
			for (int col=0;col<arr[row].length;col++)
			{
				System.out.print(arr[row][col]+" ");
				
			}
			System.out.println();
		}
	}

}
