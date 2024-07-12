package com.assignment;

import java.util.Scanner;

/*
 * W.A.J.P to check given number is Prime or not?
 * if nub is divisible by 1 and itself only
 */

public class PrimeNum {
public static void main(String[] args) {
	int number,count=0;
	Scanner sc=new Scanner(System.in);
    System.out.println("Enter the number: ");
    number = sc.nextInt();
    
    for (int i = 1; i <= number; i++) {
		
    	if (number%i==0) {
			count++;
		}
	}
    
    if (count==2) {
		System.out.println("Prime Number");
	} else {
		System.out.println("Not Prime Number");
	}
}
}
