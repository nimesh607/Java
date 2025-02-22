package com.thiskeyword;

public class This {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("object e1");
		Example e1=new Example(4,8);
		e1.f1(5, 20);
		e1.display();
		System.out.println("object e2");
		Example e2=new Example();
		e2.display();//0,0
		e1.display();
		
		Example1 e3=new Example1();
		e3.f3(50,80);
		e3.f4();
			//Scanner scn=new Scanner(System.in);
	        //int n = scn.nextInt();
		
		
		
		}

}
