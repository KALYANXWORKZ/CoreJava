package com.xworkz.resort.runner;

import java.time.LocalDate;
import java.time.LocalTime;

import com.xworkz.resort.dao.ResortDAO;
import com.xworkz.resort.dao.ResortDAOImpl;
import com.xworkz.resort.entity.ResortEntity;

public class ResortRunner {

	public static void main(String[] args) {

		ResortEntity resortEntity = new ResortEntity();

		resortEntity.setId(1);
		resortEntity.setName("Mango-Mist");
		resortEntity.setLocation("Kanakapura Road");
		resortEntity.setCheckInTime(LocalTime.of(12, 00));
		resortEntity.setCheckOutTime(LocalTime.of(11, 00));
		resortEntity.setOwner("Yashvanth");
		resortEntity.setCreateBy("om");
		resortEntity.setCreateDate(LocalDate.now());
		resortEntity.setPricePerDay(2000D);
		resortEntity.setUpdateDate(LocalDate.now());

		ResortDAO resortDAO = new ResortDAOImpl();

		boolean saved = resortDAO.save(resortEntity);
		System.out.println(saved);


	}

}
