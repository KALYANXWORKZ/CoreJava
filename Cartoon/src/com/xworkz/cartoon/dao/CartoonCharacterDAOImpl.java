package com.xworkz.cartoon.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;

import com.mysql.cj.Query;
import com.xworkz.cartoon.entity.CartoonCharacterEntity;
import com.xworkz.cartoon.util.Factory;

import static com.xworkz.cartoon.util.Factory.*;

import com.xworkz.cartoon.entity.CartoonCharacterEntity;

public class CartoonCharacterDAOImpl implements CartoonCharacterDAO {
	EntityManagerFactory factory = getFactory();

	@Override
	public boolean addAll(List<CartoonCharacterEntity> entities) {

		EntityManager manager = factory.createEntityManager();
		try {
			EntityTransaction tx = manager.getTransaction();
			tx.begin();
			for (CartoonCharacterEntity cartoonCharacterEntity : entities) {
				manager.persist(cartoonCharacterEntity);

			}
			tx.commit();

		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			manager.close();
		}

		return false;
	}

	@Override
	public CartoonCharacterEntity findByName(String name) {
		 EntityManager manager= factory.createEntityManager();
		 try {
	              javax.persistence.Query query  = manager.createNamedQuery("findByName");
	                  query.setParameter("nm", name);
	                  Object result = query.getSingleResult();
	                  CartoonCharacterEntity entity = (CartoonCharacterEntity)result;
	                  return entity;
			
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
	public CartoonCharacterEntity findByNameAndCountryAndGenderAndAuthor(String name, String country, String gender,
			String author) {
		 EntityManager manager= factory.createEntityManager();
		 try {
             javax.persistence.Query query  = manager.createNamedQuery("findByName");
             query.setParameter("nm", name);
             query.setParameter("cy", country);
             query.setParameter("gr", gender);
             query.setParameter("ar", author);
             Object result = query.getSingleResult();
             CartoonCharacterEntity entity = (CartoonCharacterEntity)result;
             return entity;

			 
		 }
		 catch (Exception e) {
			e.printStackTrace();
		}
		 finally {
			manager.close();
		}

		return null;
	}

}
