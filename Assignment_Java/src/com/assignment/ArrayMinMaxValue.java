package com.assignment;

import java.util.Arrays;
import java.util.Scanner;

/*
 * WAP to find the maximum and minimum value of an array.
 */

public class ArrayMinMaxValue {
public static void main(String[] args) {
	int a[]=new int[5];
	int min,max;
	
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
//	min=a[0];
//	for (int i = 1; i < a.length; i++) {
//		if (a[i]<min) {
//			min=a[i];
//		}
//	}
	//System.out.println("minimun value in array is : "+min);
	
//	max=a[0];
//	for (int i = 1; i < a.length; i++) {
//		if (a[i]>max) {
//			max=a[i];
//		}
//	}
//	System.out.println("maximum value in array is : "+max);
//	
	Arrays.sort(a);
	System.out.println("minimun value in array is : "+a[0]);
	System.out.println("maximum value in array is : "+a[4]);
	
}
}
