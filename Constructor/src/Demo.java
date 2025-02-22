
public class Demo {
	 int x,y;
	private int c;
	
	
	void fun1(int p,int z)
	{
		x=p;
		y=z;
	}
	
	public Demo()//Default Constructor with no actual arguments//explicit definition
	{
		System.out.println("Hello");
	     x=5;
	     y=10;
		
	}
	///defining method add c is private so i made a method getc() to acess c
	public void add(int a,int b)
	{
		
		c=a+b;
		//System.out.println(c);
	}
	public int GetC()
	{
		
		return c;
	}
	
	
	
	//Defining Parametrized constructor
	
	public Demo(int k,int l)
	{
		x=k;
		y=l;
		System.out.println(x+" "+y);
		
	}
	
}
