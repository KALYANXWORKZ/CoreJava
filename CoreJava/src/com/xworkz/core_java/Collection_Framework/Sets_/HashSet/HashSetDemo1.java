package com.xworkz.core_java.Collection_Framework.Sets_.HashSet;

import java.util.HashSet;

public class HashSetDemo1 {
	public static void main(String[] args) {
		Train channamma=new Train();
		channamma.setName("Rani Channamma");
		channamma.setNoOfCompartment(20);
		channamma.setSource("Hubli");
		channamma.setDestination("Bengalur");
		channamma.setTrainNumber(012345);
		channamma.setPrice(350);
		
		Train channamma1=new Train();
		channamma1.setName("Rani Channamma1");
		channamma1.setNoOfCompartment(20);
		channamma1.setSource("Hubli");
		channamma1.setDestination("Bengalur");
		channamma1.setTrainNumber(012345);
		channamma1.setPrice(350);
		
		Train hampi=new Train();
		hampi.setName("Hampi Experss");
		hampi.setNoOfCompartment(25);
		hampi.setSource("Bagalkot");
		hampi.setDestination("Hubli");
		hampi.setTrainNumber(023456);
		hampi.setPrice(200);
		
		HashSet<Train> train=new HashSet<Train>();
		train.add(channamma);
		train.add(hampi);
		train.add(channamma);
		System.out.println(train);
		
	}

}
