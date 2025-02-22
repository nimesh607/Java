
public class Thismethod {
	private int age;
	private String name;
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}

	
	
	public Thismethod()
	{
		this(10,"Telusko");
		System.out.println("inside default constructor : "+getAge());
		System.out.println("inside default constructor : "+getName());
		
	}
	public Thismethod(int age,String name)
	{
		this.age=age;
		this.name=name;
		System.out.println("inside parameterised constructor : "+getAge());
		System.out.println("inside parameterised constructor : "+getName());
	}
	public Thismethod(int age)
	{
		this();
		this.age=age;
		System.out.println("inside parameterised constructor Only age : "+getAge());
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Thismethod d=new Thismethod(10);
		//Thismethod d=new Thismethod();//without parameter
		
			
	}

}
