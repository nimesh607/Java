package demo.polymorphism;

class fighter
{
	public fighter()
	{
		System.out.println("fighter constructor");
	}
	
}
class Rafale extends fighter
{
	
}
class Plane
{
	protected fighter fly()//
	{
		System.out.println("Plane is flying");
		fighter f=new fighter();
		return f;
	}
}

class CargoPlane extends Plane
{
	 public Rafale fly()
	{
		System.out.println("Cargo plane flies at lower height");
		Rafale r=new Rafale();
		return r;
	}
}


public class Launch1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Plane p =new Plane();
		System.out.println(p.fly());
		

	}

}
