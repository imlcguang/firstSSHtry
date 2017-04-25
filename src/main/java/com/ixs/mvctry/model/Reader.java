package com.ixs.mvctry.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="readertest500")//记得改！！！
public class Reader {
	private Integer id;
	private String readerID;

	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="ID")
	public Integer getId() {
		return id;
	}
	
	public void setId(Integer id) {
		this.id = id;
	}
	
	@Column(name="READERID")
	public String getReaderID() {
		return readerID;
	}


	public void setReaderID(String readerID) {
		this.readerID = readerID;
	}
	
}
