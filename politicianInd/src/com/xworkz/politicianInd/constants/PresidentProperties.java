package com.xworkz.politicianInd.constants;

public enum PresidentProperties {
	SUBRATABAKSHI("Subrata Bakshi"),
	RSKUSHWAHA("R S Kushwaha"),
	JPNADDA("J,P,Nadda"),
	DRAJA("D Raja"),
	SONIAGANDHI("Sonia Gandhi"),
	SHARADPAWAR("Sharad Pawar"),
	NANAAKUFOADDO("Nannaakufoaddo"), 
	UPENDRA("Upendra"), 
	DEVEGOWDA("DeveGowda"),
	ARVINDKEJRIWAL("Arvinda Kejriwal"),
	DEFAULT("NA");

	private String persidentName;

	private PresidentProperties(String presidentName) {
		this.persidentName=presidentName;
	}
	public String getPresident() {
		return persidentName;
	}
	public static PresidentProperties getByValue(String Value) {
		PresidentProperties[] presidentProperties=PresidentProperties.values();
		for(PresidentProperties presidentProperties2:presidentProperties) {
			//System.out.println(presidentProperties2.persidentName+"Comparing");
			if(presidentProperties2.persidentName.equals(Value)) {
				return presidentProperties2;
			}
		}
		return null;

	}

}


