package com.xworkz.core_java.Type_Casting.NonPrimitiveTypeCasting.DownCasting;

public class DownCastDemo 
{
	public static void main(String[] args) 
	{
		Bird bird = new Dove();   // parent reference is holding child object
		Dove dove = (dove) bird; //down casting // giving of parent reference to child reference

	}

}
