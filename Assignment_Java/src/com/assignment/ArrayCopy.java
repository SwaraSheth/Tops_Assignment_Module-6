package com.assignment;

import java.util.Iterator;

/*
 * WAP to Copy one array into another
 */

public class ArrayCopy {
public static void main(String[] args) {
	int[] a= {10,20,30,40,50};
	int[] b= new int[a.length];
	
	b=a;
	
	System.out.print("a[] : ");
	for (int i = 0; i < a.length; i++) {
		System.out.print(" "+a[i]);
	}
	System.out.println();
	
	System.out.print("b[] : ");
	for (int i = 0; i < a.length; i++) {
		System.out.print(" "+b[i]);
	}
}
}
