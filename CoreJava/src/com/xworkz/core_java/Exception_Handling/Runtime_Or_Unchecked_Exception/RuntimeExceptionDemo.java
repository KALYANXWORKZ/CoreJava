package com.xworkz.core_java.Exception_Handling.Runtime_Or_Unchecked_Exception;

public class RuntimeExceptionDemo {
	
	public static void main(String[] args) {
		
		String animalName = "White_Tiger";
		animalName = null;
		System.out.println("Animal_Name is :" + animalName );
		System.out.println("Animal_Name word length is :"+ animalName.length());
	}

}
