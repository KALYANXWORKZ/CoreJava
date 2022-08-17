package com.xworkz.freedomfighter.runner;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import com.xworkz.freedomfighter.dao.FreedomFighterDAO;
import com.xworkz.freedomfighter.dao.FreedomFighterDAOImpl;
import com.xworkz.freedomfighter.entity.FreedomFighterEntity;

public class FreedomFighterRunner {

	public static void main(String[] args) {
		FreedomFighterEntity freedomFighterEntity = new FreedomFighterEntity(1, "SangoliRayanna", LocalDate.now(),
				LocalDate.now(), "Male", "Tumkur", "Nandan", LocalDate.now(), "Sharath", LocalDate.now());
		FreedomFighterDAO freedomFighterDAO = new FreedomFighterDAOImpl();
//		boolean save = freedomFighterDAO.save(freedomFighterEntity);
//		System.out.println(save);

		FreedomFighterEntity freedomFighterEntity1 = new FreedomFighterEntity(2, "Chandru", LocalDate.now(),
				LocalDate.now(), "Male", "Dharvad", "Manoj", LocalDate.now(), "Nair", LocalDate.now());

		FreedomFighterEntity freedomFighterEntity2 = new FreedomFighterEntity(3, "Jansi Rani laxmi", LocalDate.now(),
				LocalDate.now(), "female", "ChitdruDruga", "Darshan", LocalDate.now(), "Sharan", LocalDate.now());
		List<FreedomFighterEntity> list=new ArrayList<FreedomFighterEntity>();
		list.add(freedomFighterEntity1);
		list.add(freedomFighterEntity2);
		boolean save2=freedomFighterDAO.saveAll(list);
		System.out.println(save2);
	}

}
