package com.assignment;

import java.util.Scanner;

/*
 * W.A.J.P to find factorial for Given Number.
 * 5=5*4*3*2*1=120
 */

public class FectorialNum {
public static void main(String[] args) {
	int number,fact=1;
	Scanner sc=new Scanner(System.in);
    System.out.println("Enter the number: ");
    number = sc.nextInt();
    
    for (int i = 1; i <=number; i++) {
    	fact=fact*i;
    	
	}
    System.out.println("Factorial of "+number+" is: "+fact);
}
}
