package com.xworkz.politicianInd.constants;

public enum PartyNameProperties {
	AITC("All India Trinamool Congress"), BSP("Bahujan Samaj Party "),
	BJP("Bharatiya Janata Party "),
	CPI("Communist Party of India"), INC("Indian National Congress "), 
	NCP("Nationalist Congress Party"),
	NPP("National People's Party"), PK("Prajakeeya"), JDS("Janatadal Secular"),
	AAP("Aam Aadmi Party"), DEFAULT("NA");

	private String name;

	private PartyNameProperties(String name) {
		this.name = name;

	}

	public String getName() {
		return name;
	}

	public static PartyNameProperties getByValue(String value) {
		PartyNameProperties[] partyNameProperties = PartyNameProperties.values();
		for (PartyNameProperties partyNameProperties2 : partyNameProperties) {
			//System.out.println(partyNameProperties2.name+"Comparing");
			if (partyNameProperties2.name.equals(value)) {

				return partyNameProperties2;
			}
		}
		return null;

	}

}


