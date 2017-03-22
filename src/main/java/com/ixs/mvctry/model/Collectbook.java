package com.ixs.mvctry.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "collectbooktest")//记得改！！！！
public class Collectbook {
	private Integer collectID;
	private String readerID;
	private String bookID;
	private String rate;
	
	public Collectbook() {
		
	}
	
	public Collectbook(Integer collectID, String readerID, String bookID, String rate) {
		super();
		this.collectID = collectID;
		this.readerID = readerID;
		this.bookID = bookID;
		this.rate = rate;
	}

	@Override
	public String toString() {
		return "Collectbook [collectID=" + collectID + ", readerID=" + readerID + ", bookID=" + bookID + ", rate="
				+ rate + "]";
	}
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "CollectID", nullable = false)
	public Integer getCollectID() {
		return collectID;
	}
	public void setCollectID(Integer collectID) {
		this.collectID = collectID;
	}
	@Column(name = "readerID", nullable = false)
	public String getReaderID() {
		return readerID;
	}
	public void setReaderID(String readerID) {
		this.readerID = readerID;
	}
	@Column(name = "bookID", nullable = false)
	public String getBookID() {
		return bookID;
	}
	public void setBookID(String bookID) {
		this.bookID = bookID;
	}
	@Column(name = "rate", nullable = false)
	public String getRate() {
		return rate;
	}
	public void setRate(String rate) {
		this.rate = rate;
	}
}
