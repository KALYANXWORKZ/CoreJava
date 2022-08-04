package com.xworkz.bottle.BARDTOANDDAOANDRUNNER.CONSTANTS;

public enum MysqlProperties {
	
URL("jdbc:mysql://localhost:3306/pub"),USERNAME("root"),SECRET("1BE18CV411");
	
	private String value; 
	
	private MysqlProperties(String value) {
           this.value = value;
	}

	public String getValue() {
		
		return value;
	}
	
}
