package com.assignment;

import java.util.Scanner;

/*
 * WAP to find the index of an array element.
 */

public class ArrayIndex {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	int a[]= {10,20,30,40,50};
	int b;
	System.out.println("Enter Array Element : ");
	b=sc.nextInt();
	
	for (int i = 0; i < a.length; i++) {
		if (b==a[i]) {
			System.out.println("Index of "+b+ " is "+i);
		}
	}
}
}
