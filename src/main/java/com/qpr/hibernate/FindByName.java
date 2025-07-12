package com.qpr.hibernate;


import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;

public class FindByName {
	public static void main(String[] args) {
		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("vaibhav");
		EntityManager entityManager = entityManagerFactory.createEntityManager();
		EntityTransaction transaction = entityManager.getTransaction();
		
		Query query = entityManager.createQuery("select s from Employee1 s where s.name=? 1");
		query.setParameter(1, "abhishek");
		List resultList = query.getResultList();
		System.out.println(resultList);
	}
	
	
	
	
	
	

}
