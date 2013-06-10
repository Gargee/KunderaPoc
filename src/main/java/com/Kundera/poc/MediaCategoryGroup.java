package com.Kundera.poc;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
/*Through CLI if created
 * 
 * create column family MediaCategoryGroup with comparator=UTF8Type and default_validation_class=UTF8Type and key_validation_class=UTF8Type;
 UPDATE COLUMN FAMILY MediaCategoryGroup WITH comparator=UTF8Type AND column_metadata=[{column_name: mcategoryid, validation_class: UTF8Type, index_type: KEYS}];

 * 
 * Or 
 * Through CQL if created with PK as string
CREATE TABLE "MediaCategoryGroup" (mcategoryid2 int, mcategoryname varchar, PRIMARY KEY(mcategoryid2));
thro cql with PK as int
CREATE TABLE "MediaCategoryGroup" (MCategoryID int, MCategoryName varchar, PRIMARY KEY(MCategoryID));

 * */


@Entity
@Table(name = "MediaCategoryGroup", schema = "KunderaExamples@cassandra_pu")
public class MediaCategoryGroup {


	public MediaCategoryGroup() {

	}

	public MediaCategoryGroup(int mcategoryid, String mcategoryname) {
		super();
		this.mcategoryid = mcategoryid;
		this.mcategoryname = mcategoryname;
	}

	public int getmcategoryid() {
		return mcategoryid;
	}

	public void setmcategoryid(int mcategoryid) {
		this.mcategoryid = mcategoryid;
	}

	public String getmcategoryname() {
		return mcategoryname;
	}

	public void setmcategoryname(String mcategoryname) {
		this.mcategoryname = mcategoryname;
	}

	@Id
	private int mcategoryid;
	@Column(name = "mcategoryname")
	private String mcategoryname;
  
  
	public String toString() {
		return "User [mcategoryid=" + mcategoryid + ", mcategoryname=" + mcategoryname + "]";
	}

}
