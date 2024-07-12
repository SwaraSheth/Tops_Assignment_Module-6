package com.assignment;

import java.util.Iterator;
import java.util.Scanner;

/*
 * WAP to compute the sum of the first 100 prime numbers.
 */

public class SumPrimeNum {
public static void main(String[] args) {
	
	int i,j,sum=0;
	
    for (i=1;i<=100;i++) {
    	int count=0;
    	for ( j = 2; j <= i/2; j++) {
    		
        	if (i%j==0) {
    			count++;
    			
    			break;
    		}
        	
    	}
        
        if (i==j) {
        	
        	sum=sum+i;
    		
    	} 
        System.out.println("Prime Numberes are : "+i);
	}
    System.out.println("sum of Prime Number : "+sum);
    
}
}
