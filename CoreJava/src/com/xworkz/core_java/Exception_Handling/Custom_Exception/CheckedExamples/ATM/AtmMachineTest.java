package com.xworkz.core_java.Exception_Handling.Custom_Exception.CheckedExamples.ATM;

public class AtmMachineTest {

	public static void main(String[] args) {
		AtmMachine atmMachine = new AtmMachine();
		int amount = 60000;
		try {
			atmMachine.draw(amount);
		}
		catch(AtmException e) {
			if(amount >50000) {
				System.out.println(e);
			}
			else {
				System.out.println(e.getMessage());
			}
		} 

	}

}
