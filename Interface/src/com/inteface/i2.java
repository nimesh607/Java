package com.inteface;

public interface i2 extends i1 {
	
	int y=10;
	int x=9;

	void f3();
	static void f2() {
		System.out.println(x);
	}
	static void f1()
	{
		f2();
	}

}
