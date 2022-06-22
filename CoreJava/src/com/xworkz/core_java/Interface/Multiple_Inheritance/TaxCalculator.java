package com.xworkz.core_java.Interface.Multiple_Inheritance;

public class TaxCalculator implements StateTax, CentralTax 
{
	public  void petrol()
	{
		System.out.println("The central tax is 10");
	}

	@Override
	public void electricity()
	{
		System.out.println("The state tax is 5");
	}
}
