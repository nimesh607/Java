package com.Multithreadingimplentingrunnable;
//implementing Runnable interface
public class Process2 implements Runnable {
	public void run()
	{
		int i;
		for(i=1;i<=10;i++)
		{
			System.out.println("Process2: "+i);
		}
}
}
