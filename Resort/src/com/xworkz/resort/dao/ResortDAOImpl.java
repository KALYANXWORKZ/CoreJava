package com.xworkz.resort.dao;


import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.PersistenceException;

import com.xworkz.resort.entity.ResortEntity;

public class ResortDAOImpl implements ResortDAO {

	@Override
	public boolean save(ResortEntity entity) {

		try {
			EntityManagerFactory factory = Persistence.createEntityManagerFactory("com.xworkz");
			EntityManager manager = factory.createEntityManager();
			EntityTransaction tx = manager.getTransaction();
			tx.begin();
			manager.persist(entity);
			tx.commit();
			manager.close();
			factory.close();
		}
		catch(PersistenceException exception) {
			exception.printStackTrace();

		}

		return true;
	}

	@Override
	public ResortEntity findById(Integer id) {
		EntityManagerFactory factory=Persistence.createEntityManagerFactory("com.xworkz");
		EntityManager manager=factory.createEntityManager();
		try {
			ResortEntity entity = manager.find(ResortEntity.class, id);
			if(entity!=null) {
				System.out.println("entity found : "+id);
				return entity;
			}
			else {
				System.out.println("entity not found");
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
	public void UpdateNameAndLocationById(String newName, String newLocation, Integer id) {
		EntityManagerFactory factory =Persistence.createEntityManagerFactory("com.xworkz");
		EntityManager manager =factory.createEntityManager();
		try {
			EntityTransaction tx = manager.getTransaction();
			tx.begin();
			ResortEntity entity =manager.find(ResortEntity.class, id);
			if(entity!=null) {
				System.out.println("entity found: "+id);
				entity.setName(newName);
				entity.setLocation(newLocation);
				manager.merge(entity);
			}
			else {
				System.out.println("entity not found");

			}
			tx.commit();
			System.out.println(entity);
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
		EntityManagerFactory factory = Persistence.createEntityManagerFactory("com.xworkz");
		EntityManager manager=factory.createEntityManager();
		EntityTransaction tx = manager.getTransaction();
		tx.begin();
		try {
			ResortEntity entity = manager.find(ResortEntity.class, id);
			if(entity!=null) {
				manager.remove(entity);
			}
			else {
				System.out.println("Id unable to find");
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
