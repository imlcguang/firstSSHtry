package com.ixs.mvctry.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="booktest")//记得改！！！
public class Book {
	private String bookID;

	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="BOOKID", nullable=false)
	public String getBookID() {
		return bookID;
	}

	public void setBookID(String bookID) {
		this.bookID = bookID;
	}
	
}
