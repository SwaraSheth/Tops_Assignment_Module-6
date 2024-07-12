package com.assignment;

import javax.swing.text.StyledEditorKit.ForegroundAction;

/*
 * WAP to create one thread by implementing Runnable interface in Class.
 */

class First implements Runnable{
	
		public void run() {
			for (int i = 0; i <= 5; i++) {
				System.out.println("This is First class");
				try {
					Thread.sleep(2000);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		}
		
		
	
}
public class ThreadRunnableInterface {
public static void main(String[] args) throws InterruptedException {
	First f1=new First();
	Thread t1=new Thread(f1);
	
	t1.start();
	
	for (int i = 0; i <= 5; i++) {
		System.out.println("This is main thread");
		t1.sleep(2000);
	}
	
	
	
}
}
