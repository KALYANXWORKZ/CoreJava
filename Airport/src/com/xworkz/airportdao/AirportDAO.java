package com.xworkz.airportdao;

import com.xworkz.airportentity.AirportEntity;

public interface AirportDAO {

	boolean save(AirportEntity entity);

	AirportEntity getById(Integer id);

	void updateNameAndPurposeById(String newName, String newPurpose, Integer id);

	void deleteById(Integer id);

}
