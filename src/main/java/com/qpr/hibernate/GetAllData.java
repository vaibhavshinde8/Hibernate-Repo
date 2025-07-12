package com.qpr.hibernate;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;

public class GetAllData {

	public static void main(String[] args) {
		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("vaibhav");
		EntityManager entityManager = entityManagerFactory.createEntityManager();
		EntityTransaction transaction = entityManager.getTransaction();
		
		
		
		Query query = entityManager.createQuery("select s from Employee1 s");
		
		List resultList = query.getResultList();
		for(Object object:resultList) {
			System.out.println(object);
		}
		
		
	}
	
}
