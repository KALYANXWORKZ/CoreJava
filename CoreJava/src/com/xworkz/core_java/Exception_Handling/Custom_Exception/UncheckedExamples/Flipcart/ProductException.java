package com.xworkz.core_java.Exception_Handling.Custom_Exception.UncheckedExamples.Flipcart;

public class ProductException extends RuntimeException{

	@Override
	public String toString() {
		return "Product not Found";
	}
}
