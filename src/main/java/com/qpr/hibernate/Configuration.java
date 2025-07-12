package com.qpr.hibernate;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class Configuration {

	public static void main(String []args) {
		
		
		Employee1 e=new Employee1();
		e.setId(102);
		e.setName("abhishek");
		e.setMob(123455);
		e.setSal(1273.0);
		e.setDeg("Software Developer");
		
		EntityManagerFactory entityManagerFactory=Persistence.createEntityManagerFactory("vaibhav");
		
		EntityManager entityManager = entityManagerFactory.createEntityManager();
		EntityTransaction transaction=entityManager.getTransaction();
		
		transaction.begin();
		entityManager.persist(e);
		transaction.commit();
//		System.out.println(entityManagerFactory);
	}
}

