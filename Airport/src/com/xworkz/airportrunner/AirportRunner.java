package com.xworkz.airportrunner;

import java.time.LocalDate;

import com.xworkz.airportdao.AirportDAO;
import com.xworkz.airportdao.AirportDAOImpl;
import com.xworkz.airportentity.AirportEntity;


public class AirportRunner {
	public static void main(String[] args) {
		AirportEntity entity = new AirportEntity();
		
		entity.setId(1);
		entity.setName("KIA");
		entity.setCreatedDate(LocalDate.of(1990, 12, 11));
		entity.setCreatedBy("Kempegowda");
		entity.setModel(1990);
		entity.setPrice(98500D);
		entity.setPurpose("Domestic");
		entity.setUpdatedBy("Government");
		entity.setUpdatedDate(LocalDate.of(2000, 12, 11));
		
		entity.setId(2);
		entity.setName("Mysore Airort");
		entity.setCreatedDate(LocalDate.of(1992, 12, 11));
		entity.setCreatedBy("Kalyan");
		entity.setModel(1995);
		entity.setPrice(88500D);
		entity.setPurpose("Domestic");
		entity.setUpdatedBy("Government");
		entity.setUpdatedDate(LocalDate.of(2002, 12, 11));
		
		entity.setId(3);
		entity.setName("HAL");
		entity.setCreatedDate(LocalDate.of(1980, 12, 11));
		entity.setCreatedBy("Hanamanth");
		entity.setModel(1985);
		entity.setPrice(99500D);
		entity.setPurpose("Domestic");
		entity.setUpdatedBy("Government");
		entity.setUpdatedDate(LocalDate.of(2005, 12, 11));
		
		
		
		AirportDAO airportDAO = new AirportDAOImpl();
		
//		boolean saved = airportDAO.save(entity);
//		System.out.println(saved); 
		
		
//		AirportEntity read=  airportDAO.getById(2);
//		System.out.println(read);
		
		airportDAO.updateNameAndPurposeById("HAL1", "INTERNATIONAL", 3);
		
//		airportDAO.deleteById(3);

	
	
	}

}
