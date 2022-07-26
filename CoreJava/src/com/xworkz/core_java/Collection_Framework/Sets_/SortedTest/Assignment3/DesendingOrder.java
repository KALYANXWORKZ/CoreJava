package com.xworkz.core_java.Collection_Framework.Sets_.SortedTest.Assignment3;

import java.util.TreeSet;

public class DesendingOrder {
	public static void main(String[] args) {
		TreeSet<Integer> ts=new TreeSet<Integer>();
		ts.add(2);
		ts.add(30);
		ts.add(50);
		ts.add(40);
		ts.add(60);
		
		TreeSet<Integer>tsReverse=(TreeSet<Integer>)ts.descendingSet();
		System.out.println("Without descendingSet():"+ts);
		System.out.println("With descendingSet():"+tsReverse);
		
		
	}

}
