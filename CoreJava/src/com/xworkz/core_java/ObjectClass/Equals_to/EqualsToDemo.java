package com.xworkz.core_java.ObjectClass.Equals_to;

public class EqualsToDemo {

	public static void main(String[] args) {
		
		AC lg = new AC("LG",5,35000.50,"Black");
		AC lg1 = new AC("LG",5,35000.50,"Black");
		AC samsung = new AC("Samsung",5,36000.500,"Blue");
		System.out.println(lg.equals(lg1));
	}

}
