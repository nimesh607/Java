
public class Array {

	public static void main(String[] args) {
		
		// TODO Auto-generated method stub
		int[] A= new int[7];
		A[0]=  70;
		A[1] = 10;
	    A[2] = 800;
	    A[3] = 1;
	    A[4] = 2;
	    A[5]=15;
	    A[6]=20;

	  
		solve(A);
		
	}
	
	public static int solve(int[] A) {
		 int max=A[0];
		 int min=A[0];
        for(int i =1;i<A.length;i++)
        {
            
            if(A[i]>max)
            {
                max=A[i];
            }
            if(A[i]<min)
            {
            	min=A[i];
            }
            
           
        }
        int sum=max+min;
        System.out.println(sum);
        return sum;

}
}
