package com.thiskeyword;

public class Example1 extends Example{
	int x,y;
	void f3(int x, int y)
	{
		//super keyword
		super.x=x;//this is super keyword.it represents parents class members(variables and methods) 
		super.y=y;
	}
	void f4()
	{
		System.out.println(super.x);
		System.out.println(super.y);
	}
	
}
