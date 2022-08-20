package com.xworkz.cartoon.runner;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import com.xworkz.cartoon.dao.CartoonCharacterDAO;
import com.xworkz.cartoon.dao.CartoonCharacterDAOImpl;
import com.xworkz.cartoon.entity.CartoonCharacterEntity;

public class CartoonCharacterRunner {
	public static void main(String[] args) {
		
		CartoonCharacterEntity cartoonCharacterEntity = new 
				CartoonCharacterEntity("Doreman", "USA", "Male", "Darshan", "Comedy", 
						"Kalyan", LocalDate.now(), "Chandru", LocalDate.now());
		
		CartoonCharacterEntity cartoonCharacterEntity1 = new 
				CartoonCharacterEntity("Chotabheem", "India", "Male", "Hanamant", "Comedy", 
						"Kalyan", LocalDate.now(), "Darshan", LocalDate.now());
		
		CartoonCharacterEntity cartoonCharacterEntity2 = new 
				CartoonCharacterEntity("Mickey Mouse", "India", "Male", "Hanamant", "Comedy", 
						"Kalyan", LocalDate.now(), "Darshan", LocalDate.now());
		
		CartoonCharacterEntity cartoonCharacterEntity3 = new 
				CartoonCharacterEntity("Garfield", "Europe", "Male", "Sharath", "Animation", 
						"Kalyan", LocalDate.now(), "Darshan", LocalDate.now());
		
		CartoonCharacterEntity cartoonCharacterEntity4 = new 
				CartoonCharacterEntity("Donald Duck", "Japan", "Male", "Sharan", "Cartoon", 
						"Kalyan", LocalDate.now(), "Darshan", LocalDate.now());
		
		CartoonCharacterEntity cartoonCharacterEntity5 = new 
				CartoonCharacterEntity("Dennis the Menace", "Srilanka", "Male", "Darshan", "Animation", 
						"Kalyan", LocalDate.now(), "Darshan", LocalDate.now());
		
		CartoonCharacterEntity cartoonCharacterEntity6 = new 
				CartoonCharacterEntity("Betty Boop", "Bangladesh", "Male", "Nandish", "Cartoon", 
						"Kalyan", LocalDate.now(), "Darshan", LocalDate.now());
		
		CartoonCharacterEntity cartoonCharacterEntity7 = new 
				CartoonCharacterEntity("Bugs Bunny", "Australia", "Male", "Manoj", "Comedy", 
						"Kalyan", LocalDate.now(), "Darshan", LocalDate.now());
		
		CartoonCharacterEntity cartoonCharacterEntity8 = new 
				CartoonCharacterEntity("Charlie Brown", "England", "Male", "Nandan", "Comedy", 
						"Kalyan", LocalDate.now(), "Darshan", LocalDate.now());
		
		CartoonCharacterEntity cartoonCharacterEntity9 = new 
				CartoonCharacterEntity("Garfield", "Arpitha", "Male", "Chandru", "Cartoon", 
						"Kalyan", LocalDate.now(), "Darshan", LocalDate.now());
		
		CartoonCharacterDAO dao = new CartoonCharacterDAOImpl();
		List<CartoonCharacterEntity> entities = new ArrayList();
		
//		entities.add(cartoonCharacterEntity);
//		entities.add(cartoonCharacterEntity1);
//		entities.add(cartoonCharacterEntity2);
//		entities.add(cartoonCharacterEntity3);
//		entities.add(cartoonCharacterEntity4);
//		entities.add(cartoonCharacterEntity5);
//		entities.add(cartoonCharacterEntity6);
//		entities.add(cartoonCharacterEntity7);
//		entities.add(cartoonCharacterEntity8);
//		entities.add(cartoonCharacterEntity9);
//		dao.addAll(entities);

//		CartoonCharacterEntity entity =dao.findByName("Doreman");
//		System.out.println(entity);
		
//		CartoonCharacterEntity k =dao.findByNameAndCountryAndGenderAndAuthor("Chotabheem", "India", "Male", "Hanamant");
//		System.out.println(k);
		
		
//	    	String string = dao.findAuthorByName("Garfield");
//		    System.out.println(string);
		 
		
//		Object[] objects = dao.findNameAndCountryByAuthor("Nandan");
//		System.out.println(objects[0]);
//		System.out.println(objects[1]);
		
//		LocalDate localDate = dao.findCreatedDateByAuthor("Manoj");
//		System.out.println(localDate);
		 
//		dao.updateAuthorByName("Sudeep", "Mickey Mouse"); 
		
//		dao.updateTypeByName("Voilance", "Bugs Bunny");  
		
//		dao.deleteByName("Betty Boop");
		
//		Long long1 = dao.total();
//		System.out.println(long1);
		
		
//		CartoonCharacterEntity cartoonCharacterEntity10 = dao.findByMaxCreatedDate();
//		System.out.println(cartoonCharacterEntity10);
		
		
//		dao.findAll().forEach(System.out::println);
		
//		dao.findAllByAuthor("Chandru").forEach(System.out::println);

//		 dao.findAllByAuthorAndGender("Sharan","Male").forEach(System.out::println);

//		 dao.findAllName().forEach(System.out::println);

//		 dao.findAllCountry().forEach(System.out::println);

//		 dao.findAllNameAndCountry().forEach(object->System.out.println(object[0]+"::"+object[1]));
		
		dao.findAllNameAndCountryAndAuthor().forEach(object -> System.out.println(object[0] + "::" + object[1] + "::" + object[2]));
	


		
		
	}

}
