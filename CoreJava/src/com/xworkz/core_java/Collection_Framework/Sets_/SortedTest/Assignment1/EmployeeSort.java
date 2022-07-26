package com.xworkz.core_java.Collection_Framework.Sets_.SortedTest.Assignment1;

import java.util.TreeSet;

public class EmployeeSort {
	public static void main(String[] args) {
		Employee e=new Employee("Raja", 20, 30000.00);
		Employee e1=new Employee("Rani", 25, 40000.00);
		Employee e2=new Employee("RajaKumar", 30, 50000.00);
		
		SortEmployeeByName name=new SortEmployeeByName();
		TreeSet<Employee> ts=new TreeSet<Employee>(name);
		ts.add(e);
		ts.add(e1);
		ts.add(e2);
		
		System.out.println(ts);

		
		
	} 	
	
	

}
