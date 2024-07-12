package com.assignment;

import java.util.Arrays;
import java.util.Scanner;

/*
 * WAP to find the second largest element in an array.
 */

public class ArraySecLargElement {
public static void main(String[] args) {
	int a[]=new int[5];
	
	Scanner scanner=new Scanner(System.in);
	System.out.println("Enter Array Element");
	for (int i = 0; i < a.length; i++) {
		a[i]=scanner.nextInt();
	}
	
	System.out.print("Array Elements are : ");
	for (int i = 0; i < a.length; i++) {
		System.out.print(" "+a[i]);
	}
	
	System.out.println();
	
	Arrays.sort(a);
	System.out.println("second largest element in an array is : "+a[a.length-2]);
	
}
}
