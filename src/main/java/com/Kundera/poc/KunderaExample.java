package com.Kundera.poc;

import java.util.HashMap;
import java.util.Map;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import com.impetus.client.cassandra.common.CassandraConstants;

public class KunderaExample {
	public static void main(String[] args) {
		User user = new User();
		
		
		   Map<String, String> propertyMap = new HashMap<String, String>();
    propertyMap.put(CassandraConstants.CQL_VERSION, CassandraConstants.CQL_VERSION_3_0);
    EntityManagerFactory emf = Persistence.createEntityManagerFactory("cassandra_pu", propertyMap);
    EntityManager entityManager = emf.createEntityManager();

/*		EntityManagerFactory emf = Persistence
				.createEntityManagerFactory("cassandra_pu");*/
		EntityManager em = emf.createEntityManager();

		CRUD c = new CRUD();
		//creating the data
		c.Create();
		/* to read a single record please uncomment this line*/
		
	c.ReadSingleRecord("2");
		
	/*to read a multiple  records please uncomment this line*/
		
		// c.ReadMutipleRecord();
		
		/*to update the data uncomment this line*/
		
		//c.Update("PaulUpated", "1234");
		
		/*to delete the data uncomment this line*/

		// c.delete("1234");

		
		em.close();
		emf.close();
	}
}
