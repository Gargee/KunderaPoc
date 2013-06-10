package com.Kundera.poc;

import javax.persistence.Column;
import javax.persistence.Embeddable;

/*
 * CREATE TABLE "MediaCategory" (MCategoryID int, SubMCategoryName varchar,
 * PhotoRankID int, VirtualTourID int, LangID int, PRIMARY KEY(MCategoryID,
 * LangID, PhotoRankID, VirtualTourID));
 */

@Embeddable
public class MediaCategoryCompoundKey {

	@Column
	int langid;
	@Column
	int photorankid;
	@Column
	int virtualtourid;
	

	

	public MediaCategoryCompoundKey() {
	}

	


	public MediaCategoryCompoundKey(int langid, int photorankid,
			int virtualtourid) {
		super();
		this.langid = langid;
		this.photorankid = photorankid;
		this.virtualtourid = virtualtourid;
		
	}

	public int getLangid() {
		return langid;
	}

	public void setLangid(int langid) {
		this.langid = langid;
	}

	public int getPhotorankid() {
		return photorankid;
	}

	public void setPhotorankid(int photorankid) {
		this.photorankid = photorankid;
	}

	public int getVirtualtourid() {
		return virtualtourid;
	}

	public void setVirtualtourid(int virtualtourid) {
		this.virtualtourid = virtualtourid;
	}

}
