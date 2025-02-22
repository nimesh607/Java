
public class Nokia2 extends Nokia1 {
	
	int z;
	public Nokia2()
	{
		super(5,10);//super is used to access parents private members by child 					class.We can pass arguments to super method.if we don't want to 					pass then just write suer keyword. 
		System.out.println("child constructor executed");//Compiler will automatically 															write super() by default
	}
	
	void f3()
	{
		System.out.println("Child function 1 executed.");
	}
}
 