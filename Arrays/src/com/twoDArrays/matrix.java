package com.twoDArrays;

public class matrix {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] A1 = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
		System.out.println("Output 1:");
        int[][] result1 = getAntiDiagonals(A1);
        for (int[] row : result1) {
            for (int num : row) {
                System.out.print(num + " ");
            }
            System.out.println();
        }

	}
	public class Solution {
	    public int[][] diagonal(int[][] A) {
	    int N = A.length;
	        int[][] result = new int[2 * N - 1][N];

	        for (int i = 0; i < 2 * N - 1; i++) {
	            for (int j = 0; j < N; j++) {
	                result[i][j] = 0;
	            }
	        }

	        for (int i = 0; i < N; i++) {
	            for (int j = 0; j < N; j++) {
	                result[i + j][j] = A[i][j];
	            }
	        }

	        return result;
	    }
	}

}
