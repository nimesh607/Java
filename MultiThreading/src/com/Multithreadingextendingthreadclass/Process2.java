package com.Multithreadingextendingthreadclass;

public class Process2 extends Thread{
	public void run()
	{
		int i;
		for(i=1;i<=10;i++)
		{
			System.out.println("Process2: "+i);
		}
}
}