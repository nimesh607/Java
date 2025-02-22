package com.inteface;


/*1)like abstract class,interface also don't have object.
 * 2)class implements interface
 * 3)interface extends interface.class extends class.
 * 4)Interface don't have constructor,in interface variable are declared intially and they are static,public and final. Constructor are used to intialize values of instance members. 
 * 
 * 
 * */
public class InterF {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		C1 obj = new C1();
		System.out.println(C1.x);
		//C1.f2();
		//i2.f2();//variables  can override but functions can't
		
	}

}
