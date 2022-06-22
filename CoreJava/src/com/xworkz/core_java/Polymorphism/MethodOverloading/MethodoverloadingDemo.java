package com.xworkz.core_java.Polymorphism.MethodOverloading;

public class MethodoverloadingDemo

{
	public static void main(String[] args) {

		Human ravi = new Human();
		Friend raju = new Friend();
		Unknown mohan = new Unknown();

		ravi.speak(mohan);


	}

}
