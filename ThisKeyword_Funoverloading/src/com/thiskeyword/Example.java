package com.thiskeyword;

public class Example {
	 int x ,y;
	Example(int x,int y)
	{
		this.x=x;
		this.y=y;
	}
	Example(){
		
	}
	void f1(int x,int y)
	{
		//x=60;
		//y=80;//*///this will overwrite argument passed at the time of calling function
		this.x=x;//this keyword is a reference variable which is present in  function by default which will refer to it's own object similar like any reference variable created at the time of creating object.
				 //this x will refer to instance variable which is in object.And =x is local variable
		this.y=y;
		
	}
	void display()
	{
		System.out.println("This is local variable x: " +x);
		System.out.println("This is local variable y: " + y);
		System.out.println("This is reference varible x: "+this.x);
		System.out.println("This is reference variable y: "+this.y);
		
	}
	

}
