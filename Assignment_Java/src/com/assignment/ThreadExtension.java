package com.assignment;

/*
 * WAP to create one thread by extending Thread class in another Class.
 */
class Second extends Thread{
	public void run() {
		for (int i = 0; i <= 5; i++) {
			System.out.println("This is second class");
			try {
				Thread.sleep(2000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}
public class ThreadExtension {
public static void main(String[] args) throws InterruptedException {
	Second s1=new Second();
	s1.start();
	
	for (int i = 0; i <= 5; i++) {
		System.out.println("This is main thread");
		s1.sleep(2000);
	}
}
}
