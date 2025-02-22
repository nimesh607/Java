package com.inteface;

//
public interface i1 {
	int x=6;//In interface variable are always public,static,final 
	void f1();//In interface methods are always abstract and public.and no need to 				define the method.
	
	//Overriding:Function name  and same is known as overriding.it can used in between parents and subclasses.if there is f1 method in parent in class and another f1 method in subclass then by calling by subclass with method name i.e child class f1() 
	
//We can give definition of static function .This feature is available after java 8
	
	static void f2() {
		System.out.println(x);
	}
	

}
