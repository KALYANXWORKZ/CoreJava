package com.xworkz.cartoon.dao;

import java.time.LocalDate;
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
		EntityManager manager = factory.createEntityManager();
		try {
			javax.persistence.Query query = manager.createNamedQuery("findByName");
			query.setParameter("nm", name);
			Object result = query.getSingleResult();
			CartoonCharacterEntity entity = (CartoonCharacterEntity) result;
			return entity;

		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			manager.close();
		}
		return null;
	}

	@Override
	public CartoonCharacterEntity findByNameAndCountryAndGenderAndAuthor(String name, String country, String gender,
			String author) {
		EntityManager manager = factory.createEntityManager();
		try {
			javax.persistence.Query query = manager.createNamedQuery("findByNameAndCountryAndGenderAndAuthor");
			query.setParameter("nm", name);
			query.setParameter("cy", country);
			query.setParameter("gr", gender);
			query.setParameter("ar", author);
			Object result = query.getSingleResult();
			CartoonCharacterEntity entity = (CartoonCharacterEntity) result;
			return entity;

		} catch (Exception e) {
			e.printStackTrace();
			manager.getTransaction().rollback();
		} finally {
			manager.close();
		}

		return null;
	}

	@Override
	public String findAuthorByName(String name) {

		EntityManager manager = factory.createEntityManager();
		try {
			javax.persistence.Query query = manager.createNamedQuery("findAuthorByName");
			query.setParameter("nm", name);
			Object object = query.getSingleResult();
			if (object != null) {
				String entity = (String) object;
				return entity;
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			manager.close();
		}
		return null;

	}

	@Override
	public Object[] findNameAndCountryByAuthor(String author) {
		EntityManager manager = factory.createEntityManager();
		try {
			javax.persistence.Query query = manager.createNamedQuery("findNameAndCountryByAuthor");
			query.setParameter("ar", author);
			Object result = query.getSingleResult();
			if (result != null) {
				Object[] objects = (Object[]) result;
				return objects;
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			manager.close();
		}
		return null;
	}

	@Override
	public LocalDate findCreatedDateByAuthor(String author) {
		EntityManager manager = factory.createEntityManager();
		try {
			javax.persistence.Query query = manager.createNamedQuery("findCreatedDateByAuthor");
			query.setParameter("at", author);
			Object result = query.getSingleResult();
			if (result != null) {
				LocalDate objects = (LocalDate) result;
				return objects;
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			manager.close();
		}
		return null;
	}

	@Override
	public void updateAuthorByName(String newAuthor, String name) {
		EntityManager manager = factory.createEntityManager();
		try {
			EntityTransaction tx = manager.getTransaction();
			tx.begin();
			javax.persistence.Query query = manager.createNamedQuery("updateAuthorByName");
			query.setParameter("nm", name);
			query.setParameter("at", newAuthor);

			query.executeUpdate();
			tx.commit();
		} catch (Exception e) {

		} finally {
			manager.close();

		}

	}

	@Override
	public void updateTypeByName(String newType, String name) {
		EntityManager manager = factory.createEntityManager();
		try {
			EntityTransaction tx = manager.getTransaction();
			tx.begin();
			javax.persistence.Query query = manager.createNamedQuery("updateTypeByName");
			query.setParameter("ty", newType);
			query.setParameter("nm", name);

			query.executeUpdate();
			tx.commit();

		} catch (Exception e) {

		} finally {
			manager.close();

		}

	}

	@Override
	public void deleteByName(String name) {
		EntityManager manager = factory.createEntityManager();
		try {
			EntityTransaction tx = manager.getTransaction();
			tx.begin();
			javax.persistence.Query query = manager.createNamedQuery("deleteByName");
			query.setParameter("nm", name);
			query.executeUpdate();
			tx.commit();

		} catch (Exception e) {

		} finally {
			manager.close();

		}

	}

	@Override
	public Long total() {
		EntityManager manager = factory.createEntityManager();
		try {
			javax.persistence.Query query = manager.createNamedQuery("total");

			Object object = query.getSingleResult();

			System.out.println(object);
			if (object != null) {

				Long u = (Long) object;
				return u;
			}

		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			manager.close();
		}
		return null;
	}

	@Override
	public CartoonCharacterEntity findByMaxCreatedDate() {
		EntityManager manager = factory.createEntityManager();
		try {
			javax.persistence.Query query = manager.createNamedQuery("findByMaxCreatedDate");
			Object object = query.getSingleResult();
			System.out.println(object);
			if (object != null) {
				CartoonCharacterEntity cartoonEntity = (CartoonCharacterEntity) object;
				return cartoonEntity;
			}

		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			manager.close();
		}
		return null;
	}

}
