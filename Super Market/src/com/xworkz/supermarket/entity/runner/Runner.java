package com.xworkz.supermarket.entity.runner;

import java.time.LocalDate;

import com.xworkz.supermarket.entity.SuperMarketEntity;

public class Runner {
	public static void main(String[] args) {
		SuperMarketEntity market = new SuperMarketEntity();
		market.setId(1);
		market.setMarketName("DMart");
		market.setLocation("BTM");
		market.setNoOfStalls(20);
		market.setMaxCapacity(1900);

		market.setCreatedBy("Darshi");
		market.setCreatedDate(LocalDate.of(2020, 9, 1));

		market.setUpdatedBy("Boss");
		market.setUpdatedDate(LocalDate.now());

		ServiceDAO dao = new ServiceDAOImpl();
		dao.save(market);

	}

}
