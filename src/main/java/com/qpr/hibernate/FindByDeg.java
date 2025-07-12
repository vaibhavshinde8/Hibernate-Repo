package com.qpr.hibernate;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;

public class FindByDeg {
public static void main(String[] args) {
	EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("vaibhav");
	EntityManager entityManager = entityManagerFactory.createEntityManager();
	EntityTransaction transaction = entityManager.getTransaction();
	
	Query query = entityManager.createQuery("select e from Employee1 e where e.deg IN (?1, ?2, ?3)");
	query.setParameter(1, "SE");
	query.setParameter(2, "ASE");
	query.setParameter(3, "SSE");
	List resultList = query.getResultList();
	System.out.println(resultList);

}
}
