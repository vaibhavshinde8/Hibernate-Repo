package com.qpr.hibernate;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;

public class FindBySal {
public static void main(String[] args) {
	EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("vaibhav");
	EntityManager entityManager = entityManagerFactory.createEntityManager();
	EntityTransaction transaction = entityManager.getTransaction();
	
	Query query = entityManager.createQuery("select e from Employee1 e where e.sal=? 1");
	query.setParameter(1, 1273.0);
	List resultList = query.getResultList();
	System.out.println(resultList);

}
}
