package com.assignment;

import java.util.Scanner;

/*
 * WAP to calculate the average value of array elements.
 */

public class ArrayAvgValue {
public static void main(String[] args) {
	int a[]= {10,20,30,40,50};
	int sum=0;
	double avg;
	
	System.out.print("Array Elements are : ");
	for (int i = 0; i < a.length; i++) {
		System.out.print(" "+a[i]);
	}
	System.out.println();
	
	System.out.print("Sum of Array Elements are : ");
	for (int i = 0; i < a.length; i++) {
		sum=a[i]+sum;
		
	}
	System.out.print(" "+sum);
	
	System.out.println();
	
	avg=sum/5.0;
	System.out.print("Average of Array Elements are : "+avg);
}
}
