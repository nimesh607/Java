package com.abstractclass;

/*Note:1) we can't make objects of abstract class
		2) we can make object of child class. but by inheriting from parent class which abstract child class will also become abstract.so to avoid being child class as a abstract .
		3)Use overriding of function.Benefit of this is we can make objects.
*/

public class Abs {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Demo2 d1 = new Demo2();//there will no object of abstract class
		d1.f2();
	}

}
