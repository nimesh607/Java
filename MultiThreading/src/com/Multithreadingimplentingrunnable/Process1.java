package com.Multithreadingimplentingrunnable;

public class Process1 implements Runnable{
	public void run()
	{
		int i;
		for(i=1;i<=10;i++)
		{
			System.out.println("Process1: "+i);
		}
	}
}
