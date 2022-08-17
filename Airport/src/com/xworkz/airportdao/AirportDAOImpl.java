package com.xworkz.airportdao;

import javax.persistence.EntityManager;
import static com.xworkz.airport.util.EMFUtil.*;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.xworkz.airportentity.AirportEntity;



public class AirportDAOImpl implements AirportDAO {
	private EntityManagerFactory factory =getFactory();

	@Override
	public boolean save(AirportEntity entity) {
		EntityManager manager = null;
		try {
			manager = factory.createEntityManager();
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
		}

		return true;
	}

	@Override
	public AirportEntity getById(Integer id) {
		EntityManager manager = factory.createEntityManager();
		try {
			AirportEntity entity = manager.find(AirportEntity.class, id);
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
		}		return null;
	}

	@Override
	public void updateNameAndPurposeById(String newName, String newPurpose, Integer id) {
		EntityManager manager = factory.createEntityManager();
		try {
			EntityTransaction tx = manager.getTransaction();
			tx.begin();
			AirportEntity entity= manager.find(AirportEntity.class, id);
			if(entity!=null) {
				System.out.println("Entity found : "+id);
			entity.setName(newName);
			entity.setPurpose(newPurpose);
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

	@Override
	public void deleteById(Integer id) {
		EntityManager manager = factory.createEntityManager();
		try {
			EntityTransaction tx = manager.getTransaction();
			tx.begin();
		AirportEntity entity =	manager.find(AirportEntity.class, id);
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

}
