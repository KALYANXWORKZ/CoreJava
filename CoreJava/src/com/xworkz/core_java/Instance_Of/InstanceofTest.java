package com.xworkz.core_java.Instance_Of;

public class InstanceofTest
{

	public static void main(String[] args)
	{
		Champakali champakali = new Champakali();
		KajjuBarfi kajjuBarfi = new KajjuBarfi();
		Chocolate chocolate = new Chocolate();

		chocolate.mouth(champakali);
		chocolate.mouth(kajjuBarfi);
		chocolate.mouth(null);

	}

}
