package com.xworkz.bottle.Ciggarette.Constants;

public enum DBProperties {
	
	URL("jdbc:mysql://localhost:3306/CIGARETTE"),USERNAME("root"),PASSWORD("1BE18CV411");

      private String type;
      
      private DBProperties(String type) {
          this.type = type;         
      }
      
      public String getType() {
    	  return type;
      } 
}
