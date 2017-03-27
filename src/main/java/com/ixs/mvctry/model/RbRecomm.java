package com.ixs.mvctry.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

//@Entity
//@Table(name="rbrecomm")
public class RbRecomm {
	private String readerid;
	private String bookid;
	private double recomm;
	

	
	/*@Id
	@Column(name="READERID", nullable=false)
	public String getReaderid() {
		return readerid;
	}

	public void setReaderid(String readerid) {
		this.readerid = readerid;
	}
	@Id
	@Column(name="BOOKID", nullable=false)
	public String getBookid() {
		return bookid;
	}

	public void setBookid(String bookid) {
		this.bookid = bookid;
	}

	@Column(name="RECOMM", nullable=false)
	public double getRecomm() {
		return recomm;
	}
	
	public void setRecomm(double recomm) {
		this.recomm = recomm;
	}

	@Override
	public String toString() {
		return "RbRecomm [readerid=" + readerid + ", bookid=" + bookid + ", recomm=" + recomm + "]";
	}
	
*/
	
	
}
