package com.xworkz.core_java.Array;

public class Lipstick {
	String brand;
	String color;
	float price;


	Lipstick(String brand, String color,float price){
		this.brand = brand;
		this.color = color;
		this.price = price;
	}

	@Override
	public String toString() {
		return "Lipstick [brand=" + brand + ", color=" + color + ", price=" + price + "]";
	}
}

