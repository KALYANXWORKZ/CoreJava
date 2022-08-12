package com.xworkz.bike.bike.dao;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.xworkz.bike.bikeentity.BikeEntity;

public class BikeDAOImpl implements BikeDAO {
	private	EntityManagerFactory factory = Persistence.createEntityManagerFactory("com.xworkz");

	@Override
	public boolean save(BikeEntity entity) {
		EntityManager manager = factory.createEntityManager();
		try {
			EntityTransaction tx = manager.getTransaction();
			tx.begin();
			manager.persist(entity);
			tx.commit();
		}
		catch (Exception e) {
			e.printStackTrace();
		}
		finally {
			manager.close();
			factory.close();
		}
		return true;
	}

	@Override
	public BikeEntity findById(Integer id) {
		EntityManager manager = factory.createEntityManager();
		try {
			BikeEntity entity = manager.find(BikeEntity.class, id);
			if(entity!=null) {
				System.out.println("Entity is found: "+id);
				return entity;
			}
			else {
				System.out.println("Entity not found");
			}


		}
		catch (Exception e) {
			e.printStackTrace();
		}
		finally {
			manager.close();
		}
		return null;
	}


	@Override
	public void deleteById(Integer id) {
		EntityManager manager = factory.createEntityManager();
		try {
			EntityTransaction tx = manager.getTransaction();
			tx.begin();
		BikeEntity entity =	manager.find(BikeEntity.class, id);
		manager.remove(entity);
		tx.commit();
			
		}
		catch (Exception e) {
			e.printStackTrace();
		}
		finally {
			manager.close();
		}
		

	}

	@Override
	public void updateBrandAndModelById(String newBrand, Integer newModel, Integer id) {
		EntityManager manager = factory.createEntityManager();
		try {
			EntityTransaction tx = manager.getTransaction();
			tx.begin();
			BikeEntity entity= manager.find(BikeEntity.class, id);
			if(entity!=null) {
				System.out.println("Entity found : "+id);
			entity.setBrand(newBrand);
			entity.setModel(newModel);
			manager.merge(entity);
		}
		else {
			System.out.println("Entity not found");
		}
			tx.commit();
		}
		catch (Exception e) {
			e.printStackTrace();
		}
		finally {
			manager.close();
		}		
	}
}


