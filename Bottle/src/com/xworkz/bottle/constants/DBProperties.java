package com.xworkz.bottle.constants;

public enum DBProperties {
	
	URL("jdbc:mysql://localhost:3306"),USERNAME("root"),PASSWORD("1BE18CV411");
	
	private String value;
	
	private DBProperties(String value) {
           this.value = value;
	}

	public String getValue() {
		
		return value;
	}
}
