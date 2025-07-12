package com.qpr.hibernate;

import javax.management.Query;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class DeleteAllEmployee {

	public static void main(String[] args) {
		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("vaibhav");
		EntityManager entityManager = entityManagerFactory.createEntityManager();
		EntityTransaction transaction = entityManager.getTransaction();
		
		
		transaction.begin();
		javax.persistence.Query query2 = entityManager.createQuery("delete from Employee1");
//		Query query = entityManager.createQuery("DELETE FROM Employee1");
		int deletedCount = query2.executeUpdate();
		transaction.commit();
		System.out.println(deletedCount + " records deleted.");

	}
}
