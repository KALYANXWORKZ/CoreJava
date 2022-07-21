package com.xworkz.core_java.Collection_Framework.Bike_As_Dao.DAO;

import com.xworkz.core_java.Collection_Framework.Bike_As_Dao.DTO.BikeDTO;

public interface BikeDAO {

	void addBike(BikeDTO dto);
	BikeDTO getBike(String companyName);
	void updateBike(BikeDTO dto);
	void deleteBike(BikeDTO dto);
}
