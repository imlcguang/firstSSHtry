package com.ixs.mvctry.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="readeralike")
public class ReaderAlike {
	private String readerid1;
	private String readerid2;
	private double alike;
	

	
	@Id
	@Column(name="READERID1", nullable=false)
	public String getReaderid1() {
		return readerid1;
	}

	public void setReaderid1(String readerid1) {
		this.readerid1 = readerid1;
	}
	@Id
	@Column(name="READERID2", nullable=false)
	public String getReaderid2() {
		return readerid2;
	}

	public void setReaderid2(String readerid2) {
		this.readerid2 = readerid2;
	}
	@Column(name="ALIKE", nullable=false)
	public double getAlike() {
		return alike;
	}

	public void setAlike(double alike) {
		this.alike = alike;
	}

	@Override
	public String toString() {
		return "ReaderAlike [readerid1=" + readerid1 + ", readerid2=" + readerid2 + ", alike=" + alike + "]";
	}
	
}
