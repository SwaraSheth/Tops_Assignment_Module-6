package com.assignment;

import java.util.ArrayList;

/*
 * WAP to remove the third element from a array list.
 */

public class ArrayElementRemove {
public static void main(String[] args) {
	ArrayList a1=new ArrayList();
	
	System.out.println("Default array value is : "+a1);
	System.out.println("Default array size is : "+a1.size());
	
	a1.add(1);
	a1.add(2);
	a1.add(3);
	a1.add(4);
	a1.add(5);
	System.out.println("Now array value is : "+a1);
	System.out.println("Now array size is : "+a1.size());
	
	a1.remove(2);
	System.out.println("Now array value after removing third element is : "+a1);
	System.out.println("Now array size after removing third element is : "+a1.size());
	
}
}
