package com.xworkz.core_java.Exception_Handling.Custom_Exception.CheckedExamples.ATM;

public class AtmMachine {
	
	void draw(int amount) throws AtmException {
		if(amount < 100 || amount > 50000 || amount%100 != 0 ) {
			AtmException atmExp = new AtmException();
			throw atmExp;
		}
		
		else {
			
			System.out.println("Please Wait for the cash");
		}
	}

}

