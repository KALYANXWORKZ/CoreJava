package com.xworkz.core_java.String_Class;

public class StringBuilderDemo {

	public static void main(String[] args) {

		StringBuilder builder = new StringBuilder("Xworkz");
		System.out.println("String :" + builder);
		builder.reverse();
		System.out.println("Reversed String :" + builder);
	}

}
