package com.assignment;

/*
 * WAP to concatenate a given string to the end of another string.
 */

public class ConcatenateString {
public static void main(String[] args) {
	StringBuffer s1=new StringBuffer("Hi I am Swara Shah.");
	System.out.println("Original string value is : "+s1);
	System.out.println("Original string length is : "+s1.length());
	
	s1.append(" I am Computer Engineer ");
	System.out.println("Now string value is : "+s1);
	System.out.println("Now string length is : "+s1.length());
}
}
