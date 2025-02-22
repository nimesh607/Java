package com.abstractclass;

abstract class AbstractDemo1 {
	int x,y;
	void f1()
	{
		x=5;
		y=2;
		
	}
	abstract void f2();//abstract function.Rule 1:There is no body of abstact function.
	//Rule 2:If in normal class there is abstact function then it is mandatory to create whole class abstract.
	//Rule 3: How to  use abstract mehtods?-By overriding in subclasses.
						
	AbstractDemo1(){
		System.out.println("Parent's constructor");
		}
	
}
