package com.Kundera.poc;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
/*
 * create column family users with comparator=UTF8Type and default_validation_class=UTF8Type and key_validation_class=UTF8Type;

 * */
@Entity
@Table(name = "users", schema = "KunderaExamples@cassandra_pu")
public class User 
{
	public User(){
		
	}

	
	public User(String sSNId, String lastName) {
		super();
		SSNId = sSNId;
		this.lastName = lastName;
	}
	public String getSSNId() {
		return SSNId;
	}
	public void setSSNId(String sSNId) {
		SSNId = sSNId;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	@Id
	    private String SSNId;
	  @Column(name="last_name")
	    private String lastName;
	
	public String toString() {
		return "User [SSNId=" + SSNId + ", lastName=" + lastName + "]";
	}
	  
}
