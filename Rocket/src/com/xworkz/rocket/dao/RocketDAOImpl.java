package com.xworkz.rocket.dao;

import javax.naming.ldap.ManageReferralControl;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.PersistenceException;
import static com.xworkz.rocket.util.EMFUtil.*;


import com.xworkz.rocket.entity.RocketEntity;

public class RocketDAOImpl implements RocketDAO{
	private EntityManagerFactory factory=getFactory();


	@Override
	public boolean save(RocketEntity entity) {
		try {
			EntityManagerFactory factory=getFactory();
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
	public RocketEntity findById(Integer id) {
		EntityManagerFactory factory =getFactory();

		EntityManager manager = factory.createEntityManager();
		try {

			RocketEntity entity =manager.find(RocketEntity.class, id);
			if(entity!=null) {
				System.out.println("Entity found : "+id);
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
	//	EntityManagerFactory factory =Persistence.createEntityManagerFactory("com.xworkz");
		EntityManager manager=factory.createEntityManager();
		EntityTransaction tx = manager.getTransaction();
		tx.begin();
		try {
			RocketEntity entity =manager.find(RocketEntity.class, id);
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

	@Override
	public void updateNameAndPurposeById(String newName, String newPurpose, Integer id) {
		EntityManagerFactory factory= getFactory();

		EntityManager manager =factory.createEntityManager();
		try {

			EntityTransaction tx = manager.getTransaction();
			tx.begin();
			RocketEntity entity = manager.find(RocketEntity.class, id);
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
}




