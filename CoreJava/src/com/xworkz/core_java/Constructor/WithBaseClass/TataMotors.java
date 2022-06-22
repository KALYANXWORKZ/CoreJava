package com.xworkz.core_java.Constructor.WithBaseClass;

public class TataMotors extends TataGroups
{

	String model;
	String color;

	TataMotors()
	{
		super("TataRatan");
		System.out.println("Constructed TataMotors object");
		this.color="red";
		this.model="RangeRover";
	}
}

