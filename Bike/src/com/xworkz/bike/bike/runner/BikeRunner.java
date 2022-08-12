package com.xworkz.bike.bike.runner;

import java.time.LocalDate;

import com.xworkz.bike.bike.dao.BikeDAO;
import com.xworkz.bike.bike.dao.BikeDAOImpl;
import com.xworkz.bike.bikeentity.BikeEntity;

public class BikeRunner {
	public static void main(String[] args) {
		BikeEntity be = new BikeEntity();

		be.setId(1);
		be.setBrand("Pulsar");
		be.setCreateDate(LocalDate.now());
		be.setCreatedBy("Sharath");
		be.setMillege("45 KM");
		be.setModel(2020);
		be.setOwner("Darshan");
		be.setPrice(95000d);
		be.setUpdateDate(LocalDate.now());
		
		be.setId(2);
		be.setBrand("Discover");
		be.setCreateDate(LocalDate.now());
		be.setCreatedBy("Hanamanth");
		be.setMillege("55 KM");
		be.setModel(2022);
		be.setOwner("Rupesh");
		be.setPrice(75000d);
		be.setUpdateDate(LocalDate.now());
		
		be.setId(3);
		be.setBrand("Active Honda");
		be.setCreateDate(LocalDate.now());
		be.setCreatedBy("Abhi");
		be.setMillege("50 KM");
		be.setModel(2021);
		be.setOwner("bhaskar");
		be.setPrice(85000d);
		be.setUpdateDate(LocalDate.now());


		BikeDAO dao = new BikeDAOImpl();
		boolean saved=dao.save(be);
		System.out.println(saved);
		
//		BikeEntity read=  dao.findById(2);
//		System.out.println(read);
		
//		dao.updateBrandAndModelById("Royal Enfiled", 2019, 1);
		
//		dao.deleteById(3);

	}

}
