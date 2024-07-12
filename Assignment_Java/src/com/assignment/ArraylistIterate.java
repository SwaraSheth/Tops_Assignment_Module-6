package com.assignment;

import java.util.ArrayList;
import java.util.Iterator;

/*
 * WAP to iterate through all elements in an array list.
 */

public class ArraylistIterate {
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
		
		System.out.println("Iterate through all elements in an array list as below :");
		
		Iterator i1=a1.iterator();
		while (i1.hasNext()) {
			System.out.println(i1.next());
			
		}
		
	}
}
