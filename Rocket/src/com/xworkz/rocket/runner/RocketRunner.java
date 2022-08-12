package com.xworkz.rocket.runner;

import com.xworkz.rocket.dao.RocketDAO;
import com.xworkz.rocket.dao.RocketDAOImpl;
import com.xworkz.rocket.entity.RocketEntity;

public class RocketRunner {
	public static void main(String[] args) {
		
		RocketEntity rocketEntity = new RocketEntity();
		
		rocketEntity.setId(1);
		rocketEntity.setName("Chandrayan-2");
		rocketEntity.setMadeIn("India");
		rocketEntity.setColor("White");
		rocketEntity.setPrice(351265D);
		rocketEntity.setPurpose("Research in Moon");
		rocketEntity.setWeight("3850 KG");
		
		rocketEntity.setId(2);
		rocketEntity.setName("Mission Mangalayan");
		rocketEntity.setMadeIn("India");
		rocketEntity.setColor("Orange");
		rocketEntity.setPrice(450000d);
		rocketEntity.setPurpose("Research in Mars");
		rocketEntity.setWeight("4000 KG");
		
		rocketEntity.setId(3);
		rocketEntity.setName("Mission Black hole");
		rocketEntity.setMadeIn("USA");
		rocketEntity.setColor("RED");
		rocketEntity.setPrice(550000d);
		rocketEntity.setPurpose("Research in Black hole");
		rocketEntity.setWeight("5000 KG");
		
		
		RocketDAO dao = new RocketDAOImpl();
		
		boolean saved = dao.save(rocketEntity);
		System.out.println(saved);
		
//		RocketEntity read =dao.findById(1);
//		System.out.println(read);
		
//  	dao.updateNameAndPurposeById("Chandrayana-1", "Research in Moon", 1);
		
//		dao.deleteById(3);
		
	}

}
