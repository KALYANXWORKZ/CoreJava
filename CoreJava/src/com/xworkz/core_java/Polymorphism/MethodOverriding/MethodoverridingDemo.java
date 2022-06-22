package com.xworkz.core_java.Polymorphism.MethodOverriding;

public class MethodoverridingDemo
{

	public static void main(String[] args)
	{

		RBI rbi = new RBI();
		HDFC hdfc = new HDFC();
		AXIS axis = new AXIS();

		hdfc.interestRate();
		axis.interestRate();
		rbi.interestRate();
	}

}
