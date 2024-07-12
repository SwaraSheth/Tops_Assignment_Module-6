package com.assignment;

/*
 * WAP to reverse an array of integer values.
 */

public class ArrayReverse {
public static void main(String[] args) {
	int[] a= {10,20,30,40,50};
	
	System.out.print("Array Elements are : ");
	for (int i = 0; i < a.length; i++) {
		System.out.print(" "+a[i]);
	}
	
	System.out.println();
	System.out.print("Reverse Array Elements are : ");
	for (int i = a.length-1; i >=0; i--) {
		System.out.print(" "+a[i]);
	}
}
}
