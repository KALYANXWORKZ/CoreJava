package com.xworkz.core_java.Single_Inheritance;

class Student {
	String name;  int marks;
	public static void main(String[] args) {
		Student s1=new Student();
		Student s2=new Student();

		s1.name = "Chandru";
		s1.marks = 60;
		s2.name = "Sharath";
		s2.marks = 75;

		System.out.println(s1.name +" has scored "+ s1.marks + " marks");
		System.out.println(s2.name +" has scored " +s2.marks + " marks");		 
	}

}

