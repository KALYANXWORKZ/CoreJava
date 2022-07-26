package com.xworkz.core_java.Collection_Framework.Vector1;

import java.util.TreeSet;

import com.xworkz.core_java.Collection_Framework.Sets_.TreeSet_Examples.MyComparator;

public class TreeSetDemo1 {
public static void main(String[] args) {
	TreeSet ts=new TreeSet(new MyComparator());
	ts.add(new StringBuffer("1"));
	ts.add(new StringBuffer("2"));
	ts.add(new StringBuffer("3"));
	ts.add(new StringBuffer("5"));
	ts.add(new StringBuffer("4"));
	System.out.println(ts); 
	
	
}
}
