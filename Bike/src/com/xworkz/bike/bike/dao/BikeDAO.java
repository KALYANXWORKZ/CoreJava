package com.xworkz.bike.bike.dao;

import com.xworkz.bike.bikeentity.BikeEntity;

public interface BikeDAO {
	
	boolean save(BikeEntity entity);
	
	BikeEntity findById(Integer id);
	
	void updateBrandAndModelById(String newBrand,Integer newModel, Integer id);
	
	void deleteById(Integer id);

}
