package com.xworkz.bottle.job;
import com.xworkz.bottle.job.Designation;
import com.xworkz.bottle.job.Qualification;
import com.xworkz.bottle.job.JobDAO;
import com.xworkz.bottle.job.JobDAOImpl;
import com.xworkz.bottle.job.JobDTO;

public class JobService {
	public static void main(String[] args) {

		JobDTO jobDTO = new JobDTO(1,Designation.SYSTEMENGINEER,"400000",Qualification.BE,"78.65","NO");
		JobDAO jobDAO = new JobDAOImpl();
		jobDAO.saveDetails(jobDTO);
		JobDTO gon =jobDAO.findByID(2);
		System.out.println(gon);
		JobDTO details=jobDAO.findByIdAndDesignation(4, "NetworkEngineer");
		System.out.println(details);
		JobDTO de = jobDAO.findByIdAndDesignationAndQualification(6, "Developer", "BE");
		System.out.println(de);
		jobDAO.getTotal();

	}

}

}
