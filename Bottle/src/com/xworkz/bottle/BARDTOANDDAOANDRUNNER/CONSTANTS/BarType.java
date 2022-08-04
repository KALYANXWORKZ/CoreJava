package com.xworkz.bottle.BARDTOANDDAOANDRUNNER.CONSTANTS;

public enum BarType {
     WINE_STORE("wine store"),
     MSIL("msil"),
     BAR_RESTAURANT("bar restaurant"),
     RESORT("resort"),
     DEFAULT("restaurant");
	
	private String name;
	
	private BarType(String name) {
		this.name = name;
	}

     public String getName() {
    	 return name;
     }
}
