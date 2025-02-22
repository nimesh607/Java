package demo.stringbuilder;
import java.util.*;

public class Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StringBuffer sb= new StringBuffer();
		System.out.println(sb.capacity());//16
		sb.append("16 char :Nimeshmdmmammmmm");
		System.out.println(sb);
		System.out.println(sb.capacity());
		
		sb.append("B");
		System.out.println(sb);
		System.out.println("Afterr adding B it doubles memory: "+sb.capacity());
		sb.append(" Vaishnav");
		
		System.out.println(sb);
		System.out.println(sb.capacity());
		
		System.out.println("-----------------");
		StringBuffer sb1= new StringBuffer(20);
		System.out.println(sb1.capacity());//it specifiess the capacity of sf string buffer
		
		System.out.println("-----------------");
		StringBuffer sb2= new StringBuffer("Nimesh");//here the capacity will length of string +16
		System.out.println(sb2.capacity());
		System.out.println(sb2.length());
		StringBuffer sb3= new StringBuffer("");//here the capacity will length of string +16
		System.out.println(sb3.capacity());
		System.out.println(sb3.length());
		StringBuffer sb4= new StringBuffer("N");//here the capacity will length of string +16
		System.out.println(sb4.capacity());
		System.out.println(sb4.length());
		

		System.out.println("-----------------");
		StringBuffer sb5= new StringBuffer("abcdefgh");//here the capacity will length of string +16
		System.out.println(sb5.capacity());//24
		sb5.insert(2,"xyz");
		System.out.println(sb5);
		sb5.insert(10,9);
		System.out.println(sb5);
		sb5.delete(2, 5);
		System.out.println(sb5);
		sb5.reverse();
		System.out.println(sb5);
		sb5.setLength(3);
		System.out.println(sb5);
		StringBuffer sb6= new StringBuffer(2000);
		System.out.println(sb6.capacity());
		sb6.append("Ineuronffffffffffffffffffffffffffffffffffff");
		System.out.println(sb6.capacity());
		sb6.trimToSize();//it will trim the length of string 
		System.out.println(sb6.capacity());
		
		
		
		
		
			
			
		
		
		
		
	}

}
