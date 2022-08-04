package com.xworkz.bottle.BARDTOANDDAOANDRUNNER.RUNNER;

import com.xworkz.bottle.BARDTOANDDAOANDRUNNER.CONSTANTS.BarType;
import com.xworkz.bottle.BARDTOANDDAOANDRUNNER.DAO.BarDAO;
import com.xworkz.bottle.BARDTOANDDAOANDRUNNER.DAO.BarDAOImpl;
import com.xworkz.bottle.BARDTOANDDAOANDRUNNER.DTO.BarDTO;

public class Runner {

	public static void main(String[] args) {
		BarDTO dto = new BarDTO(2,"Gangotri","BTM LAYOUT",BarType.RESORT,20000,600000);
		BarDAO dao = new BarDAOImpl();
		dao.save(dto);

		BarDTO dto1 = new BarDTO(3,"Raja","KS LAYOUT",BarType.BAR_RESTAURANT,30000,900000);
		dao.save(dto1);
		BarDTO dto2 = new BarDTO(4,"Santhosh","KS LAYOUT",BarType.MSIL,10000,300000);
		dao.save(dto2);
		BarDTO dto3 = new BarDTO(5,"Rupesh","MADDUR",BarType.RESORT,25000,750000);
		dao.save(dto3);
	}

}
