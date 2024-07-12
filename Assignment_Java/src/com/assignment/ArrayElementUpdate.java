package com.assignment;

import java.util.Arrays;
import java.util.Scanner;

/*
 * WAP to update specific array element by given element.
 */

public class ArrayElementUpdate {
public static void main(String[] args) {
	int[] a= {1,2,3,4,5};
	int index,value;
	
	Scanner scanner=new Scanner(System.in);
	System.out.println("Enter index no you what to update : ");
	index=scanner.nextInt();
	
	System.out.println("Enter value you want to update : ");
	value=scanner.nextInt();
	
	a[index]=value;
	
	System.out.println("Upadted Array is : "+Arrays.toString(a));
}
}
