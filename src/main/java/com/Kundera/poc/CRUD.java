package com.Kundera.poc;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;

public class CRUD {
	EntityManagerFactory emf = Persistence
			.createEntityManagerFactory("cassandra_pu");
	EntityManager em = emf.createEntityManager();

	public void Create() {
/*
		User U1 = new User("1234", "Paul");
		User U2 = new User("4566", "Banerjee");
		User U3 = new User("4567", "HU");
		User U4 = new User("89745", "Orriss");
		User U5 = new User("89744", "HataKeda");
		User U6 = new User("89741", "Webster");
		User u7 = new User("9874", "GargeePaul");
		em.persist(U1);
		em.persist(U2);
		em.persist(U3);
		em.persist(U4);
		em.persist(U5);
		em.persist(U6);*/
		MediaCategoryGroup  mcg = new MediaCategoryGroup("1","Delete");
		MediaCategoryGroup  mcg2 = new MediaCategoryGroup("2","Pool2s");
		em.persist(mcg);
		em.persist(mcg2);
		System.out.println("Hurray Done with create in media catgory "+mcg+mcg2);
	}

	public void ReadSingleRecord(String id) {
		// find person by ssnid
		MediaCategoryGroup  mcg  = em.find(MediaCategoryGroup.class, id);
		System.out.println(mcg);

	}

	public void ReadMutipleRecord(String id) {
		// retrieve many records
		Query q = em.createQuery("Select u from User u where  p.SSNId <id");
		List<User> results = q.getResultList();
		System.out.println(results.size()+"Records are present");

	}

	// Code for updating an entity is similar to the one used for inserting
	// entity. You just need to set fields in the entity and persist it.
	public void Update(String name, String id) {

		User u = em.find(User.class, id);
		u.setLastName(name);
		em.persist(u);
		System.out.println("Updated");

	}

	public void delete(String id) {
		User u = em.find(User.class, id);
		em.remove(u);
		System.out.println("Deleted");
	}

}
