package com.xworkz.job.constants;

public enum QualificationProperties {
	BE("be"),BCOM("bcom"),BCA("bca"),BSC("bsc"),DEFAULT("na");

	private String qualification;

	private QualificationProperties(String qualification) {
		this.qualification=qualification;
	}
	public String getQualification() {
		return qualification;
	}

	public static QualificationProperties getByValue(String value) {
		QualificationProperties[] qualificationProperties=QualificationProperties.values();
		for(QualificationProperties qualificationProperties2:qualificationProperties) {
			System.out.println(qualificationProperties2.qualification+"comparing");
			if(qualificationProperties2.qualification.equals(value));
			return qualificationProperties2;
		}
		return null;


	}
}

