package com.ixs.mvctry.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="readertest")//记得改！！！
public class Reader {
	private String readerID;

	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="READERID", nullable=false)
	public String getReaderID() {
		return readerID;
	}

	public void setReaderID(String readerID) {
		this.readerID = readerID;
	}
	
}
