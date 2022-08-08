package com.xworkz.politicianInd.constants;

public enum MySqlProperties {
	
	URL("jdbc:mysql://localhost:3306/politician"),
   USERNAME("root"), SECRET("1BE18CV411");
	
	private String value;
	
	private MySqlProperties(String value) {
		this.value = value;
	}

	public String getValue() {
		return value;
	}
}
