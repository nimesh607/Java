package com.twoDArrays;

public class Addition {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			
			int N=3;
			int M=3;
			int[][] mat1= {{1,2,3},
							{4,5,6},
							{7,8,9}
							};
			int[][] mat2= {
					{1,2,3},
					{4,5,6},
					{7,8,9}
					
			};
			int[][] result= new int[mat1.length][mat2.length];
			//int[][] mat1=new mat[N][M];
			//int[][] mat2= new mat[N][M];
			for(int i=0;i<mat1.length;i++)
			{
				for(int j=0;j<mat1[i].length;j++)
				{
					result[i][j]=mat1[i][j] + mat2[i][j];
				}
			}
			for(int i=0;i<result.length;i++)
			{
				for(int j=0;j<result.length;j++) {
					System.out.print(result[i][j]+ " ");
				}
				System.out.println(" ");
				
			}
	}

}
