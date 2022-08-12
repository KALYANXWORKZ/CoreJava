package com.xworkz.resort.dao;

import com.xworkz.resort.entity.ResortEntity;

public interface ResortDAO {
	
	boolean save(ResortEntity entity);
	
	ResortEntity findById(Integer id);
	
	void UpdateNameAndLocationById(String newName,String newLocation, Integer id );
	
	void deleteById(Integer id);

}
