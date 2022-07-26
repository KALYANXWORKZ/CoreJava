package com.xworkz.core_java.Collection_Framework.Sets_.TreeSet_Examples;

import java.util.Comparator;

public class MyComparator implements Comparator {
	

@Override
public int compare(Object o1, Object o2) {
	StringBuffer sb1=(StringBuffer)o1;
	StringBuffer sb2=(StringBuffer)o2;
	
	String s1=sb1.toString();
	String s2=sb2.toString();
	return -s1.compareTo(s2);
	//return +1;
	//return -1;
	
}
}
