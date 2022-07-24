package com.xworkz.core_java.Collection_Framework.Sets_.HashSet;

import java.util.Objects;

public class Train {
	String name;
	int noOfCompartment;
	long trainNumber;
	String source;
	String destination;
	double price;
	
	public Train() {
		
	}
	

	public double getPrice() {
		return price;
	}


	public void setPrice(double price) {
		this.price = price;
	}


	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getNoOfCompartment() {
		return noOfCompartment;
	}

	public void setNoOfCompartment(int noOfCompartment) {
		this.noOfCompartment = noOfCompartment;
	}

	public long getTrainNumber() {
		return trainNumber;
	}

	public void setTrainNumber(long trainNumber) {
		this.trainNumber = trainNumber;
	}

	public String getSource() {
		return source;
	}

	public void setSource(String source) {
		this.source = source;
	}

	public String getDestination() {
		return destination;
	}

	public void setDestination(String destination) {
		this.destination = destination;
	}
	

	@Override
	public int hashCode() {
		return Objects.hash(destination, name, noOfCompartment, price, source, trainNumber);
	}


	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Train other = (Train) obj;
		return Objects.equals(destination, other.destination) && Objects.equals(name, other.name)
				&& noOfCompartment == other.noOfCompartment
				&& Double.doubleToLongBits(price) == Double.doubleToLongBits(other.price)
				&& Objects.equals(source, other.source) && trainNumber == other.trainNumber;
	}


	@Override
	public String toString() {
		return "Train [name=" + name + ", noOfCompartment=" + noOfCompartment + ", trainNumber=" + trainNumber
				+ ", source=" + source + ", destination=" + destination + "]";
	}
	
	
	

}
