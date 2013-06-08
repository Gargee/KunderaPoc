package com.Kundera.poc;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
/*Through CLI if created
 * 
 * create column family MediaCategoryGroup with comparator=UTF8Type and default_validation_class=UTF8Type and key_validation_class=UTF8Type;
 * 
 * Or 
 * Through CQL if created
CREATE TABLE "mediaCategoryGroup" (MCategoryID varchar, MCategoryName varchar, PRIMARY KEY(MCategoryID));

 * */


@Entity
@Table(name = "MediaCategoryGroup", schema = "KunderaExamples@cassandra_pu")
public class MediaCategoryGroup {


	public MediaCategoryGroup() {

	}

	public MediaCategoryGroup(String MCategoryID, String MCategoryName) {
		super();
		this.MCategoryID = MCategoryID;
		this.MCategoryName = MCategoryName;
	}

	public String getMCategoryID() {
		return MCategoryID;
	}

	public void setMCategoryID(String MCategoryID) {
		this.MCategoryID = MCategoryID;
	}

	public String getMCategoryName() {
		return MCategoryName;
	}

	public void setMCategoryName(String MCategoryName) {
		this.MCategoryName = MCategoryName;
	}

	@Id
	private String MCategoryID;
	@Column(name = "MCategoryName")
	private String MCategoryName;
  
  
	public String toString() {
		return "User [MCategoryID=" + MCategoryID + ", MCategoryName=" + MCategoryName + "]";
	}

}
