package com.xworkz.cartoon.dao;

import java.util.List;

import com.xworkz.cartoon.entity.CartoonCharacterEntity;

public interface CartoonCharacterDAO {
	
	boolean addAll(List<CartoonCharacterEntity> entities);
	
	CartoonCharacterEntity findByName(String name);
	
	CartoonCharacterEntity findByNameAndCountryAndGenderAndAuthor(String name, 
			String country, String gender , String author);

}
