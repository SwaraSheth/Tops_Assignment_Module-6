package com.assignment;

/*
 * WAP to demonstrate multiple catch blocks
 */

public class MultipleCatchBlock {
public static void main(String[] args) {
	int a=10,b=0;
	int[] num=new int[3];
	
	try {
		System.out.println("Division is : "+a/b);
		for (int i = 0; i <= 4; i++) {
			num[i]=i+1;
			System.out.println(num[i]);
			
		}
	} catch (ArithmeticException e) {
		// TODO: handle exception
		e.printStackTrace();
	}catch (ArrayIndexOutOfBoundsException e) {
		// TODO: handle exception
		e.printStackTrace();
	}
	
	finally {
		System.out.println("This code is written by swara shah");
		System.out.println("Ph no is 1234567890");
	}
}
}
