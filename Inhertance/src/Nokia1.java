
public class Nokia1 {
	private int x,y;
	public Nokia1(int p,int q)//taaking values from child class contructor by super 								keyword.execute before child constructor
	{
		x=p;
		y=q;
		System.out.println(x+" "+y);
		System.out.println("Parents constructer executed");
	}
	void f1()
	{
		System.out.println("parent function 1 executed.");

	}
	void f2()
	{
		System.out.println("parent function 2 executed.");
	}
}
