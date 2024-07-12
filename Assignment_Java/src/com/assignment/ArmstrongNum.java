package com.assignment;

import java.util.Scanner;

/*
 * W.A.J.P to check given number is Armstrong or not?
 */

public class ArmstrongNum {
public static void main(String[] args) {
	int n,c,rem,arm = 0;
	
	Scanner scanner=new Scanner(System.in);
	System.out.println("Enter Number");
	n=scanner.nextInt();
	c=n;
	
	while (n>0) {
		rem=n%10;
		arm=(rem*rem*rem)+arm;
		n=n/10;	
	}
	
	if (c==arm) {
		System.out.println("Armstrong Number");
	} else {
		System.out.println("Not Armstrong Number");
	}
}
}
