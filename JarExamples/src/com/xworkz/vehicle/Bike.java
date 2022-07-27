package com.xworkz.vehicle;

public class Bike {
	public static void main(String[] args) {
		System.out.println("Main method is statred");

		VehicleExample ve = new VehicleExample();

		int v = ve.getPrice();

		 System.out.println("Price of the bike is : "  +v);
	}
}
