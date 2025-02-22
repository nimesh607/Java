package com.abstractclass;

//
public class Demo2 extends AbstractDemo1{
	int z;
	@Override void f2()//override method
	{
		z=8;
		System.out.println(z);
	}
	Demo2()
	{
		System.out.println("this is child constructor");
	}

}
