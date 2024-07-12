package com.assignment;

import java.util.Iterator;
import java.util.Scanner;

/*
 * W.A.J.P for create Fibonacci Series.
 * 0 1 1 2 3 5 8 13
 */

public class FibonacciSeries {
public static void main(String[] args) {
	int term,a=0,b=1,c;
	
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter Term");
	term=sc.nextInt();
	
	for (int i = 1; i <= term; i++) {
		
		System.out.print(a+" ");
		c=a+b;
		a=b;
		b=c;
	}
	}
}

