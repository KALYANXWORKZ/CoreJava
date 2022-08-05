package com.xworkz.job.dto;

import com.xworkz.job.constants.DesignationProperties;
import com.xworkz.job.constants.QualificationProperties;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
    public class JobDTO  {
	private Integer id;
	private DesignationProperties designation=DesignationProperties.NETWORK_ENGINEER;
	private Double salaryPackage;
	private QualificationProperties qualification = QualificationProperties.BE;
	private Double percentage;
	private String fresher;

}
