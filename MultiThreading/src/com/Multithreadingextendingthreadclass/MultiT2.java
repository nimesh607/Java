package com.Multithreadingextendingthreadclass;


public class MultiT2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Process1 p1 = new Process1();
		Process2 p2 = new Process2();
		p1.start();
		p2.start();
	}

}
