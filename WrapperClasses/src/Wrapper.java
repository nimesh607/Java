import java.util.*;
public class Wrapper {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/* Wrapper Classes:The wrapper class in Java provides the mechanism to convert primitive into 							object and object into primitive.

Since J2SE 5.0, autoboxing and unboxing feature convert primitives into objects and objects into primitives automatically.
 The automatic conversion of primitive into an object is known as autoboxing and vice-versa unboxing.*/
		
		int x=Integer.parseInt("123");//Converting Integer into int explicitly;
		Integer x1=Integer.valueOf("10111",8);//converting int into Integer
		
		//Converting int into Integer  
		int r=20;  
		Integer d=Integer.valueOf(r);//converting int into Integer explicitly  
		Integer e=r;//autoboxing, now compiler will write Integer.valueOf(a) internally  
		  
		System.out.println(r+" "+e+" "+d);  
			
		@SuppressWarnings("removal")
		Integer a=new Integer(3);    
		int i=a.intValue();//converting Integer to int explicitly  
		int j=a;//unboxing, now compiler will write a.intValue() internally    
		    
		System.out.println(a+" "+i+" "+j);    
		int y=x1.intValue();
		System.out.println(x);
		System.out.println(y);
		
		Double a1=Double.valueOf("56");
		
		
		
		double b=a1.doubleValue();
		System.out.println(b);
		// Autoboxing: Converting a primitive double to a Double object
        Double a2 = Double.valueOf("567");

        // Unboxing: Converting a Double object to a primitive double
        double b1 = a2;

        // Printing the result
        System.out.println(b1);
		
		
		
		
		
	}

}
