package com;

public class RunningTHreads extends Thread {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		RunningTHreads thread =new RunningTHreads();
		thread.start();
		
		System.out.println("this is 1");
		
	}
	public void run()
	{
		System.out.println("this is 2");
		

	}

}
