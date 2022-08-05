package com.xworkz.job.constants;

public enum MySqlProperties {
	URL("jdbc:mysql://Localhost:3306/job1"),
	USERNAME("root"), SECRET("1BE18CV411");
	
	private String value;
	
	private MySqlProperties(String value) {
       this.value = value;
	}

	public String getValue() {
		return value;
	}
}
