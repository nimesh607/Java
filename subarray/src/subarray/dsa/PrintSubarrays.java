package subarray.dsa;

public class PrintSubarrays {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Solution solution = new Solution();
		  int[] A = {1,2,3,4,5,6,};
		  int n=A.length;
		  int start=1;
		  int end=4;
		 // System.out.println(solution.smallestSubarraySize(A1));
		  for(int i=A[start];i<A[end];i++)
		  {
			  for(int k=i;k<=A[end];k++)
			  {
				  for(int j=i;j<=k;j++)
				  {
					  System.out.print(j);
				  }
				  System.out.println();
			  }
			
			  System.out.println();
		  }

	}

}
