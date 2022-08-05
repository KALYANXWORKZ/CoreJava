package com.xworkz.job.dao;

import com.xworkz.job.dto.JobDTO;

public interface JobDAO {
	
	boolean save(JobDTO jobDTO);
	JobDTO findById(Integer id);
	JobDTO findByIdAndDesignation(Integer id, String designation);
	JobDTO findByIdAndDesignationAndQualification(Integer id, String designation,
		   String qualification);
	int getTotal();
	boolean isFresherById(int id);
	double maxPercentage();
 
}
