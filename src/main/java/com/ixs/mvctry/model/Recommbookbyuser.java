package com.ixs.mvctry.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="recommbookbyuser_test")//记得改！！！
public class Recommbookbyuser {
	private Integer id;
	private String readerID;
	private String likebook;
	private String unlikebook;
	
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="ID")
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	@Column(name="ReaderID")
	public String getReaderID() {
		return readerID;
	}
	public void setReaderID(String readerID) {
		this.readerID = readerID;
	}
	@Column(name="Likebook")
	public String getLikebook() {
		return likebook;
	}
	public void setLikebook(String likebook) {
		this.likebook = likebook;
	}
	@Column(name="Unlikebook")
	public String getUnlikebook() {
		return unlikebook;
	}
	public void setUnlikebook(String unlikebook) {
		this.unlikebook = unlikebook;
	}
	
	
	
	
}
