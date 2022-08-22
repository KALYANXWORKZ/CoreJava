package com.xworkz.supermarket.entity.service;

import java.util.Set;

import javax.validation.ConstraintViolation;
import javax.validation.ValidatorFactory;
import javax.xml.validation.Validator;

import com.xworkz.supermarket.entity.SuperMarketEntity;

public class ServiceDAOImpl implements ServiceDAO {

	@Override
	public Boolean save(SuperMarketEntity entity) {

		ValidatorFactory factory = getFactory();
		Validator validator = factory.getValidator();
		Set<ConstraintViolation<SuperMarketEntity>> violations = validator.validate(entity);
		if (violations.size() > 0) {
			System.out.println("Invalid Detais");
			for (ConstraintViolation<SuperMarketEntity> violation2 : violations) {
				System.out.println(violation2.getMessage());
			}
		} else {
			System.out.println("Valid Object");
			dao.save(entity);
		}		return null;
	}

}
