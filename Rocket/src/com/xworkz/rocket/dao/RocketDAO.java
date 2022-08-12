package com.xworkz.rocket.dao;

import com.xworkz.rocket.entity.RocketEntity;

public interface RocketDAO {
	
	boolean save(RocketEntity entity);
	
	RocketEntity findById(Integer id);
	
	void updateNameAndPurposeById(String newName,String newPurpose, Integer id);
	
	void deleteById(Integer id);

}
