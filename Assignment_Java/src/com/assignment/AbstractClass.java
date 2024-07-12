package com.assignment;

/*
 * W.A.J.P. Create an abstract class 'Parent' with a method 'message'. It has two subclasses each having a method with the same name
'message' that prints "This is first subclass" and "This is second subclass" respectively.
Call the methods 'message' by creating an object for each subclass.
 */

abstract class Parent{
	public abstract void message();
}	
	class FirstS extends Parent{

		@Override
		public void message() {
			// TODO Auto-generated method stub
			System.out.println("This is first subclass");
		}
		
	}
	
	class SecondS extends Parent{

		@Override
		public void message() {
			// TODO Auto-generated method stub
			System.out.println("This is second subclass");
		}
		
	}
	
public class AbstractClass {
public static void main(String[] args) {
	FirstS FS1=new FirstS();
	SecondS SS1=new SecondS();
	
	FS1.message();
	SS1.message();
}
}
