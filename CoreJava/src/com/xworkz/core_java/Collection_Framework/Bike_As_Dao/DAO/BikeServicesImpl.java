package com.xworkz.core_java.Collection_Framework.Bike_As_Dao.DAO;

import com.xworkz.core_java.Collection_Framework.Bike_As_Dao.DTO.BikeDTO;
import com.xworkz.core_java.Collection_Framework.Bike_As_Dao.Service.BikeServices;

public class BikeServicesImpl implements BikeServices{

	BikeDAO bikeDAO = new BikeDAOImpl();
	
	@Override
	public void addBike(BikeDTO dto) {
		bikeDAO.addBike(dto);
	}

	@Override
	public BikeDTO getBike(String dto) {
	return bikeDAO.getBike(dto);
	}

	@Override
	public void updateBike(BikeDTO dto) {
		bikeDAO.updateBike(dto);
	}

	@Override
	public void deleteBike(BikeDTO dto) {
		bikeDAO.deleteBike(dto);
	}

}
