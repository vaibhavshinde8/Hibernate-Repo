package com.qpr.hibernate;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class GetEmployee {
public static void main(String[] args) {
	EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("vaibhav");
	EntityManager entityManager = entityManagerFactory.createEntityManager();
	EntityTransaction transaction = entityManager.getTransaction();
	
//	entityManager.getClass();
	Employee1 employee1 = entityManager.find(Employee1.class,102);
	if(employee1!=null) {
		System.out.println(employee1.getName());
		System.out.println(employee1.getMob());
		System.out.println(employee1.getDeg());
	}
	
//	System.out.println(employee1.getName());

else {
	System.out.println("employee not present");
}
}
}
