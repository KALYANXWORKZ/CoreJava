package com.xworkz.core_java.Exception_Handling.Custom_Exception.CheckedExamples.ATM;

public class AtmException extends Exception {

	@Override
	public String toString() {
		return " You have crossed Daily Limit.";
	}

	@Override
	public String getMessage() {
		return "Invalid Amount Entered.";
	}
	
		


}
