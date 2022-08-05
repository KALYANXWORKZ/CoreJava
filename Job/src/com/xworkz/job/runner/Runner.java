package com.xworkz.job.runner;

import com.xworkz.job.constants.DesignationProperties;
import com.xworkz.job.constants.QualificationProperties;
import com.xworkz.job.dao.JobDAO;
import com.xworkz.job.dao.JobDAOImpl;
import com.xworkz.job.dto.JobDTO;

public class Runner {
	public static void main(String[] args) {
		JobDTO dto = new JobDTO(1, DesignationProperties.NETWORK_ENGINEER, 50000.00D,
				QualificationProperties.BE, 77.44, "YES");
		JobDAO dao = new JobDAOImpl();
		dao.save(dto);

		JobDTO dto1 = new JobDTO(2, DesignationProperties.NETWORK_ENGINEER,4500.00D ,
				QualificationProperties.BSC, 70.00, "YES");
		JobDAO dao1 = new JobDAOImpl();
		dao1.save(dto1);

		JobDTO dto2 = new JobDTO(3, DesignationProperties.SOFTWARE_TESTING_ENGINEER,
				50000.00D, QualificationProperties.BCOM, 65.00, "NO");
		JobDAO dao2 = new JobDAOImpl();
		dao2.save(dto2);

		JobDTO dto3 = new JobDTO(4, DesignationProperties.SYSTEM_ENGINEER, 65000.00D,
				QualificationProperties.BCA, 85.00, "NO");
		JobDAO dao3 = new JobDAOImpl();
		dao3.save(dto3);

		JobDTO dto4 = new JobDTO(5, DesignationProperties.SOFTWARE_DEVELOPER_ENGINEER,
				70000.00D, QualificationProperties.BE, 85.00, "NO");
		JobDAO dao4 = new JobDAOImpl();
				dao4.save(dto4);
		System.out.println("============================");

		JobDTO id = dao.findById(1);
		System.out.println(id);

		System.out.println("============================");


		JobDTO idDesignatiom = dao.findByIdAndDesignation(2, "Network Engineer");
		System.out.println(idDesignatiom);

		System.out.println("============================");

		JobDTO idDesignationQualification = dao.findByIdAndDesignationAndQualification(3, "SoftWare Testing Enginner",
				"BCOM");
		System.out.println(idDesignationQualification);
		dao.getTotal();
		
		System.out.println("============================");
		
		dao.getTotal();
		
		System.out.println("============================");
		
		Boolean fresher =dao.isFresherById(2);
		System.out.println(fresher);
		
		System.out.println("============================");

		Double percentage	=dao.maxPercentage();
		System.out.println(percentage);

	}

}
