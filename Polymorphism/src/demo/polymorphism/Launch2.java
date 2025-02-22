package demo.polymorphism;

class Telusko{
	public static  void disp()
	{
		System.out.println("Telusko  is human");
	}
}

class Alien extends Telusko{
	
	
	

	public static void disp()
	{
	
		System.out.println("Alien is telusko");
	}
	
}
public class Launch2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Alien a = new Alien();
		a.disp();//Alien is telusko
		Telusko t = new Alien();/*Note:=ths concept is called upcasting
										1)t is only rv we do not create object of telusko .it's just an rv who is pointing towards 											alien object
										2)Actually,static method of telusko is inheriting in alien .So from this we conclude that 											static method does inherit.	
										3)Static method does not overrides after inherit.
										4)if it does than it is called "Method hiding"
											*/
		
		t.disp();
		
	}

}
