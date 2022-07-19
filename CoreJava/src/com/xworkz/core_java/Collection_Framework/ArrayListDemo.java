package com.xworkz.core_java.Collection_Framework;

import java.util.ArrayList;

public class ArrayListDemo {

	public static void main(String[] args) {

		ArrayList al= new ArrayList();
		al.add(1);
		al.add(2);
		al.add(3);
		al.add(4);
		al.add(5);
		al.add(6);

		System.out.println(al);

	ArrayList AL = new ArrayList();
	
	AL.add(10);
	AL.add(null);
	AL.add("XWORKZ");
	AL.add(10.56);
	AL.add(10);
	AL.add(56);
	
	System.out.println(AL);
	
	System.out.println(AL.size());	
	System.out.println(AL.get(2));
	System.out.println(AL.contains(null));
	System.out.println(AL.remove(1));
	System.out.println(AL);
	System.out.println(AL.indexOf(10));
	System.out.println(AL.indexOf(10.56));
	System.out.println(AL.indexOf(20));

	}
}
