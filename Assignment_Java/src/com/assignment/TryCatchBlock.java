package com.assignment;

/*
 * WAP to demonstrate try catch block.
 */

public class TryCatchBlock {
public static void main(String[] args) {
	int a=10,b=0;
	try {
		System.out.println("Division is : "+a/b);
	} catch (Exception e) {
		// TODO: handle exception
		e.printStackTrace();
	}
	System.out.println("Try Catch block executed");
}
}

