package com.xworkz.core_java.Collection_Framework.Sets_.LinkedHashSet;

import java.util.LinkedHashSet;

public class LinkedHashSetDemo {
	public static void main(String[] args) {
		LinkedHashSet hash=new LinkedHashSet();
		hash.add(1);
		hash.add(2);
		hash.add(3);
		hash.add(2);
		hash.add(null);
		hash.add("Java");
		hash.add(null);
		System.out.println(hash);
		
	}

}
