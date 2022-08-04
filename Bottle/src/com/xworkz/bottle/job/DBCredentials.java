package com.xworkz.bottle.job;

public enum DBCredentials {

	URL("jdbc:mysql://Localhost:3306/job"), USERNAME("root"),SECRET("1BE18CV411");

	private String value; 

	private DBCredentials(String value) {
		this.value = value;
	}

	public String getValue() {
		return value;
	}
}
