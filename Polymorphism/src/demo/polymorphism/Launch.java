package demo.polymorphism;

 class Animal{
	public void eat()
	{
		System.out.println("Animals eat method");
	}
	public void sleep()
	{
		System.out.println("Animals sleep method");
	}
	
}
 class Tiger extends Animal {
	public void eat()
	{
		System.out.println("Tiger eats small animals");
	}
	
	public void sleep()
	{
		System.out.println("Tiger sleeps 6-8 hours");
	}
}
 class Monkey extends Animal{
	public void eat()
	{
		System.out.println("MONKEY eats BANANAS");
	}
	
	public void sleep()
	{
		System.out.println("MONKEY sleeps 10 hours");
	}
	
}
 class Deer extends Animal{
	
	public void eat()
	{
		System.out.println("deer eats grass");
	}
	
	public void sleep()
	{
		System.out.println("deer sleeps 5 hours");
	}
	
}
 class Behaviour
 {
	 public void behaviour(Animal p)//Animal p equivalent to  p=t,
	 {
		 p.eat();
		 p.sleep();
	 }
 }

												
public class Launch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Animal a= new Animal();
		Tiger t= new Tiger();
		Monkey m= new Monkey();
		Deer d = new Deer();
		Behaviour b=new Behaviour();
		//------Same method in many forms 1:Many-------
		b.behaviour(t);
		b.behaviour(d);
		b.behaviour(m);
		
		
		
				
	}

}
